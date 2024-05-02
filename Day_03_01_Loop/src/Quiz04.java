import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {

		// 숫자를 입력받아 홀짝을 구분하는 프로그램을 3번 반복하세요.
		
		

		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(count<3) {
			System.out.println("1 ~ 100 사이 입력: ");
			int num = Integer.parseInt(sc.nextLine()); 
			System.out.println("======결과=====");

			if(num>=100 && num<=1) {
				if(num%2 == 1) {
					System.out.println("입력한 수는 홀수 입니다.");
				}else {
					System.out.println("입력한 수는 짝수 입니다.");
				}
			}else {
				System.out.println("범위초과");
			
			count++;
			}

		
		}
	}
}