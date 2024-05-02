package exams;

import classes.Student;

public class Exam02 {
	public static void main(String[] args) {
		
		// Student 클래스 제작
		// 멤버필드 : 학번 / 이름 / 국어 / 영어 / 수학
		// 멤버메서드 : setter / getter / constructor / default constructor
		//           getSum: 인스턴스 내 점수 합계를 get 하는 메서드
		//			 getAvg : 인스턴스 내 점수 평균을 get 하는 메서드
		
		// 정보 은닉을 꼭 지켜서 작성해주세요.
		// 인스턴스는 3개를 만들어서 저장.
		// 출력할 때는 학번/이름/국어/영어/수학/합계/ 평균을 모두 출력해주세요.
		
		Student[] students = new Student[3];
		
		students[0] = new Student(2020, "Lee", 90, 80, 90);
		students[1] = new Student(2021, "Kim", 70, 60, 80);
		students[2] = new Student(2022, "Song", 80, 75, 83);
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
		for(int i=0; i < students.length; i++) {
			System.out.println(students[i].getId() +"\t" + students[i].getName() + "\t" + students[i].getKor() + "\t" + students[i].getEng()
					+ "\t" + students[i].getMath() + "\t" + students[i].getSum() + "\t" + students[i].getAvg() );
		}
		
		
	}
}
