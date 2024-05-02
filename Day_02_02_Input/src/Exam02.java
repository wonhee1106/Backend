import java.util.Scanner; // ctrl + shift + O = Auto Import

public class Exam02 {
	public static void main(String[] args) {
		
		// 문자열 또는 큰 숫자를 입력받는 방법.
		Scanner sc = new Scanner(System.in); // 문자열을 입력받기 위해 필요한 도구
		
		System.out.println("메모를 남겨주세요.");
		
		String str = sc.nextLine(); 			// 문자열을 입력받아 변수에 저장하는 코드
		int num = Integer.parseInt(str);		// 입력받은 문자열을 숫자로 변환하는 코드
		System.out.println(num + 100); // int보다 string이 더 범위가 큼으로 string에 기준이 맞춰짐
	}
}
