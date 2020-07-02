package com.unit1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		String address = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
		String dabaBaseName="root";
		String dataBasePwd="123456";
		
		
			
			try{
				//¼ÓÔØjdbc Çý¶¯
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(address,dabaBaseName,dataBasePwd);
				System.out.println("ok");
		}catch(Exception e){
			System.out.println("³ö´í");
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