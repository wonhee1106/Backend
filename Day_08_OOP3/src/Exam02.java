import java.io.File;
import java.util.Scanner;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;

public class Exam02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FTPClient client = new FTPClient();
		client.setCharset("euckr");


		System.out.println("===FTP Client Program");
		System.out.println("1. Connect FTP Sever");
		System.out.println("2. Exit Program");
		System.out.print(">>>");

		int menu = Integer.parseInt(sc.nextLine());		




		if(menu==1) {
			System.out.println("input url");
			System.out.print(">>>");
			String ip = sc.nextLine();


			System.out.println("input port");
			System.out.print(">>>");
			int port = Integer.parseInt(sc.nextLine());

			while(true) {
				try {		
					System.out.println("FTP Sever is connected");
					client.connect(ip);
					break;
				}catch(Exception e){
					e.printStackTrace();
					return;
				}
			}
			while(true) {
				try {
					System.out.print("input id : ");
					String id = sc.nextLine();
					System.out.print("input password");
					String password = sc.nextLine();
					client.login(id, password);
					break;
				}catch(Exception e) {
					e.printStackTrace();
				}
			}

			System.out.println("Login Sucecss!");
			System.out.println("===================");

			while(true) {
				System.out.println("1. Upload File");
				System.out.println("2. Download File");
				System.out.println("3. Disconnect FTP Server");
				System.out.println("4. Delete File");
				System.out.print(">>>");
				int select = Integer.parseInt(sc.nextLine());

				if(select==1) {
					while(true) {						
						try {
							FTPFile[] files = client.list();
							System.out.println("업로드할 수 있는 파일 목록 : ");
							for (FTPFile file : files) {
								System.out.println(file);
							}
							System.out.println("업로드하실 파일을 고르세요");
							String file_upload = sc.nextLine();
							client.upload(new File(file_upload));
							System.out.println("업로드 성공!");
							break;
						}catch(Exception e) {
							e.printStackTrace();
							System.out.println("잘못된 입력입니다. 다시 확인해주세요");
							
						}
					}
				}else if(select==2) {
					while(true) {
						try {
							String[] files = client.listNames();
							System.out.println("다운로드할 수 있는 파일 목록 : ");
							for (String file : files) {
								System.out.println(file);
							}							
							System.out.println("파일 주소를 입력해주세요.");
							String download_adress = sc.nextLine();
							System.out.println("파일명을 입력해주세요.");
							String file_download = sc.nextLine();
							client.download(file_download, new File(download_adress));
							break;
						}catch(Exception e) {
							e.printStackTrace();
							System.out.println("잘못된 입력입니다. 다시 확인해주세요");
						}					
					}

				}else if(select==3) {
					while(true) {					
						try {
							client.disconnect(false);
							break;
						}catch(Exception e) {
							e.printStackTrace();
							
						}
					}break;

				}else if(select==4) {
					while(true) {
						System.out.println("삭제하실 파일을 고르세요.");
						try {
							// client.deleteFile(password);
							break;
						}catch(Exception e) {
							e.printStackTrace();					
						}
					}

				}else {
					System.out.println("다시 선택해주세요.");
				}
			}
		}else if(menu==2) {
			System.exit(0);
		}
	}
}

// client.setCharset("euckr");
// 192.168.0.182 

