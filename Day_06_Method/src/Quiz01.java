
public class Quiz01 {
	
	public static double divide(int num1, int num2){
		double result = (double)num1 / num2;
		return result;
	} // 1. 두 개의 정수를 인자로 전달받아 나눗셈함 결과를
	  // 소수점 포함하여 반환하는 메서드 divide를 제작해주세요.
	
	
	public static int bigger(int num1, int num2) {
		int result = 0;
		if(num1 < num2) {
			result = num2;
		}else if(num1 > num2) {
			result = num1;
		}else {
			result = 0;
		}
		return result; // 2. 두 개의 정수를 인자로 전달 받아 더 큰수를 반환하는 메서드 bigger를 제작해주세요.
					   // 두 수가 같은 경우 0을 반환
	}
	// 3. 최소값과 최대값을 인자로 전달하면, 두 수 사이의 난수를 숫자로 반환하는 메서드
	// myRand를 만들어주세요
	public static int myRand(int min, int max) {
		return (int)(Math.random()* (max - min + 1)+min);
		}
		
		
	
	
	public static void main(String[] args) {
		
		double result = divide(12,5);
		System.out.println(result);
		
		int result2 = bigger(12,13);
		System.out.println(result2);
		
		int result3 = myRand(5,17);
	}
}
