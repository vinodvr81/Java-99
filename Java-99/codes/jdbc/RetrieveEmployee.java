package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployee {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from emp");
		//ResultSet rs = st.executeQuery("select * from emp where sal order by sal desc  limit 1,1");
		//ResultSet rs = st.executeQuery("select * from emp where sal = (select sal from emp order by sal desc limit 1,1)");
		
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getNString(2);
			float sal = rs.getFloat("sal"); //rs.getFloat(3);
			
			System.out.printf("%-3d | %-12s %.2f \n", eno, name, sal);
			Thread.sleep(2000);
		}
		st.close();
		con.close();
		

	}

}
