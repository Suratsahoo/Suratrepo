package home.ss.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import home.ss.bo.Profile;

public class ProfileDao {
	
	private DataSource ds;
	private static final String TABLE_INSERT_QUERY="INSERT INTO FAALTU VALUES(?,?,?)";
	public ProfileDao(DataSource ds) {
		this.ds=ds;
		
	}
	public ProfileDao() {}
	
	public int inserrt(Profile bo1)
	{
		int result=0;
		try {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(TABLE_INSERT_QUERY);
		ps.setInt(1, bo1.getSno());
		ps.setString(2, bo1.getName());
		ps.setInt(3, bo1.getPhone());
		result=ps.executeUpdate();
		
		
		}
		catch(SQLException se){
			se.printStackTrace();
		      
			
		}
		catch(Exception e) {
		e.printStackTrace();
		
	}
		return result;
   
}

}
