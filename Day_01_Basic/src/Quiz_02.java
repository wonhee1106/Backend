
public class Quiz_02 {
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		char c = 'A';
		int i;
		float f;
		long l = 100L;
		
		s = b;
		c = (char)b;
		s = (short)c;
		c = (char)s;
		i = 100;
		l = (int)500L;
		f = l;
		f= (float)5.11; // 5.11f
	}
}
