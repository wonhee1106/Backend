

class At extends Thread{
	public void run() {
		for(int i=0;i < 100;i++) {
			System.out.print("@");
		}
	}
}


class Dol extends Thread{
	public void run() {
		for(int i=0;i < 100;i++) {
			System.out.print("$");
		}
	}
}

public class Exam02 {
	public static void main(String[] args) {
		
		// #, @, $를 각 100번씩 멀티쓰레드로 화면에 출력해보세요.
		
		At at = new At();
		Dol dol = new Dol();
		at.start();
		dol.start();
		
		
		for(int i = 0;i < 100;i++) {
			System.out.print("#");
		}
		
		
		
		
		
	}
}
