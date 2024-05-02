import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam04 {
	public static void main(String[] args) throws Exception {
		
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "kedu";
		String dbPW = "kedu";
		
		Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);		
		Statement stat = con.createStatement();
		
		String sql = "select * from cafe";
		
		// ResultSet은 쿼리 전달 후 발생한 결과의 주소를 가지는 인스턴스
		ResultSet rs = stat.executeQuery(sql);
		
		while(rs.next()){
		int id = rs.getInt("id"); // rs.getInt(1);
		String name = rs.getString("name"); // rs.getString(2);
		int price = rs.getInt("price"); // rs.getInt(3);
		
		System.out.println(id + " : " + name + " : " + price);
		}
		
		con.close();
//		rs.next();
//		id = rs.getInt("id"); // rs.getInt(1);
//		name = rs.getString("name"); // rs.getString(2);
//		price = rs.getInt("price"); // rs.getInt(3);
		
//		System.out.println(id + " : " + name + " : " + price);
		
		
//		rs.next();
//		id = rs.getInt("id"); // rs.getInt(1);
//		name = rs.getString("name"); // rs.getString(2);
//		price = rs.getInt("price"); // rs.getInt(3);
		
//		System.out.println(id + " : " + name + " : " + price);
	}
}
