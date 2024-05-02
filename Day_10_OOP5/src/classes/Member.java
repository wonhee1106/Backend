package classes;

abstract public class Member {				// 클래스 앞에 abstract를 쓰면 추상 클래스 abstract를 사용하면 인스턴스 생성 불가

	private String id;
	private String name;
	private int point;
	
	public Member(){}
	
	public Member(String id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	abstract public double getBonus();		// abstract는 추상적인 그런게 있어 그냥 개발자가 시키는대로 해 // 메서드 앞에 abstract를 쓰면 추상 메서드
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}	
}
