import java.util.Scanner;
public class Exam07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 가장 좋아하는 과목은?");
		System.out.println("1.Java / 2.Pythom / 3.C언어");
		System.out.println(">>");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1:
			System.out.println("Java 만세~");
			break;
		case 2:
			System.out.println("Python 잘났다~");
			break;
		case 3:
			System.out.println("C언어가 정석이지~");
			break;
		default:
			System.out.println("메뉴를 다시 확인해주세요.");
		}
	}
}
