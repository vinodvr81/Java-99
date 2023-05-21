package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to MySQL "db_edureka" database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		
		//-- create a provision for passing SQL queries to connected DB
		Statement st = con.createStatement();
		
		//-- perform the DB operations
		String sql = "create table emp(empno int(5), ename varchar(25), sal float(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("Database Table \"emp\" Created!!!");
		}catch(Exception ex) {
			System.err.println("DB Table could not be created - " + ex.getMessage());
		}
		
		//-- close the connection with DB
		st.close();
		con.close();
	}

}
