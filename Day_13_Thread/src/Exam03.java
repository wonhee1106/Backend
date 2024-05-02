import javax.swing.JOptionPane;

class CountDown extends Thread{
	
	public static int i = 10;
	
	private String msg = null;
	
	public void run() {
		for(i = 10;i>=0;i--) {
			System.out.println(i);			
			try {Thread.sleep(1000);}  // 1초동안 멈춤
			catch (InterruptedException e) {}
		}
		System.out.println("실패!!");
		System.exit(0);		
	}
}

public class Exam03 {
	public static void main(String[] args) {
		
		new CountDown().start();
		
		String[] sentences = new String[] {
				"public static void main(String[] ar)",
				"Scanner sc = new Scanner(System.in)",
				"DataInputStream dis = new DataInputStream()"				
		};	
		
		while(true) {
		int rand = (int)(Math.random()*3);
		String msg = JOptionPane.showInputDialog(sentences[rand]);
		
		if(msg.equals(sentences[rand])) {
			System.out.println("성공! +5");
			CountDown.i+=5;
		}else {
			System.out.println("오타 -2");
			CountDown.i-=2;
		}		
		System.exit(0);
		}		
	}
}
