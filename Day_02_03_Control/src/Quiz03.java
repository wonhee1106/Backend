import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		}
		
		
		
	}
}
