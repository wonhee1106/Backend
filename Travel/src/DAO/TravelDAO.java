package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.TravelDTO;

public class TravelDAO {



	private String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private String dbID = "kedu";
	private String dbPW = "kedu";

	private Connection getConnection()throws Exception{
		return DriverManager.getConnection(dbURL, dbID, dbPW);
	}

	//등록
	public int addnum(TravelDTO dto)throws Exception{
		String sql = "insert into travel values(travel_seq.nextval,?,?,?)";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql)){
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getPhone());
			pstat.setString(3, dto.getSpot());
			int result = pstat.executeUpdate();
			return result;
		}
	}

	public ArrayList<TravelDTO>selectAll()throws Exception{
		String sql = "select * from travel order by 1";
		try (Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				ResultSet rs = pstat.executeQuery();){
			ArrayList<TravelDTO>tourists = new ArrayList<>();
			while(rs.next()) {
				int code = rs.getInt("code");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String spot = rs.getString("spot");
				tourists.add(new TravelDTO(code,name,phone,spot));
			}
			return tourists;
		}
	}
	
	// 검색
	public ArrayList<TravelDTO>searchByName(String searchname)throws Exception{
		String sql = "select * from travel where name like ?";
		try(Connection con = this.getConnection();	
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1,"%"+searchname+"%");
			try(ResultSet rs = pstat.executeQuery();){
				ArrayList<TravelDTO>list = new ArrayList<>();
				while(rs.next()) {
					int code = rs.getInt("code");
					String name = rs.getString("name");
					String phone = rs.getString("phone");
					String spot = rs.getString("spot");
					list.add(new TravelDTO(code,name, phone,spot));
				}
				return list;
			}
		}
				
	}
	
	// 삭제
	public int deleteByCode(int code)throws Exception{
		String sql = "delete from travel where code = ?";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setInt(1, code);
			int result = pstat.executeUpdate();
			return result;
		}
	}
	
	
	// 수정
	public int updateData(int code, String name,String phone,String spot)throws Exception{
		String sql = "update travel set name = ?,phone = ?,spot = ? where code = ?";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1, name);
			pstat.setString(2, phone);
			pstat.setString(3, spot);
			int result = pstat.executeUpdate();
			return result;
		}
		
	}
	
	
	
	
	
	
	
	// 중복체크
	public boolean tf(int code)throws Exception{
		String sql = "select * from travel where code = ? ";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setInt(1, code);
			try(ResultSet rs = pstat.executeQuery();){
				boolean result = rs.next();
				return result;
			}
		}
	}
}

