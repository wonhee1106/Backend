package quiz01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Client {
	public static void main(String[] args) throws Exception {

		// 1. 로또 번호 추천
		// 2. 현재 시간 요청
		// 3. 오늘의 명언
		// >> 

		Socket client = new Socket("192.168.0.204",26005);

		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		OutputStream os = client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);

		while(true) {
			System.out.println("=== Menu ===");
			System.out.println("");
			System.out.println("1. 로또 번호 추천");
			System.out.println("2. 현재 시간 요청");
			System.out.println("3. 오늘의 명언");
			System.out.print(">> ");

			dos.writeUTF(JOptionPane.showInputDialog("메뉴를 입력하세요."));			
			dos.flush();
			
			String menu = dis.readUTF();

			if(menu.equals("1")) {
				String msg = dis.readUTF();
				System.out.println("로또 번호 추천 : " + msg);
			}else if(menu.equals("2")) {		
				String msg = dis.readUTF();
				System.out.println("결과 값 : " + msg);
			}else if(menu.equals("3")){
	            String msg = dis.readUTF();
	            System.out.println("오늘의 명언 : " + msg);
	         }
		}		

	}
}

// 127.0.0.1 내 자신한테 서버 연결하기
