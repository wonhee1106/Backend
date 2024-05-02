import java.util.Scanner;
public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====동전 앞 뒤 맞추기===== ");
		System.out.println("숫자를 입력해주세요 (1.앞면/2뒷면 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num==1 || num==2) {
			double rand = Math.random();
			System.out.println((int)(rand * (2-1+1))+1);
			System.out.println("맞췄습니다.");
			
		}else {
				System.out.println("땡!틀렸습니다.");
				System.out.println("------------------>restart");
				System.out.println();
			}
			
		
			
		
		
	}
}
