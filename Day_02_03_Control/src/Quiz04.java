import java.util.Scanner;
public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수를 입력하세요");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수를 입력하세요");
		int math = Integer.parseInt(sc.nextLine());
		
		double avg = (kor+eng+math)/3.0;
		
		String lv;
		
		
		if(avg>=90) {
			lv = "A";
		}else if(avg>=80) {
			lv = "B";
		}else if(avg>=70) {
			lv = "C";
		}else {
			lv = "F";
		}
		System.out.println(avg+ "는" + lv + "등급입니다.");
	}
}
