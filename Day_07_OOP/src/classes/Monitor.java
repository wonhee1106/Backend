package classes;

public class Monitor {
	// 모니터를 구성하는 속성과 기능
	// 속성은 변수로
	// 기능은 Method로 구현한다.
	
	public Monitor(){}
	
	private int price;					// private을 사용하지 않으면 기본적으로 package로 실행됨 안목적
	private double weight;
	private String color;
	// 여기에 this
	public void powerOn(){}
	public void powerOff() {}
	public void lightUp() {}
	public void lighteDown() {}
	
	
	
	// 모든 속성을 다 쓸 필요는 없고 필요한 정도만 써도 괜찮음
	// void는 아무것도 없다는 뜻
	// 내가 만든 이 class는 참조자료형이 된다.
}
