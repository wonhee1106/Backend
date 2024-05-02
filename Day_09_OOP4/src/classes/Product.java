package classes;

public class Product {

	// Product 클래스 제작
			// 1. 정보은닉 / getters&setters / constructor / default constructor 모두 작성
			// 2. 멤버필드 : / 상품코드 / 상품명 / 가격 / 재고
			
			// Product 설계도 기반 인스턴스를 3개를 생성하고 ( 데이터는 자유 선택 )
			// 저장된 모든 데이터를 화면에 출력해보기.
	
	
	//멤버필드
	private int code = 1;
	private String name = "상품명";
	private int price = 10000;
	private int stock = 5;
	
	public int getCode() {
		return code;
	}
	public void setPlatform(int code) {
		this.code = code; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	// 생성자
	public Product(int code, String name, int price, int stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
}
