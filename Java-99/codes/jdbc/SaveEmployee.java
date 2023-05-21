package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {			
		
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(101, 'Sanjay', 2500)";
		
		try {
			int employeesSaved = st.executeUpdate(sql);
			System.out.println("Employee Saved");
		}catch(Exception ex) {
			System.err.println("ERROR - " + ex.getMessage());
		}
		
		st.close();
		con.close();

	}

}
