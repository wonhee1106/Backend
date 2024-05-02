package classes;

public class Silver extends Member{	
	
	
	
	public Silver() {}
	public Silver(String id, String name, int point) {
		super(id,name,point);
		
	}
		
	//Method Overriding : 상속받은 메서드를 임의의 내용으로 재정의해서 사용하는 문법
	public double getBonus() {
		return this.getPoint()*0.02;  // override는 무효화 시키다.  // 메서드의 재정의 // 
	}
	
	// 1. setter - 써도 상관없음
	// 2. 접근제한자 변경 - 비추천 ( 정보은닉 권고안을 위반함 )
	// 3. Constructor 사용 - 대부분 super생산자를 사용함
	
	// silver 생성자는 접근제한때문에 생성이 불가능 하므로 super()를 이용하여 부모 클래스인 member를 호출함
	
}
