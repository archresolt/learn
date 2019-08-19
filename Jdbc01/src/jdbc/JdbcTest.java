package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	public static Connection getConn() {
		String Driver = "oracle.jdbc.driver.OracleDriver"; // 连接数据库的方法
		String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; // orcl为数据库的SID
		String Username = "scott"; // 用户名
		String Password = "123"; // 密码
		// 得到一个Connection的对象
		Connection con = null;
		try {
			Class.forName(Driver);// 加载驱动
			con = DriverManager.getConnection(URL, Username, Password);
			DatabaseMetaData metaData = con.getMetaData();
			//通过数据库的详情对象来获取数据库相关的信息
			System.out.println(metaData.getDatabaseProductVersion());
			ResultSet set = metaData.getTables(con.getCatalog(),"SCOTT",null,new String[]{"TABLE"});
			while(set.next()){
				System.out.println(set.getString("TABLE_NAME"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} // 加载数据库驱动
		System.out.println(con);
		//连接到数据库之后可以执行增删改查的sql语句
		//还可以获取数据库的相关信息
		return con;
		
}
	
}