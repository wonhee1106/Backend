package exams;
import java.awt.Robot; // crtl + shift + o

public class Exam02 {
	public static void main(String[] args) throws Exception{
		
		Robot robot = new Robot(); // 책임 전가
		robot.mouseMove(400, 400); 
		
		for(int i = 0;i < 100;i++) {
			robot.mouseMove(400+i, 400);
			robot.delay(50);
		}
		
	}
}
