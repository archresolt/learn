package testPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JdbcTest;

public class TestPreparedStatement {
public static void main(String[] args) throws SQLException {
	//�������ݿ�����
	Connection conn = JdbcTest.getConn();
	//����һ��Ԥ������
	/*String sql = "select * from emp e where e.deptno = ? and job = ?";//��ʱ���൱��һ��ռλ��
	PreparedStatement pstmt  = conn.prepareStatement(sql); 
	//���ò���
	pstmt.setInt(1, 20);
	pstmt.setString(2, "CLERK");
	//ִ��sql���
	ResultSet set = pstmt.executeQuery();
	while(set.next()){
		System.out.println(set.getInt(1));
		System.out.println(set.getString(2));
		System.out.println(set.getString("deptno"));
		System.out.println(set.getString("job"));
	}*/
	
	//����һ��Ԥ�����飬��ִ��һ������Ĳ���
	/*PreparedStatement pstmt = conn.prepareStatement("insert into test02 (stuid,stuno) values(?,?)");
	pstmt.setInt(1,100);
	pstmt.setString(2,"10");
	int n = pstmt.executeUpdate();
	System.out.println(n);*/
	
	//����һ��Ԥ�����飬��ִ��һ���������ݵĲ���
	//String sql = "SMITH e set e.sal = ? where e.ename = ?";
	String sql = "update emp  e set e.sal = ? where e.ename = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1,10000);//1�����һ���ʺ�
	pstmt.setString(2,"wangcai0");
	int n = pstmt.executeUpdate();
	System.out.println(n);


	
}
}