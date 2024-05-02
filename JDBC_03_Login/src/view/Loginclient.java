package view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.Scanner;

public class Loginclient {

	public static void main(String[] args){
		while(true) {
			try {

				Scanner sc = new Scanner(System.in);
				Socket client = new Socket("192.168.1.14",30000);
				InputStream is = client.getInputStream();
				DataInputStream dis = new DataInputStream(is);

				OutputStream os = client.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);

				System.out.println("회원 인증 시스템");
				System.out.println("");
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");

				String menu = sc.nextLine();
				dos.writeUTF(menu);

				if(menu.equals("1")) {

					System.out.print("ID를 입력해주세요.");
					String id = sc.nextLine();

					System.out.print("PW를 입력해주세요");
					String pw = sc.nextLine();


					dos.writeUTF(id);
					dos.writeUTF(pw);
					dos.flush();
					
					String result= dis.readUTF();
					System.out.println(result);
				}else if(menu.equals("2")) {
					System.out.print("사용하실 ID를 입력해주세요.");
					String id = sc.nextLine();

					System.out.print("사용하실 PW를 입력해주세요.");
					String pw = sc.nextLine();

					System.out.print("회원 이름을 입력해주세요.");
					String name = sc.nextLine();

					dos.writeUTF(id);
					dos.writeUTF(pw);
					dos.writeUTF(name);
					dos.flush();
					
					String result = dis.readUTF();
					System.out.println(result);
				}

			}catch (Exception e) {
				e.printStackTrace();

			}
		}
	}
}
