package util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static Connection getConn() {
		String Driver = "oracle.jdbc.driver.OracleDriver"; // �������ݿ�ķ���
		String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; // orclΪ���ݿ��SID
		String Username = "scott"; // �û���
		String Password = "123"; // ����
		// �õ�һ��Connection�Ķ���
		Connection con = null;
		try {
			Class.forName(Driver);// ��������
			con = DriverManager.getConnection(URL, Username, Password);
			/*
			 * DatabaseMetaData metaData = con.getMetaData();
			 * //ͨ�����ݿ�������������ȡ���ݿ���ص���Ϣ
			 * System.out.println(metaData.getDatabaseProductVersion());
			 * ResultSet set =
			 * metaData.getTables(con.getCatalog(),"SCOTT",null,new
			 * String[]{"TABLE"}); while(set.next()){
			 * System.out.println(set.getString("TABLE_NAME")); }
			 */
		} catch (ClassNotFoundException | SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} // �������ݿ�����
		/* System.out.println(con); */
		// ���ӵ����ݿ�֮�����ִ����ɾ�Ĳ��sql���
		// �����Ի�ȡ���ݿ�������Ϣ
		return con;

	}

	public static Statement getStatement() {
		Connection connection = getConn();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}

	public static PreparedStatement getPreparedStatement(String sql) {
		Connection connection = getConn();
		PreparedStatement pstmt = null;

		try {
			pstmt = connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return pstmt;

	}
}