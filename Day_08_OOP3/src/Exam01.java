import java.io.File;

import it.sauronsoftware.ftp4j.FTPClient;

public class Exam01 {
	public static void main(String[] args) {
		
		// FTP : File Transfer Protocol 
		FTPClient client = new FTPClient();
		try {
			client.connect("192.168.0.182");
		}catch(Exception e) {
			e.printStackTrace(); // 에러가 발생한 이유를 출력할 수 있음
			return; // main 메서드에 return은 프로그램을 꺼버리겠다
		}
		
		try {
			client.login("java", "1234");
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		try {
			client.download("abc.txt", new File("c:/workspace/downloads/abc.txt"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
			client.disconnect(false);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}	
