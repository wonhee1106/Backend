package quiz01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Server {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(26005);      
		Socket sock = server.accept();   

		System.out.println(sock.getInetAddress() + " 연결");

		OutputStream os = sock.getOutputStream();       
		DataOutputStream dos = new DataOutputStream(os); 

		InputStream is = sock.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		while(true) {

			String menu =dis.readUTF();


			if(menu.equals("1") ) {

				dos.writeUTF("1");

				int[] num = new int[45];

				for(int i=0; i<num.length;i++) {
					num[i] = i+1;

				}

				for(int i=0;i<1000;i++) {
					int rand1 = (int)(Math.random()*45);
					int rand2 = (int)(Math.random()*45);

					int tmp = num[rand1];
					num[rand1] = num[rand2];
					num[rand2] = tmp;
				}

				String result = num[0] + "," + num[1] + "," + num[2] + ","+ num[3] + ","+ num[4] + ","+ num[5];

				dos.writeUTF(result);
				dos.flush();

			}else if(menu.equals("2")) {

				dos.writeUTF("2");

				long ctime = System.currentTimeMillis();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");

				String result = sdf.format(ctime);

				dos.writeUTF(result);
				dos.flush();

			}else if(menu.equals("3")){
				
				dos.writeUTF("3");
				String[] str = new String[3];
				
				str[0] = "아침에 눈을 떠서 어제보다 나은 하루를 만들지 않으면, 실패한 것이다.";
				str[1] = "상상할 수 없는 꿈을 꾸고 있다면, 상상할 수 없는 노력을 해라.";
				str[2] = "인생은 스스로 알아서 하지 않으면 아무도 아무것도 가르쳐 주지 않는다.";
				
				int rand = (int)(Math.random()*3);
				
				dos.writeUTF(str[rand]);
				dos.flush();
						
				
				
			}
		}
	}
}
// 클라이언트가 1번을 입력한 경우 로또번호를 생성하여 String타입으로 반환
// 클라이언트가 2번을 입력한 경우 현재시간을 yyyy.MM.dd hh:mm:ss 형식으로 반환
// 3가지 정도의 명언 중 랜덤 1개
