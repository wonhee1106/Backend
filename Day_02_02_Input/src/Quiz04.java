import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// 이름, 국어 성적, 영어 성적, 수학 성적을 입력받는다
		//성적의 합계와 평균을 구하고
		//모든 값을 출력해라
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(sc.nextLine());

		int sum = kor+eng+math;
		double avg = (kor+eng+math)/3.0;
		//88/3.0
		
	

		System.out.println("이름 : " + name+"\t"
				+ "국어 : " + kor +"\t" 
				+ "영어 : "+ eng +"\t" 
				+ "수학 : " + math + "\t"
				+ "합계 : " + sum + "\t" +"평균 : " +avg);

	}
}
