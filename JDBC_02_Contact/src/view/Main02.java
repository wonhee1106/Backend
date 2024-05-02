package view;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main02 {
	public static void main(String[] args)throws Exception {
		
		// DBMS 테이블에 날짜 컬럼을 Timestamp로 지정했다는 전제하에 예제		
		// 사용자 날짜 입력 -> Timestamp (or Date) 으로 변환
		Scanner sc = new Scanner(System.in);
		
		System.out.print("날짜 입력 (년도/월/일) : ");
		String inputDate = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
		java.util.Date parsed = sdf.parse(inputDate);
		
//		java.sql.Date reg_date = new java.sql.Date(parsed.getTime());		
//		Timestamp reg_date = new Timestamp(parsed.getTime());
		
		//-------------------------------------------------------------
		
		// Timestamp -> Format String
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yy/MM/dd");
//		Timestamp reg_date = /*DB에서 꺼낸 값*/;
//		sdf.format(parsed);
		
		
		
		
		
		
		
		// Timestamp(or Date) -> Format String 변환
		
	}
}
