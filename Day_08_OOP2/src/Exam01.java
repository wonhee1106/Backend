import java.io.FileInputStream;

import javazoom.jl.player.Player; //third party 라이브러리 제 3자 라이브러리 외부 라이브러리

public class Exam01 {
	public static void main(String[] args) {
		
		
		// Music Play 기능 만들기!
		

		try{
		    FileInputStream fis = new FileInputStream("abc.mp3");
		    Player playMP3 = new Player(fis);
		    playMP3.play();
		}
		catch(Exception exc){
		    exc.printStackTrace();
		    System.out.println("Failed to play the file.");
		}
		
	}
}
