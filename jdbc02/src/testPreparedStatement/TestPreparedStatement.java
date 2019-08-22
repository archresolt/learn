package testPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JdbcTest;

public class TestPreparedStatement {
public static void main(String[] args) throws SQLException {
	//创建数据库连接
	Connection conn = JdbcTest.getConn();
	//创建一个预处理块
	/*String sql = "select * from emp e where e.deptno = ? and job = ?";//此时？相当于一个占位符
	PreparedStatement pstmt  = conn.prepareStatement(sql); 
	//设置参数
	pstmt.setInt(1, 20);
	pstmt.setString(2, "CLERK");
	//执行sql语句
	ResultSet set = pstmt.executeQuery();
	while(set.next()){
		System.out.println(set.getInt(1));
		System.out.println(set.getString(2));
		System.out.println(set.getString("deptno"));
		System.out.println(set.getString("job"));
	}*/
	
	//创建一个预处理块，来执行一个插入的操作
	/*PreparedStatement pstmt = conn.prepareStatement("insert into test02 (stuid,stuno) values(?,?)");
	pstmt.setInt(1,100);
	pstmt.setString(2,"10");
	int n = pstmt.executeUpdate();
	System.out.println(n);*/
	
	//创建一个预处理块，来执行一个更新数据的操作
	//String sql = "SMITH e set e.sal = ? where e.ename = ?";
	String sql = "update emp  e set e.sal = ? where e.ename = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1,10000);//1替代第一个问号
	pstmt.setString(2,"wangcai0");
	int n = pstmt.executeUpdate();
	System.out.println(n);


	
}
}
