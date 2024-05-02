
public class Exam02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		boolean result;
		int result2;
		result2 = x + y;
		System.out.println(x + " + " + y + " = " + result2); //
		x = y = 2; //x=2, y=2
		System.out.println("x = " + x++ + ", y = " + ++y); // 2 3
		System.out.println("x = " + x + ", y = " + y); // 3 3
		y = 10;
		result = !( ((x>y) || (y==x)) || ((x!=y) && (x<y) ));
		System.out.println(result); //false
		
		int a = 10;
		int b = 20;
		System.out.println(++a == 10 && b++ == 20); //false
		System.out.println(a + " : " + b); //11 : 20
	}
}
