package exams;
import java.util.Scanner;

import classes.Monitor;
public class Exam01 {
	public static void main(String[] args) {
		
		//  객체지향 문법을 사용하기 위한 Steps
		// Step1. 만들고자 하는 대상의 선택
		// Step2. 대상에 대한 분석 ( 추상화 ) - 속성 / 기능
		// ---- 개발자의 머리속에서 사고 하는 단계
		// Step3. 설계도 작성
		//		>> Class Monitor{ }
		// Step4. 대상의 인스턴스화 힙메모리 안에 들어가는 값이 인스턴스 아주 많이 사용함
		
		// 객체 지향 초급 문법
		// 클래스 / 인스턴스 / 정보은닉 / 접근제한자
		// Setter&Getter / Constructor / this / static
		// 라이브러리 : Robot / JLayer / FTP4J
		// - Brute Force : 무작위 대입 공격
		
		Monitor lg = new Monitor(); //monitor자료형 클래스를 생성해서 오류가 생기지 않음 하지만 클래스를 지우면 오류가 생김 Monitor lg는 참조변수, new Monitor()본체 (인스턴스)		
		lg.powerOn(); // 여기서 .은 참조연산자라고 불림 대상의 주소를 찾아가라 .을 찍는 순간 monitor 객체를 만난것 .이후에 나오는 것은 사용할 기능
		
		
		
		Monitor ss = new Monitor();
		
		
		
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		
	
	}
}
