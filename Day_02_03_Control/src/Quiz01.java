import java.util.Scanner;
public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 10 사이의 수를 입력해주세요.");
		System.out.println(">> ");
		
		// 사용자가 1 ~ 10 사이의 수를 입력하면 "통과" 라고 출력
		// 사용자가 1 ~ 10 외의 수를 입력하면 "범위 초과!" 라고 출력하는 프로그램 작성.
		int num = Integer.parseInt(sc.nextLine());
				
				if(num>=1 && num<=10) {
					System.out.println("통과");
				}else {
					System.out.println("범위 초과!");
				}
					
		
	}
}
