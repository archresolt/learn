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
	 * ͨ�ò�ѯ
	 * 
	 * @param sql
	 *            ��ѯ��sql���
	 * @param className
	 *            Ҫ��sql��ѯ�Ľ����װ��className ���͵Ķ���
	 * @return
	 */
	public static List<Object> select(String sql, String className) {
		ArrayList<Object> list = null;
		try {
			// ͨ����������ȡ��ķ���
			Class cls = Class.forName(className);
			// ͨ�������ȡ���������������ĳ�Ա����
			Field[] fs = cls.getDeclaredFields();

			// ִ��sql��� ��ȡ��ѯ���
			Statement stmt = JdbcTest.getStatement();
			ResultSet set = stmt.executeQuery(sql);
			// ��ȡ��ѯ�������Ϣ
			ResultSetMetaData metaData = set.getMetaData();
			// ��ȡ��ѯ����ж�����
			int columnCount = metaData.getColumnCount();
			// ����һ������ �������ÿһ�е�����
			String[] columnName = new String[columnCount];
			for (int i = 1; i <= columnName.length; i++) {
				columnName[i - 1] = metaData.getColumnName(i);
			}

			// ����һ��list ����Ž��������Ķ���
			list = new ArrayList<Object>();
			while (set.next()) {
				// ���������һ���µ����� ����һ�������������������
				Object obj = cls.newInstance();
				list.add(obj);
				// ѭ��������������飬ѭ��һ�εõ�һ���е�����
				for (String colName : columnName) {
					// Ѱ�Һ�����ͬ�������ԣ��������ֵ����������
					for (Field field : fs) {
						// ������Ժ�����ͬ�������ȡ���е�ֵ���������������ȥ��ֵ
						if (colName.toUpperCase().equals(
								field.getName().toUpperCase())) {
							// �жϸ����Ե�����
							if ("java.lang.String".equals(field.getType()
									.getName())) {
								// ������ַ�������
								String value = set.getString(colName);
								field.set(obj, value);
							} else if ("int".equals(field.getType().getName())
									|| "java.lang.Integer".equals(field
											.getType().getName())) {
								// �������������
								int value = set.getInt(colName);
								field.set(obj, value);
							} else if ("java.sql.Date".equals(field.getType()
									.getName())) {
								// ��������ڵ�����
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
	 * ����һ������ķ���
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
		// ��ȡ�������
		String className = cls.getName();

		// ��Ϊ��ȡ���������ǰ�������������ȡ����
		int index = className.lastIndexOf(".");
		className = className.substring(index + 1);
		System.out.println(className);

		// ͨ�������ȡ�����а��������еĳ�Ա����
		Field[] fs = cls.getDeclaredFields();
		// insert into EMP (,,,,,,,,)values(?,?,?,?,?,?,?,?);
		// ����������Ҫ����������� ��ͬ�������Ե�ֵ ���뵽���ݿ�ͬ��������
		// ƴ��sql���
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

		// ��ȡһ��Ԥ�����
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