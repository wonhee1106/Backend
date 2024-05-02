package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DTO.CafeDTO;

public class CafeDAO {




	private ArrayList<CafeDTO> menus = new ArrayList<>();
	// DB접속
	private String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private String dbID = "kedu";
	private String dbPW = "kedu";

	// Wrapper Method - 
	private Connection getConnection() throws Exception{
		return DriverManager.getConnection(dbURL, dbID, dbPW);
	}


	// throws Exception 전가 코드의 이해 : 예외 건가를 적용한 callee method 가 caller method에게 전가함
	// 추가
	public int adddto(CafeDTO dto)throws Exception {
		String sql = "insert into cafe values(cafe_seq.nextval, '"+ dto.getName() +"', '"+dto.getPrice()+"')";
		try(Connection con = this.getConnection();		
				Statement stat = con.createStatement();){
			
			int result = stat.executeUpdate(sql);
			return result;
		}		
		//this.menus.add(menu);
	}


	// 메뉴 검색
	public ArrayList<CafeDTO> SearchByName(String searchname)throws Exception{
		String sql = "select * from cafe where name like'%"+searchname+"%'";
		try(Connection con = this.getConnection();		
				Statement stat = con.createStatement();
				ResultSet rs = stat.executeQuery(sql);){
			
			ArrayList<CafeDTO>list = new ArrayList<>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				list.add(new CafeDTO(id,name,price));
			}
			con.close();
			return list;
		}
	}

	
	// 메뉴 출력
	public List<CafeDTO> selectAll() throws Exception{
		String sql = "select * from cafe order by 1";
		try(Connection con = this.getConnection();		
				Statement stat = con.createStatement();
				ResultSet rs = stat.executeQuery(sql);){
			
			List<CafeDTO> array = new ArrayList<>();		
			while(rs.next()){
				int id = rs.getInt("id"); // rs.getInt(1);
				String name = rs.getString("name"); // rs.getString(2);
				int price = rs.getInt("price"); // rs.getInt(3);			
				array.add(new CafeDTO(id,name,price));			
			}
			con.close();
			return array;
		}	
	}


	
	// 메뉴 삭제
	public int deleteById(int id) throws Exception{
		String sql = "delete from cafe where id ="+id;
		try(Connection con = this.getConnection();		
				Statement stat = con.createStatement();){
			
			int result = stat.executeUpdate(sql);
			con.close();
			return result;
		}
	}

	//		for(int i = 0; i<menus.size();i++) {
	//			if(menus.get(i)=(id)) {
	//				menus.remove(i);
	//				break;
	//			}
	//		}
	//	}
	
	
	
	
	// 수정
	public int updateMenu(int id, String name, int price)throws Exception {
		String sql = "update cafe set name = '"+name+"', price = "+price+" where id="+id;
		try(Connection con = this.getConnection();		
				Statement stat = con.createStatement();){
			
			int result = stat.executeUpdate(sql);
			con.close();
			return result;
		}


		//			for(int i = 0; i<menus.size();i++) {
		//				if(menus.get(i)=(id)) {
		//					menus.get(i).setName(name);
		//					menus.get(i).setPrice(price);
		//				}
		//			}
	}

	// 아이디 중복체크
	public boolean tf(int id)throws Exception {
		String sql = "Select * from cafe where id = "+id;
		try(Connection con = this.getConnection();		
				Statement stat = con.createStatement();
				ResultSet rs = stat.executeQuery(sql); ){

			boolean result = rs.next();
			con.close();
			return result;
		}
	}

	public int getSize() {
		return this.menus.size();
	}



}
