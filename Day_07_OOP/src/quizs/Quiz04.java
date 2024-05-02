package quizs;

import classes.Movie;
public class Quiz04 {
	public static void main(String[] args) {
		
		Movie[] movies = new Movie[2] ; // Mouvie형 인스턴스를 저장할 Movie 형 변수를 두개 만든것 변수들의 집합  인스턴스가 생성된게 아님
 		movies[0] = new Movie("Neflix", "범죄도시", "액션"); // movie형 인스턴스 생성 
 		movies[1] = new Movie("메가박스", "파묘", "오컬트"); 
 		
 		System.out.println(movies[1].getTitle());
	}
}
