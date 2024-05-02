import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 도구 준비
		
		System.out.println("============");
		System.out.print("이 름 : ");
		String name = sc.nextLine(); // 도구 사용
		
		System.out.println("============");
		
		System.out.print("국어 : ");
		int kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 : ");
		int eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학 : ");
		int math = Integer.parseInt(sc.nextLine());
		
		System.out.println("============");
		
		
		System.out.println("합계 : "+ (kor + eng + math));
		System.out.println("평균 : "+ (kor + eng + math)/3.0);
		
		
		
	}
}
