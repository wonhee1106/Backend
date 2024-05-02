import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		// 두개의 정수를 입력받아, 덧셈한 결과를 출력하는 프로그램을 작성하세요.
		// UI에 신경 써서 만들어주세요.
		
		Scanner sc1 = new Scanner(System.in); // 문자열 입력을 위한 도구를 준비한다.
		Scanner sc2 = new Scanner(System.in); 
		
		System.out.println("메모를 남겨주세요.");
		System.out.println("첫번째 정수를 입력해주세요"); // 사용자가 보게될 안내메세지를 출력한다.
		String str1 = sc1.nextLine(); // 도구를 사용한다.
		int num1 = Integer.parseInt(str1); // 사용자가 입력한 값을 숫자로 변환하여 num1 변수에 보관한다.
		System.out.println("두번째 정수를 입력해주세요"); // 두번째로 사용자가 보게 될 안내 메세지를 출력한다.
		String str2 = sc2.nextLine();
		int num2 = Integer.parseInt(str2); // 사용자가 입력한 두번째 값을 숫자로 변환하여 num2 변수에 보관한다.
		
		int sum = num1 + num2;
		
		System.out.println("두 정수의 합은" + sum + "입니다"); // 보관 된 두개의 수를 덧셈하여 화면에 출력한다.
		
		 
		
		
		
		
		
		
	}
}
