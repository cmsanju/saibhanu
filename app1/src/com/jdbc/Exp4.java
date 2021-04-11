package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Exp4 {
	
	public static void main(String[] args)throws Exception 
	{
		
		//step 1 : load the driver class
		Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
		
		//step 2 : create the connection object  "jdbc:oracle:thin:@localhost:1521:xe", "system", "Java"
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "password");
		
		con.setAutoCommit(false);
		
		//step 3 : create statement object
		
		CallableStatement cst = con.prepareCall("{call insertR(?,?,?)}");
		
		
	}

}
