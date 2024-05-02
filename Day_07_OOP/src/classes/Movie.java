package classes;

public class Movie {
	// 1. 플랫폼명 / 제목 / 장르를 멤버필드로 가지는 Movie 클래스를 생성
			// 2. Movie 클래스를 바탕으로 인스턴스를 생성하되,
			// 생성자 인자값으로
			// 플래폼 : Netflix
			// 제목 : 범죄도시3
			// 장르 : 액션/코미디
			// 위 데이터를 전달하여 인스턴스를 생성
			// 3. 동일한 타입의 인스턴스를 하나 더 생성하되,
			// 초기값은 자유 설정
			// 단, 생성자가 아닌 Setter로 초기화 해보기.
			
			// 4. 생성된 두개 인스턴스의 내용 전부 출력해보기.
	// 멤버필드
	private String platform = "영화관"; // default value    new를 생성했을때 기본으로 세팅되어있는 값
	private String title = "범죄도시"; // 만약 main에서 다른 값을 넣으면 main에서 넣은 값으로 실행됨 이유는 
	// class에서는 초기값을 세팅하는것이고 main은 그 이후에 생성됨 초기값은 class 개발자가 설정하는것이고 생성자와 setter는 class사용자가 직접 입력한다.
	private String genre = "액션";
	
	// 멤버메소드
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform; 
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title; 
	}	
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre; 
	}
	
	public Movie() {}  // Default Constructor 기본 생성자 이게 없으면 main에서 에러 생김
	
	public Movie(String platform, String title, String genre) {
		this.platform = platform;
		this.title = title;
		this.genre = genre;
	}
}
