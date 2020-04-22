package ho.per.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import ho.per.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY="INSERT INTO SP_STUDENT VALUES(?,?,?,?,?)";
	private DataSource ds;

	public StudentDAOImpl(DataSource ds) {
		this.ds=ds;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(StudentBO bo) {
		try {
			Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(STUDENT_INSERT_QUERY);
			ps.setInt(1,bo.getSno());
			ps.setString(2,bo.getSname());
			ps.setInt(3,bo.getTotal());
			ps.setFloat(4,bo.getAvg());
			ps.setString(5,bo.getResult());
			int result=ps.executeUpdate();
			return result;
		}
		catch(SQLException se) {
		return 0;
	}
		catch(Exception e) {
			return 0;
		}

}
}
