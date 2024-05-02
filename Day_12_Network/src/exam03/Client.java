package exam03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args)throws Exception {
		Socket client = new Socket("192.168.0.203",26000);

		DataInputStream dis = new DataInputStream(client.getInputStream());
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());



		int num = dis.readInt();
		System.out.println(num);

		for(int i = 0;i < num;i++) {
			String str = dis.readUTF();
			System.out.println(str);
		}

		dos.writeUTF("다운로드해주세요.txt");
		
		// Stream : 서로 다른 장비에서 데이터를 주고 받는 통로
		// Stream의 방향성은 RAM이 기준이다.
		// hdd -> RAM 으로 옮길때 RAM 기준이니까 fis 
		
		// File  targetFile = new File(path+targetFileName);  // 파일 크기를 알아내기 위해 File instance 생성
		// File객체를 사용하면 File 사이즈 알아낼 수 있음
		
		long fl = dis.readLong();
		System.out.println(fl);
		
		
		
		byte[] file = new byte[(int)fl];
		dis.readFully(file);
		
		FileOutputStream fos = new FileOutputStream("c:/workspace/downloads/" + "실험.txt" );
		DataOutputStream fileDos = new DataOutputStream(fos);
		//dos.write(file);
		//dos.flush();
		
		fileDos.write(file);
		
		fileDos.close();
		fos.close();
		
		
		
		
		
		




	}
}
