
public class Exam01 {
	
	public static int plus(int num1, int num2){
		int result = num1 + num2;
		return result; // 메서드 종료됨과 동시에 result 값을 되돌려보내라 return 자체가 여러개를 한꺼번에 돌려보낼수는 없다.
		// return값은 method call 받았던 지점으로 돌아간다.
		// 사용자 메서드
	}
	
	public static void main(String[] args) {     // 표준 메서드 
		int result = plus(10,5); // 1. 함수 호출 2. 리턴 값
		System.out.println(result);
		
		// Math.random();
		
		// 메서드를 사용하기 위해 부르는 문법을 Method Call 이라고 부른다.
		// 메서드를 시점에 소괄호내에 전달하는 값을 인자값 (argument) 라고 부른다.
		// > 인자값은 인수값 또는 parameter라고 불리기도 한다.
		
		// 메서드 본체 ( Prototype ) 에서 인자값을 전달받기 위해 선언된 변수를 매개변수라고 부른다.
		// 본체 { }부분은 메서드 구현 부분
		
		// main 메서드가 plus 메서드를 call 했을 때,
		// main 이 caller method , plus가 callee method라 불린다.
	}
	
}
