package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

import DTO.ContactDTO;

public class ContactDAO {

	private ArrayList<ContactDTO> numbers = new ArrayList<>();

	//	private String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	//	private String dbID = "kedu";
	//	private String dbPW = "kedu";
	//
	//	private Connection getConnection() throws Exception{
	//		return DriverManager.getConnection(dbURL, dbID, dbPW);  
	//	}

	public static BasicDataSource bds = new BasicDataSource();
	public ContactDAO() {
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("kedu");
		bds.setPassword("kedu");
		bds.setInitialSize(20);
	}

	private Connection getConnection()throws Exception{
		return bds.getConnection();		
	}


	// 등록 
	public int insert(ContactDTO dto)throws Exception{
		String sql = "insert into contact values(contact_seq.nextval, ?, ?, ?)";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql)){
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getPhone());
			pstat.setTimestamp(3, dto.getDate());
			int result = pstat.executeUpdate();
			return result;
		}
	}


	// 출력
	public ArrayList<ContactDTO>selectAll()throws Exception{
		String sql = "select * from contact order by 1";
		try(Connection con = this.getConnection();		
				PreparedStatement pstat = con.prepareStatement(sql);
				ResultSet rs = pstat.executeQuery();){
			ArrayList<ContactDTO>array = new ArrayList<>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				Timestamp ts = rs.getTimestamp("reg_date");
				array.add(new ContactDTO(id,name,phone,ts));
			}
			return array;
		}
	}


	// 삭제
	public int deleteById(int id)throws Exception{
		String sql = "delete from contact where id=?";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setInt(1, id);
			int result = pstat.executeUpdate();
			return result;
		}
	}


	// 수정
	public int updateMenu(int id,String name,String phone)throws Exception{
		String sql = "update contact set name = ?,phone= ? where id =?";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1, name);
			pstat.setString(2, phone);
			pstat.setInt(3, id);
			int result = pstat.executeUpdate();
			return result;
		}
	}


	// 검색
	public ArrayList<ContactDTO> SearchByName(String searchname)throws Exception{

		// PreparedStatement 사용 시 주의사항 2가지
		// 1. select 쿼리를 사용하는데 ? 가 필요한 경우 try with resource를 2중으로 사용해야 함.
		// 2. like 구문을 사용하는 경우 pstat.set 위치에 %data% 를 세팅해야 함.
		String sql = "select * from contact where name like ?";
		try(Connection con = this.getConnection();		
				PreparedStatement pstat = con.prepareStatement(sql);){

			pstat.setString(1, "%"+searchname+"%");
			try(ResultSet rs = pstat.executeQuery();){
				ArrayList<ContactDTO>list = new ArrayList<>();
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String phone = rs.getString("phone");
					Timestamp ts = rs.getTimestamp("reg_date");
					list.add(new ContactDTO(id,name,phone,ts));
				}
				return list;
			}
		}
	}

	// 중복체크
	public boolean tf(int id) throws Exception {
		String sql = "Select * from contact where id = ?";
		try(Connection con = this.getConnection();		
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setInt(1, id);		
			try(ResultSet rs = pstat.executeQuery();) {
				boolean result = rs.next();
				return result;
			}
		}
	}
}
