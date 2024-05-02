import java.util.Scanner;
public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===구구단 출력 프로그램===");
		
		System.out.print("1 ~ 9단 중 선택: ");
		int num = Integer.parseInt(sc.nextLine());
		
		 if (num < 1 || num > 9) {
	            System.out.println("1부터 9까지의 숫자를 입력해주세요.");
	            System.out.print("1~9단 중 선택: ");
	            num = Integer.parseInt(sc.nextLine());
	        }	        
	        System.out.println("=== " + num + "단 ===");
	        
	        int i = 1;
	        while (i <= 9) {
	            System.out.println(num + " * " + i + " = " + (num * i));
	            i++;
	        }
	        
	        sc.close();
		
		

	}
}

