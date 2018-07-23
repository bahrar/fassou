package database;

import java.sql.Connection;
import java.sql.SQLException;

import org.postgresql.ds.PGPoolingDataSource;

public class Connect {
	private Connection con =null;
	
	public  Connection getConnection(){
		PGPoolingDataSource source = new PGPoolingDataSource();
		source.setDataSourceName("yassou_fact");
		source.setServerName("localhost");
		source.setDatabaseName("yassou_fact");
		source.setUser("yassou");
		source.setPassword("root");
		try {
			con = source.getConnection();
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void Deconnect(){
		if(con!=null){
			con=null;
		}
		
	}

}
