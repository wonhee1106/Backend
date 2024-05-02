package quizs;

import classes.School;

public class Quiz03 {
	public static void main(String[] args) {
		// 1. 이름 / 학년 / 학번 / 성별을 멤버필드로 가지는 School 클래스를 생성
				// 2. Shool 클래스를 바탕으로 인스턴스를 생성하되,
				// 생성자 인자값으로
				// 이름 : 이원희 
				// 학년 : 4
				// 학번 : 201878029
				// 위 데이터를 전달하여 인스턴스를 생성
		// 3. 동일한 타입의 인스턴스를 하나 더 생성하되,
				// 초기값은 자유 설정
				// 단, 생성자가 아닌 Setter로 초기화 해보기.
				
				// 4. 생성된 두개 인스턴스의 내용 전부 출력해보기.
		School schools = new School("이원희", 4, 201878029 );
		System.out.println("이름 : " + schools.getName());
		System.out.println("학년 : " + schools.getGrade());
		System.out.println("학번 : " + schools.getUndergrad());
		
	}
}
