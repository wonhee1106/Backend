import java.util.Scanner;
public class Exam01 {
	public static void main(String[] args) {

		// Checked Exception - 코딩과 동시에 문법검사기에 의해 에러(예외)가 발생할 가능성을 바로 감지하는 종류
		// ex> System.in.read();

		// UnChecked Exception - 코딩 시점엔 문법검사기에게 감지되지 않다가 Runtime (실행이후) 에 발생하는 종류
		// ex> Integer.parseInt(sc.nectLine()); <-- 이 코드에서 문자 입력 시

		// 예외에 대처할 수 있는 방법 두가지
		// 1. 예외 전가 - throws

		// 2. 예외 처리 - try ~ catch
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.print("숫자만 입력하세요 : ");
			Integer.parseInt(sc.nextLine()); // 여기서 오류가 없으면 21에서 25로 바로 넘어감 만약 여기서 오류가 있다면 21이 실행되지 않고 23에서 25로 실행됨 
			System.out.println("입력 확인");
		}catch(Exception e) {
			System.out.println("숫자만 입력하세요!");
		}
		System.out.println("프로그램 정상 종료");
	}
}
