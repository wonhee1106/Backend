package exam01;

import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

class Tong extends Thread{

	   private OutputStream os; 
	   private InputStream is;
	   private DataOutputStream dos;
	   private DataInputStream dis;
	   
	   public Tong() {};
	   
	   public Tong(OutputStream os, InputStream is) { //생성자에 받고 싶은걸 담아서 
	      this.os=os;
	      this.is=is;
	   }
	   
	   
	   public void run() {
	      //업그레이드 straeam으로 보강공사, 필터드스트림
	      dos=new DataOutputStream(os);
	      dis=new DataInputStream(is);
	   }
	   
	   public DataOutputStream getdataoutput() {
	      return dos;
	   }
	   
	   public DataInputStream getdatainput() {
	      return dis;
	   }
	   
	   
	}
public class Client {
	public static void main(String[] args) throws Exception {

		Socket client = new Socket("192.168.0.203",26000);

		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		Tong t=new Tong(os, is);
		t.start();
		
		// 서버로부터 메시지를 수신하는 스레드 시작
		//Thread receiveThread = new Thread(new ReceiveThread(dis));
		//receiveThread.start();
		
		// 사용자 입력을 전송하는 스레드 시작
//		Thread send
		while(true) {
			System.out.println("Server" + t.getdatainput().readUTF());
			t.getdataoutput().writeUTF(JOptionPane.showInputDialog("보낼 메시지를 입력하세요."));			
			t.getdataoutput().flush();		
		}
	}
}

//지연누님 192.168.0.204
//원희 192.168.0.179
//포트 26005
