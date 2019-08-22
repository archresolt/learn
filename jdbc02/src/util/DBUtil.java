package util;

import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {
	/**
	 * 通用查询
	 * 
	 * @param sql
	 *            查询的sql语句
	 * @param className
	 *            要将sql查询的结果封装成className 类型的对象
	 * @return
	 */
	public static List<Object> select(String sql, String className) {
		ArrayList<Object> list = null;
		try {
			// 通过类名来获取类的反射
			Class cls = Class.forName(className);
			// 通过反射获取到该类中所包含的成员变量
			Field[] fs = cls.getDeclaredFields();

			// 执行sql语句 获取查询结果
			Statement stmt = JdbcTest.getStatement();
			ResultSet set = stmt.executeQuery(sql);
			// 获取查询结果的信息
			ResultSetMetaData metaData = set.getMetaData();
			// 获取查询结果有多少列
			int columnCount = metaData.getColumnCount();
			// 创建一个数组 用来存放每一列的名字
			String[] columnName = new String[columnCount];
			for (int i = 1; i <= columnName.length; i++) {
				columnName[i - 1] = metaData.getColumnName(i);
			}

			// 创建一个list 来存放解析出来的对象
			list = new ArrayList<Object>();
			while (set.next()) {
				// 结果集中有一条新的数据 创建一个对象来存放这条数据
				Object obj = cls.newInstance();
				list.add(obj);
				// 循环存放列名的数组，循环一次得到一个列的名字
				for (String colName : columnName) {
					// 寻找和列明同名的属性，将该类的值赋给该属性
					for (Field field : fs) {
						// 如果属性和列名同名，则获取该列的值，给对象这个属性去赋值
						if (colName.toUpperCase().equals(
								field.getName().toUpperCase())) {
							// 判断该属性的类型
							if ("java.lang.String".equals(field.getType()
									.getName())) {
								// 如果是字符串类型
								String value = set.getString(colName);
								field.set(obj, value);
							} else if ("int".equals(field.getType().getName())
									|| "java.lang.Integer".equals(field
											.getType().getName())) {
								// 如果是整数类型
								int value = set.getInt(colName);
								field.set(obj, value);
							} else if ("java.sql.Date".equals(field.getType()
									.getName())) {
								// 如果是日期的类型
								Date date = set.getDate(colName);
								field.set(obj, date);
							} else if ("float"
									.equals(field.getType().getName())) {
								float vlaue = set.getFloat(colName);
								field.set(obj, vlaue);
							}
						}
					}

				}

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public static int insert(List<Object> list) {
		int n = 0;
		try {
			n = insert01(list);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	/**
	 * 
	 * @param list
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws SQLException
	 */
	private static int insert01(List<Object> list)
			throws IllegalArgumentException, IllegalAccessException,
			SQLException {
		if (list.size() == 0) {
			return 0;
		}
	
		for (int i = 0; i < list.size(); i++) {
			Object object = list.get(i);
			insert(object);
		}


		return 0;
	}

	/**
	 * 插入一个对象的方法
	 * @param obj
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws SQLException
	 */
	
	public static int insert(Object obj) {
		int n = 0;
		try {
			n = insert01(obj);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	private static int insert01(Object obj) throws IllegalArgumentException, IllegalAccessException, SQLException {
		Class cls = obj.getClass();
		// 获取类的名字
		String className = cls.getName();

		// 因为获取到的类名是包名加类名，截取类名
		int index = className.lastIndexOf(".");
		className = className.substring(index + 1);
		System.out.println(className);

		// 通过反射获取到类中包含的所有的成员变量
		Field[] fs = cls.getDeclaredFields();
		// insert into EMP (,,,,,,,,)values(?,?,?,?,?,?,?,?);
		// 我们现在所要做的事情就是 将同名的属性的值 插入到数据库同名的列中
		// 拼接sql语句
		String sql = "insert into " + className + "(";
		for (int i = 0; i < fs.length; i++) {
			Field field = fs[i];
			if (i < fs.length - 1) {
				sql += field.getName() + ",";
			} else {
				sql += field.getName() + ")";
			}
		}
		sql += "values (";

		for (int i = 0; i < fs.length; i++) {
			if (i < fs.length - 1) {
				sql += "?,";
			} else {
				sql += "?)";
			}
		}
		System.out.println(sql);

		// 获取一个预处理块
		PreparedStatement pstmt = JdbcTest.getPreparedStatement(sql);
		Object object = obj;
		for (int j = 0; j < fs.length; j++) {
			Field field = fs[j];
			if (field.getType().getName().equals("java.lang.String")) {
				String value = (String) field.get(object);
				pstmt.setString(j + 1, value);
			} else if ("int".equals(field.getType().getName())) {
				int value = field.getInt(object);
				pstmt.setInt(j + 1, value);
			} else if ("java.sql.Date".equals(field.getType().getName())) {
				Date value = (Date) field.get(object);
				pstmt.setDate(j + 1, value);
			} else if ("float".equals(field.getType().getName())) {
				float value = field.getFloat(object);
				pstmt.setFloat(j + 1, value);
			}

		}
		pstmt.executeUpdate();
		

		return 0;
	}
}