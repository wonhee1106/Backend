package quiz;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws HeadlessException, IOException, ParseException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Socket client = new Socket("192.168.0.203",26000);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
		InputStream is = client.getInputStream();
		OutputStream os = client.getOutputStream();
		//DataInputStream dis = new DataInputStream(is);
		//DataOutputStream dos = new DataOutputStream(os);
		ObjectInputStream ois = new ObjectInputStream(is);
		ObjectOutputStream oos = new ObjectOutputStream(os);

		//		try {
		//			
		//			
		//		}catch(Exception e) {
		//			//e.printStackTrace();
		//			System.out.println("서버에 연결할 수 없습니다.");
		//			System.out.println("같은 에러가 반복된다면 관리자에게 문의하세요.");
		//			System.out.println("관리자 : admin@naver.com");
		//			System.exit(0);
		//		}
		while(true) {
			System.out.println("<< Netflix 영화 관리 시스템 >>");
			System.out.println("");
			System.out.println("1. 신규 영화 목록");
			System.out.println("2. 영화 목록 출력");
			System.out.println("3. 영화 검색 ( 제목으로 검색 )");
			System.out.println("4. 영화 삭제 ( ID로 삭제 )");
			System.out.println("5. 영화 정보 변경 ( ID로 변경 )");
			System.out.print(">> ");

			String menu=sc.nextLine();

			oos.writeUTF(menu);
			oos.flush();
			

			if(menu.equals("1")){
				System.out.print("ID를 입력하세요.");
				String id = sc.nextLine();
				System.out.print("제목을 입력하세요.");
				String title = sc.nextLine();
				System.out.print("장르를 입력하세요.");
				String genre = sc.nextLine();
				System.out.print("개봉 날짜를 입력하세요.");
				String ctime = sc.nextLine();
				//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
				//				Date date = sdf.parse(ctime);

				oos.writeUTF(id);	
				oos.flush();
				oos.writeUTF(title);
				oos.writeUTF(genre);
				oos.flush();
				oos.writeUTF(ctime);
				oos.flush();

				

			}else if(menu.equals("2")) {
				ArrayList<MovieDTO> movies=(ArrayList<MovieDTO>)ois.readObject();
				System.out.println(movies.size());
				for(MovieDTO m: movies) {
					System.out.println(m.getId()+"\t"+m.getTitle()+
							"\t"+m.getGenre()+"\t"+sdf.format(m.getDate()));

				}		
			}else if(menu.equals("3")) {
				System.out.print("검색할 영화 제목을 입력하세요.");
				String title =sc.nextLine();
				oos.writeUTF(title);
				oos.flush();
				
				ArrayList<MovieDTO> mvs=(ArrayList<MovieDTO>)ois.readObject();
				for(MovieDTO m: mvs) {
					System.out.println(m.getId()+"\t"+m.getTitle()+"\t"+m.getGenre()+"\t"+sdf.format(m.getDate()));
				}

			}else if(menu.equals("4")) {
				System.out.println("삭제하실 영화 ID를 입력하세요.");
				String id = sc.nextLine();
				oos.writeUTF(id);
				oos.flush();
				
				boolean check=ois.readBoolean();
				if(check==true) {
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("삭제할 목록이 없습니다.");
				}
				
				
			}else if(menu.equals("5")) {
				System.out.println("수정하실 영화 ID를 입력하세요.");
				String id = sc.nextLine();
				oos.writeUTF(id);
				oos.flush();
				
				System.out.println("수정할 제목을 입력하세요.");
				String title = sc.nextLine();
				System.out.println("수정할 장르를 입력하세요.");
				String genre = sc.nextLine();
				System.out.println("수정할 개봉날짜를 입력하세요.");
				String ctime = sc.nextLine();
				
				
				oos.writeUTF(title);
				oos.flush();
				oos.writeUTF(genre);
				oos.flush();
				oos.writeUTF(ctime);
				oos.flush();
				
			}

		}
	}
}
// 203   26000