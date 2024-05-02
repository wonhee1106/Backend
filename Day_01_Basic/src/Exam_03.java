
public class Exam_03 {
	public static void main(String[] args) {
		
		System.out.println(3 / 2.0);
		//System.out.println(3.0 / 2.0);
		System.out.println("두 수의 합 : " + (10 + 5)); //스트링 값에 의한 프로모션 사례
		System.out.println("====================");
		
		byte a = 0;
//      0000 0000		
		short b = 1000;
//      0000 0000		
		a = (byte)b; //여기서 (byte)가 cast 강제 cast 연산자
		System.out.println(a);
		
		
	}
}
