package quizs;

import classes.Movie;
public class Quiz02 {
	public static void main(String[] args) {
		// 1. 플랫폼명 / 제목 / 장르를 멤버필드로 가지는 Movie 클래스를 생성
		// 2. Movie 클래스를 바탕으로 인스턴스를 생성하되,
		// 생성자 인자값으로
		// 플래폼 : Netflix
		// 제목 : 범죄도시3
		// 장르 : 액션/코미디
		// 위 데이터를 전달하여 인스턴스를 생성
		Movie movie1 = new Movie("Netflix", "범죄도시3", "액션/코미디" );
		// 3. 동일한 타입의 인스턴스를 하나 더 생성하되,
		// 초기값은 자유 설정
		// 단, 생성자가 아닌 Setter로 초기화 해보기.
		
		// 4. 생성된 두개 인스턴스의 내용 전부 출력해보기.
		
		Movie movie2 = new Movie();
		movie2.setPlatform("메가박스");
		movie2.setTitle("파묘");
		movie2.setGenre("오컬트");
		System.out.println(movie1.getPlatform() + " / " + movie1.getTitle() + " / " + movie1.getGenre());
		System.out.println(movie2.getPlatform() + " / " + movie2.getTitle() + " / " + movie2.getGenre());
	}
}
