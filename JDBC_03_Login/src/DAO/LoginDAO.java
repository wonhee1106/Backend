package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.dbcp2.BasicDataSource;

public class LoginDAO {

	public static BasicDataSource bds = new BasicDataSource();
	public LoginDAO() {
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("kedu");
		bds.setPassword("kedu");
		bds.setInitialSize(20);
	}
	private Connection getConnection() throws Exception{
		return bds.getConnection();
	}


	public boolean login(String id,String pw) throws Exception {
		String sql = "select * from members where id= ? and pw=?";
		try(Connection con = this.getConnection();		
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1, id);
			pstat.setString(2, pw);
			try(ResultSet rs = pstat.executeQuery();){
				return rs.next();	
			}
		}
	}

	public int insert(String id,String pw,String name)throws Exception{
		String sql = "insert into members values(?,?,?)";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1, id);
			pstat.setString(2, pw);
			pstat.setString(3, name);
			int rs = pstat.executeUpdate();
			return rs;
		}
	}
}



// Statement -> ( 보안성, 성능, 편의성 ) -> PreparedStatement
