package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import org.apache.commons.dbcp2.BasicDataSource;

public class MembersDAO {

	public static BasicDataSource bds = new BasicDataSource();
	public MembersDAO() {
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("kedu01");
		bds.setPassword("kedu01");
		bds.setInitialSize(20);
	}

	private Connection getConnection()throws Exception{
		return bds.getConnection();
	}

	public boolean login(String id, String pw)throws Exception{
		String sql = "select * from members where id = ? and pw = ? ";
		try(Connection con =this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1, id);
			pstat.setString(2, pw);
			try(ResultSet rs = pstat.executeQuery();){
				return rs.next();
			}
		}
	}

	public int join(String id,String pw,String name,Timestamp ts)throws Exception{
		String sql = "insert into members values(?,?,?,?)";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1, id);
			pstat.setString(2, pw);
			pstat.setString(3, name);
			pstat.setTimestamp(4, ts);
			int rs = pstat.executeUpdate();
			return rs;
		}
	}	
}