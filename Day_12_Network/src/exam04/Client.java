package exam04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception{
		Socket client = new Socket("192.168.0.162",30000);
		
		DataInputStream dis = new DataInputStream(client.getInputStream());
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		
		
		dos.writeUTF("saf");
	
	}
}
