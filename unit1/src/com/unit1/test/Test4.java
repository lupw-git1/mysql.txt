package com.unit1.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.utit.util.Getconnection;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection conn=null;
		 Statement stml=null;
	try {		
				conn=Getconnection.getConn();
				
				Scanner s=new Scanner(System.in);
				System.out.println("������ID");
				int id=s.nextInt();
				System.out.println("����");
				String name=s.next();
				System.out.println(name);
				System.out.println("�۸�");
				int price=s.nextInt();
				String sql="insert into stu(ID,name,price)"+ "values("+id+","+'"'+name+'"'
				+","+price+")";
				Statement stmt=conn.createStatement();
				boolean rs=stmt.execute(sql);
				
				
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	

}
}
