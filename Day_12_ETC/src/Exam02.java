import java.text.SimpleDateFormat;

public class Exam02 {
	public static void main(String[] args) {
		
		// Timestamp - > String(형식을 갖춘..)
		
		long ctime = System.currentTimeMillis(); // 현재 Timestamp 추출
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd(E) hh:mm:ss"); // 어떤 형식으로 보여줄지 결정 월을 작성할때는 무조건 대문자 M
		
		String result = sdf.format(ctime); // Timestamp를 형식에 맞게 반환하는 메서드 호출
		
		System.out.println("결과 : " + result);
		
		
		
	}
}
