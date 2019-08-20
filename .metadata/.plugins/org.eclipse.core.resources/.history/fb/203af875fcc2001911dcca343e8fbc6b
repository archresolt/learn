package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class TestStstament {
	public static void main(String[] args) throws SQLException {
		// 通过工具类来获取数据库的连接
		Connection conn =JdbcTest.getConn();
		// 通过数据库的连接，获取一个静态处理快，用来执行封装好的sql语句
		Statement stmt = conn.createStatement();

		// 拼接sql语句
		String sql = "update emp e set e.sal = 15000 where e.ename = 'MILLER'";
		//用于执行一个更新语句
		int i = stmt.executeUpdate(sql);
		System.out.println(i);
		
		String sql1 = "select * from emp e";
		ResultSet set = stmt.executeQuery(sql1);
		
		while (set.next()){//第一次调next相当于游标放在第一行
			System.out.print(set.getInt("EMPNO"));
			// System.out.println(set.getInt(1));
			System.out.print(set.getString("JOB"));//并不区分大小写
			System.out.println(set.getString("SAL"));
		}
		/*String sql = "select* form emp e ";
		 * ResultSet set = stmt.excuteQuery(sql1);
		 * ArrayList<ENP> list = new ArrayList<EMP>();
		 * while (set.next()){
		 * EMP emp = new EMP();
		 * list.add(emp);
		 * emp.setEmpNo(set.getInt(1));
		 * emp.setEname(set.getString(2));
		 * emp.setJob(set.getString(3));
		 * 
		 * }
		 * 
		 */
		
	}
}
