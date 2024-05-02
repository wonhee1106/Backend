package quizs;
import java.util.Scanner;

import classes.Student;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[3];		
		
		for(int i = 0;i < students.length;i++) {
			System.out.println(i+1+ " 번째 학생 이름 : ");
			String name = sc.nextLine();
			
			System.out.println(name + " 학생의 국어 : ");
			int kor = Integer.parseInt(sc.nextLine());
			
			System.out.println(name + " 학생의 영어 : ");
			int eng = Integer.parseInt(sc.nextLine());
			
			System.out.println(name + " 학생의 수학 : ");
			int math = Integer.parseInt(sc.nextLine());
			
			students[i] = new Student(1000+(i+1),name,kor,eng,math);
		
			
			System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균");
			for(int j = 0; j < students.length; j++) {
				System.out.println(students[j].getId() +"\t" + students[j].getName() + "\t" + students[j].getKor() + "\t" + students[j].getEng()
						+ "\t" + students[j].getMath() + "\t" + students[j].getSum() + "\t" + students[j].getAvg() );
			}
			
		}
	}
}
