package exam01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

class WriteThread extends Thread{
	private DataOutputStream dos;

	public WriteThread(DataOutputStream dos) {
		this.dos = dos;
	}

	public void run() {
		while(true) {
			String mymsg=JOptionPane.showInputDialog("보낼 메세지를 입력하세요.");
			try {			
				dos.writeUTF(mymsg);
				dos.flush();
			}catch(Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
			System.out.println("나:"+mymsg);
		}
	}
}

public class Server {
	public static void main(String[] args)throws Exception {
		
			Socket client = new Socket("192.168.0.203",26000); 
			OutputStream os = client.getOutputStream();		// 기본 스트림 생성
			DataOutputStream dos = new DataOutputStream(os); // 기본 스트림 -> 업그레이드 스트림으로 보강공사

			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);

			WriteThread wt = new WriteThread(dos);
			wt.start();

			while(true) {		

				String msg = dis.readUTF();
				System.out.println("Client : " + msg);
			}
		
	}
}
