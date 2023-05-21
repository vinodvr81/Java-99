package co.edureka.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(106, 'employee-1', 2500)");
		st.addBatch("insert into emp values(107, 'employee-2', 2775)");		
		//st.addBatch("insert into emp values(107, 'employee-3', 3000)");
		st.addBatch("insert into emp values(108, 'employee-3', 3000)");
		st.addBatch("update emp set sal=2800 where empno>=106");
		
		try {
			int[] n = st.executeBatch();
			for(int x : n) {
				System.out.println("employees affected = " + x);
			}
			con.commit();
		}catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		
		st.close();
		con.close();
	}

}
