package com.radha;
import java.sql.DriverManager;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class EmpJDBC {
Connection con;
Statement stmt;
ResultSet res;
	public static void main(String[] args)  throws SQLException,ClassNotFoundException{
	EmpJDBC emp= new EmpJDBC();
	emp.openConnection();
	emp.execute();

	}
  public void openConnection() throws SQLException
  {
	
      String dbName = "sample";
      String server="Vivek";
      String username="radha";
      String serverport="";
      String url="jdbc:sqlserver://localhost:1433;databaseName=master;integratedSecurity=true";

 

      
      String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
      String databaseUserName = "sa";
      String databasePassword = "saibaba2003";
      
      con= DriverManager.getConnection(url,username,"");
	  
	  
	  
	  
  }
  public void execute() throws SQLException
  {
	  stmt = con.createStatement();
	  res = stmt.executeQuery("select * from Emp");
	  int no=0;
	  String str="";
	  while (res.next())
	  {
		  no=res.getInt(1);
		  str=res.getString(2);
		  System.out.println("the output is ");
		  System.out.println("Radha"+no);
		  System.out.println("Radha"+str);
		  
		  
	  }
	  
  }
}
