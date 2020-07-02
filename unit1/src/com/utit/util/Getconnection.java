package com.utit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Getconnection {
	private static Connection conn=null;
	private static String address = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
	private static String dabaBaseName="root";
	private static String dataBasePwd="123456";
	
	public static Connection getConn() throws ClassNotFoundException {
		if( conn==null) {
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(address,dabaBaseName,dataBasePwd);
			} catch (SQLException e) {
				System.out.print("Ê§°Ü");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
}
