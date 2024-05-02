package classes;

public class Car {
	// 1. Car 클래스 생성
	// 조건1. 멤버필드는 모델명 / 가격 / 색깔 3가지
	// 조건2. 정보은닉을 적용하여 제작할 것
	// 조건3. Getter/Setter 는 Global Convention에 따를 것
	// 조건4. Constructor 도 작성할 것.
	
	// 2. 생성된 클래스를 바탕으로 인스턴스 생성
	// 조건. 인스턴스를 생성할 때 , 생성자 인자값으로
	// Genesis GV80 , 80 000 000 , Gray 를 전달하여 생성할 것
	// 생성된 인스턴스의 모든 내용을 화면에 출력할 것
	
	// 멤버필드 클래스의 멤버 변수 선언
	private String model;       
	private int price;
	private String color;
	
	// 멤버메소드
	public String getModel() {  
		return model;  // 반환
	}
	public void setName(String model) {
		this.model = model; // 설정
	}
	
	public int getPrice() {
		return price;  // 반환  
	}
	public void setPrice(int price) {
		this.price = price;  // 설정
	}
	
	public String getColor() {
		return color;  // 반환
	}
	public void setColor(String color) {
		this.color = color;  // 설정
	}
	
	
	
	// 클래스의 생성자
	public Car(String model, int price, String color) { // 매개변수로 받아서 인스턴스를 초기화
		this.model = model;
		this.price = price;
		this.color = color;
	}
	
	
	
	
}
