import java.util.Scanner;

public class Quiz05 {
		public static int bigger(int num1,int num2) {
			int result=0;
			if(num1>num2) {
				result =  num1;
			}else {
				result = num2;
			}
			return result;	
		}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 수 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두 번째 수 : ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			int result = bigger(num1,num2);
			System.out.println(result);
			
			
			
		}
}
