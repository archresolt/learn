package jdbc02;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import util.JdbcTest;

public class TestStmt {
	public static void main(String[] args) throws SQLException {
		Connection conn = JdbcTest.getConn();
		Statement stmt = conn.createStatement();
		String sql = "create table test004 (name varchar2(10),age number(3)";
		// ִ��ddl���
		//boolean b = stmt.execute(sql);
		sql = "delete from EMP e where e.ename = 'MILLER'";
		int n = stmt.executeUpdate(sql);
		System.out.println(n);
		
		/*String userName = "����";
		String psw = "123";
		sql = ""*/
	}
}
