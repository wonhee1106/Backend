package view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;

import DAO.LoginDAO;

public class Loginsever {
	public static String getSHA512(String input){
		String toReturn = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
			digest.reset();
			digest.update(input.getBytes("utf8"));
			toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toReturn;
	}
	public static void main(String[] args)throws Exception{



		LoginDAO dao = new LoginDAO();

		ServerSocket server = new ServerSocket(30000);	
		while(true) {
			Socket sock = server.accept();

			System.out.println(sock.getInetAddress()+"연결");

			OutputStream os = sock.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			InputStream is = sock.getInputStream();
			DataInputStream dis = new DataInputStream(is);

			String menu = dis.readUTF(); 


			if(menu.equals("1")) {
				String id = dis.readUTF();
				String pw = getSHA512(dis.readUTF());
				boolean login = dao.login(id,pw);

				if(login==true) {
					dos.writeUTF("로그인 성공");
					dos.flush();
				}else {
					dos.writeUTF("로그인 실패");
					dos.flush();
				}
			}else if(menu.equals("2")){
				String id = dis.readUTF();
				String pw = getSHA512(dis.readUTF());
				String name = dis.readUTF();

				int result =  dao.insert(id, pw, name);

				if(result > 0) {
					dos.writeUTF("회원가입 성공");
					dos.flush();
				}else {
					dos.writeUTF("회원가입 실패");
					dos.flush();
				}
			}		

		}
	}
}
