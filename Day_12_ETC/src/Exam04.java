

// static
public class Exam04{
	
	public int a;			// 인스턴스 멤버 필드 
	public static int b;	// 클래스 멤버 필드 main이 실행되는 동시에 같이 실행되는 코드 public static 전지역에서 사용 가능하므로 전역 변수라 부름 아무곳에서 사용 가능
	
	
	public void funcA() {
		a = 10;
		b = 10;
	}
	
	public static void funcB() {
//		a = 10; // static member method 내에서는 non-static 멤버를 사용할 수 없음. 
		b = 10;
	}
	int plus(int num1,int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
		
		// static 키워드가 붙은 코드는 main의 실행과 동시에 실행됨.
		// public static 이 함께 붙은 변수 또는 메서드는 언제 어디서나 접근이 가능하다.		
		// static 키워드는 사용 빈도를 최소화 하는 것이 좋다. ( 꼭 필요한 곳에만 사용 )  
		// > 메모리 효율이 낮음.
		// > 멀티쓰레딩에 취야함.
		// 프로그램 전역에 걸쳐 사용되며, 언제 어디서나 접근이 쉬워야 하는 요소에 적용하면 좋다.
		
		Exam04 e1 = new Exam04();
		Exam04 e2 = new Exam04();
		
		e1.b = 10;
		System.out.println(e2.b);
		
	}
}
