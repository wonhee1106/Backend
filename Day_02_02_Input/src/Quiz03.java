import java.util.Scanner;

public class Quiz03 {
public static void main(String[] args) {
	// 두개의 정수를 입력받아, 덧셈한 결과를 출력하는 프로그램을 작성하세요.
			// UI에 신경 써서 만들어주세요
	Scanner sc = new Scanner(System.in);
	
	
	int num = Integer.parseInt(sc.nextLine());
	System.out.print("첫번째 값을 입력해주세요.");
	System.out.print("두번째 값을 입력해주세요.");
	int num2 = Integer.parseInt(sc.nextLine());
	
	int num3 = num + num2;
	
	System.out.println(num+"+"+num2+ "=" + num3);
}
}
