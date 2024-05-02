
public class Exam03 {
	public static void main(String[] args) {

		ext: for(int j = 0;j <= 10;j++) {
			
			for(int i = 1;i <= 10;i++) {
				if(i == 5) {
					break ext;
				}
				System.out.println(i);
			}
		}
	}
}
