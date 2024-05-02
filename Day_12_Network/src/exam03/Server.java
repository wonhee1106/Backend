package exam03;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
public static void main(String[] args)throws Exception {
	ServerSocket server = new ServerSocket(30000);
	
	while(true) {
		Socket socket = server.accept(); // 대기상태 
		
		FileThread ft = new FileThread(socket);
		ft.start();
		}
//	Socket sock = server.accept();
//	
//	System.out.println(sock.getInetAddress());
//	
//	DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
//	DataInputStream dis = new DataInputStream(sock.getInputStream());
//	
//	File home = new File("C:/workspace/downloads");
//	File[] files = home.listFiles();
//	
//	dos.writeInt(files.length);
//	dos.flush();
//	
//	for(File file : files) {
//		dos.writeUTF(file.getName());
//	}
//	dos.flush();
//	String targetFileName = dis.readUTF();
//	System.out.println(sock.getInetAddress() + "파일명 : "+ targetFileName);
//	
//	String path = "C:/workspace/downloads/";
//	
//	File targetFile = new File(path+targetFileName);
//	
	
	
	
	
	
}
}
