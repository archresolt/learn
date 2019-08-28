package thebatch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import util.JdbcTest;

public class TestBatch {
public static void main(String[] args) throws SQLException {
	Connection conn =JdbcTest.getConn();
   Statement stmt =	conn.createStatement();
   stmt.addBatch("insert into emp e (empno,ename) values ('1010','wangcai0')");
   stmt.addBatch("insert into emp e (empno,ename) values ('1011','wangcai1')");
   stmt.addBatch("insert into emp e (empno,ename) values ('1012','wangcai2')");
   int [] arr = stmt.executeBatch();
   System.out.println(Arrays.toString(arr));
   
   //预处理块的批处理
//   String sql = ("insert into emp i (empno,ename) values ('1010','wangcai0')");
   String sql = ("insert into emp i (empno,ename) values (?,?)");
   PreparedStatement pstmt = conn.prepareStatement(sql);
   pstmt.setInt(1, 1020);
   pstmt.setString(2,"wangcai20");
   pstmt.setInt(1, 1021);
   pstmt.setString(2,"wangcai21");
   pstmt.setInt(1, 1022);
   pstmt.setString(2,"wangcai22");
   pstmt.addBatch();
   pstmt.executeBatch();
   
   
}
}
