package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception {			
		
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		String sql = "insert into emp(empno,ename,sal) values(102, 'Praveen', 3500.5), (103, 'Sunil',2750.75), "
				+ "(104, 'Shankar', 7475), (105, 'Sujith', 2800), (106,'Bharath',8500)";
		
		try {
			int employeesSaved = st.executeUpdate(sql);
			System.out.println("Employees Saved - " + employeesSaved);
		}catch(Exception ex) {
			System.err.println("ERROR - " + ex.getMessage());
		}
		
		st.close();
		con.close();

	}

}
