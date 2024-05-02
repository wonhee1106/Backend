package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;


import dto.BoardDTO;

public class BoardDAO {

	public static BasicDataSource bds = new BasicDataSource();
	public BoardDAO() {
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("kedu01");
		bds.setPassword("kedu01");
		bds.setInitialSize(20);
	}

	private Connection getConnection()throws Exception{
		return bds.getConnection();
	}

	// 작성
	public int addwrite(BoardDTO bdto)throws Exception{
		String sql = "insert into Board values(board_seq.nextval,?,?,?)";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql)){
			pstat.setString(1, bdto.getWriter());
			pstat.setString(2, bdto.getContents());
			pstat.setTimestamp(3, bdto.getWrite_date());
			int result = pstat.executeUpdate();
			return result;
		}
	}
	
	// 출력
	public ArrayList<BoardDTO>selectAll()throws Exception {
		String sql = "select * from board order by 1";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				ResultSet rs = pstat.executeQuery();){
			ArrayList<BoardDTO>array = new ArrayList<>();
			while(rs.next()) {
				int seq = rs.getInt("seq");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				Timestamp write_date = rs.getTimestamp("write_date");
				array.add(new BoardDTO(seq,writer,contents,write_date));				
			}
			return array;
		}
	}
	
	
	// 검색
	public ArrayList<BoardDTO>SearchByWriter(String searchwriter)throws Exception{
		String sql = "select * from board where writer like ?";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1, "%"+searchwriter+"%");
			try(ResultSet rs = pstat.executeQuery();){
				ArrayList<BoardDTO>list = new ArrayList<>();
				while(rs.next()) {
					int seq = rs.getInt("seq");
					String writer = rs.getString("writer");
					String contents = rs.getString("contents");
					Timestamp write_date = rs.getTimestamp("write_date");
					list.add(new BoardDTO(seq,writer,contents,write_date));
				}
				return list;
			}
		}
	}
	
	//중복체크
	public boolean tf(int seq) throws Exception{
		String sql = "select * from board where seq = ?";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setInt(1, seq);
			try(ResultSet rs = pstat.executeQuery();){
				boolean result = rs.next();
				return result;
			}
			
			
		}
	}
	
	
	// 수정
	public int updateList(int seq,String writer, String contents,Timestamp write_date) throws Exception{
		String sql = "update board set writer = ?, contents = ?, write_date = ?";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setString(1, writer);
			pstat.setString(2, contents);
			pstat.setTimestamp(3, write_date);
			int result = pstat.executeUpdate();
			return result;
		}
	}
	
	
	// 삭제
	public int deleteBySeq(int seq)throws Exception{
		String sql = "delete from board where seq = ?";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);){
			pstat.setInt(1, seq);
			int result = pstat.executeUpdate();
			return result;
		}
	}
}
