
public class Exam_05 {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		float f1 = 3.14f;
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println("결과 : " + i1 + i2); // 1020
		System.out.println("결과 : " + (i1 + i2)); // 30
		System.out.println("결과 : " + i1 + f1); //103.14
		System.out.println("결과 : " + (i1 + f1)); // 13.14
		System.out.println("결과 : " + f1 + c1); // 3.14A
		System.out.println("결과 : " + (f1 + c1)); // 68.14
		System.out.println("결과 : " + c1 + c2); // AB
		System.out.println("결과 : " + (c1 + c2)); // 131
		
	}
}
