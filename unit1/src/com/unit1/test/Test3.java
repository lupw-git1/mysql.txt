package com.unit1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		String address = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
		String dabaBaseName="root";
		String dataBasePwd="123456";
		
		
			
			try{
				//����jdbc ����
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(address,dabaBaseName,dataBasePwd);
				System.out.println("ok");
				String sql="select * from stu";
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.println(rs.getString("name"));
				}
				
		}catch(Exception e){
			System.out.println("����");
			e.printStackTrace();
		}finally{
			System.out.println("no");
			try{
				conn.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	

}
}

