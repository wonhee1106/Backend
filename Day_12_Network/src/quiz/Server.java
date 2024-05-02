package quiz;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args)throws Exception {
		ServerSocket server = new ServerSocket(26000);
		System.out.println("접속대기");
		Socket socket = server.accept();
		System.out.println(socket.getInetAddress()+ "접속 완료");
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		
	}
}
