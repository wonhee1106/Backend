package classes;

// Gold is a [ ]
// Silver is a [ ] 

public class Gold extends Member{ // 눈에 보이지는 않지만 Member에 들어있는 내용이 이 안에 상속되어 들어가있음 gold는 member의 자식 클래스 member는 gold의 부모 클래스
		// 부모클래스(상위 클래스)는 superclass라 불림 자식(하위 클래스)은 derivedclass
	public Gold() {} // 습관적으로 이런식으로 코드를 사용해야함
	public Gold(String id, String name, int point) {
		super(id,name,point);
	}		
	
	public double getBonus() {			// implements는 구현하다. 왼쪽 숫자 옆 화살표 하얀색
		return this.getPoint()*0.03; 
	}
	
}