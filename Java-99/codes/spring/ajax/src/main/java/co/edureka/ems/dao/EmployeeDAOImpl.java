package co.edureka.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.ems.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public Employee findEmployeeByNo(final int eno) {
		Employee emp = null;

		String sql = "select ename, sal from emp where empno = " + eno;

		try {
			emp = jt.queryForObject(sql, new RowMapper<Employee>() {
				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					String name = rs.getString(1);
					float sal = rs.getFloat(2);

					Employee em = new Employee(eno, name, sal);
					return em;
				}
			});
		} catch (Exception ex) {}

		return emp;		
	}

}
