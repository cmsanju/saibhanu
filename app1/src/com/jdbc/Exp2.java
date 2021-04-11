package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Exp2 {
	
	public static void main(String[] args) throws Exception
	{
		
	
	
			//step 1 : load the driver class
			Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
			
			//step 2 : create the connection object  "jdbc:oracle:thin:@localhost:1521:xe", "system", "Java"
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "password");
			
			con.setAutoCommit(false);
			
			//step 3 : create statement object
			//PreparedStatement pst = con.prepareStatement("insert into mpl values(?,?,?)");
			//PreparedStatement pst = con.prepareStatement("update mpl set name = ?, city = ? where id = ?");
			
			PreparedStatement pst = con.prepareStatement("delete from mpl where id = ?");
			
			
			pst.setInt(1, 201);
			
			pst.execute();
			
			con.commit();
			con.rollback();
			
			System.out.println("Done.");
			
	}
}
