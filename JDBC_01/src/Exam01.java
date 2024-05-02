import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) throws Exception {


		// 기존 코드는 ArrayList에 저장하고 있음.
		// DAO 내의 addCafe 기능의 내용이 DBMS로 데이터를 저장하는 코드로 변경되어야 함.

		// * 실전 코드
		// DBMS ( localhost -1521 ) 에 연결시도
		// OJDBC ( Oracle Java DataBase Connectivity ) 라이브러리



		Scanner sc = new Scanner(System.in);

		System.out.print("메뉴 이름 : ");
		String name = sc.nextLine();

		System.out.print("메뉴 가격 : ");
		int price = Integer.parseInt(sc.nextLine());

		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbID = "kedu";
		String dbPW = "kedu";


		// DBMS에 접속
		//		Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);



		// -> 보안성, 성능(con.prepareStatement(dbPW)), 편의성 ?
		// -> PreparedStatement
		// - 주의사항. select 쿼리 + ? 로 구성되는 경우 try with resource를 2중으로 사용해야함.
		// - like 구문 사용할 때, %를 사용하는 방법
		
		// * 패스워드 암호화 ( SHA-512 )
		
		// * 예외처리에 대한 문법 경우의 수
		



		// kedu 계정에 cafe 테이블 생성하기
		// id 숫자 (주키) / name 문자(100) not null /price 숫자 not null
		// kedu 계정에 cafe_seq 시퀀스 생성하기
		// 1001 부터 무한대까지 1씩 증가 nocache처리
		// Query 쓸수 있는 편집기 객체 확보
		//		Statement stat = con.createStatement();
		//		String sql = "insert into cafe values(cafe_seq.nextval, '"+ name +"', '"+price+"')";
		//		int result = stat.executeUpdate(sql);
		String sql = "insert into cafe values(cafe_seq.nextval,?,?)";	

		try(	
				Connection con = DriverManager.getConnection(dbURL, dbID, dbPW);
				PreparedStatement pstat = con.prepareStatement(dbPW);)
		{
			pstat.setString(1, name);
			pstat.setInt(2, price);
			int result = pstat.executeUpdate();

			if(result > 0) {
				System.out.println("입력 성공!");
			}
		}


		// stat.executeUpdate(); // Insert, Update, Delete
		// stat.executeQuery();  // Select
	}
}
