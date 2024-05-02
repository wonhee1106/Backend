
public class Exam02 {
	public static void main(String[] args) {
		
		
		// 변수의 종류
		// 지역변수 / 정적변수 / 멤버변수
		
		// Local Variable ( 지역변수 )
		
		// 지역변수 : 자신이 속한 지역 { } 내에서만 생존할 수 있다.
		
		int a = 100;	// ******상위 지역에서 하위 지역으로는 중복 변수가 가능 하다.*******
		{	// 가 지역
			System.out.println(a);
		}
		
		{	// 나 지역 // 한 지역에서 변수가 중복이 되면 안되지만 다른 시역에서 사용을 하면 중복이 가능하다.
			System.out.println(a);
		}
		
	}
}
