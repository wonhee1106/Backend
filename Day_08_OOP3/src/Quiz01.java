import java.io.File;
import java.util.Scanner;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;
//비밀번호 입력말고 조합해서
public class Quiz01 {
	public static void main(String[] args) {//main에서는 드로우 하지 말것
		Scanner sc = new Scanner(System.in);
		FTPClient client = new FTPClient();
		client.setCharset("euckr");
		while(true) {
			System.out.println("===FTP Client Program===");
			System.out.println("1. Connect FTP Server");
			System.out.println("2. Exit Program");
			System.out.print(">>>");
			String input = sc.nextLine();

			try {

				if(input.contentEquals("1")) {

					System.out.println("input url");
					System.out.print(">>>");
					String url = sc.nextLine();				
					client.connect(url);

					System.out.println("input port");
					System.out.print(">>>");
					String port = sc.nextLine();	

					System.out.println("try to connect : "+url+"(port : "+port+")");

					System.out.println("input id");
					System.out.print(">>>");
					String id = sc.nextLine();

					//System.out.println("input password");
					//System.out.print(">>>");
					//String password = sc.nextLine();

					String password = null;


					pw:for(int i=0;i<10;i++){ //비번 4자리 조합 0000~9999
						for(int j=0;j<10;j++) {
							for(int k=0;k<10;k++) {
								for(int h=0;h<10;h++) {
									password = Integer.toString(i)
											+Integer.toString(j)
											+Integer.toString(k)
											+Integer.toString(h);
									try {
										client.login(id, password);
										
										break pw; //로그인 성공시 다음, 실패시 재조합
									}catch(Exception e) {
										System.out.println(password);
										e.printStackTrace();		

									}
								}
							}
						}
					}

					System.out.println("Login Success");

					while(true) {
						System.out.println("1. Upload File"); 
						System.out.println("2. Download File");
						System.out.println("3. Disconnect FTP Server");
						System.out.println("4. Delete File");
						System.out.print(">>>");
						String input2 = sc.nextLine();

						if(input2.contentEquals("1")) {
							try {
								System.out.println("input upload file name");
								System.out.print(">>>");
								String upload = sc.nextLine();

								client.upload(new java.io.File(upload));
							}catch(Exception e) {
								e.printStackTrace();

							}
							continue;

						}else if(input2.contentEquals("2")) {
							try {
								FTPFile[] list = client.list();
								for(int i=0;i< list.length; i++) {
									System.out.println("파일명 : "+list[i].getName()+"	사이즈 : "+list[i].getSize());//파일리스트 출력
								}


								System.out.println("input remoteFileName");//받을 파일 이름
								System.out.print(">>>");
								String remoteFileName = sc.nextLine();

								System.out.println("input localFile");// 저장할 이름
								System.out.print(">>>");
								String localFile = sc.nextLine();

								client.download(remoteFileName, new File(localFile));//경로 안쓰면 프로젝트 폴더에 저장
								//참조자료형 > 인스턴스 생성하고 주소값 입력해야
								//파일 인코딩 ANSI로 저장, 내용이 있어야 전송
								System.out.println("Success! F5를 눌러 확인하세요.");
							}catch(Exception e) {
								e.printStackTrace();

							}
							continue;

						}else if(input2.contentEquals("3")) {

							client.disconnect(true);
							System.out.println("Disconnect FTP Server");

							continue;

						}else if(input2.contentEquals("4")) {

							try {
								FTPFile[] list = client.list();
								for(int i=0;i< list.length; i++) {
									System.out.println("파일명 : "+list[i].getName()+"	사이즈 : "+list[i].getSize());//파일리스트 출력

								}

								System.out.println("input Delete FileName");
								System.out.print(">>>");
								String Delete = sc.nextLine();
								client.deleteFile(Delete);
								System.out.print("삭제완료");
							}catch(Exception e) {
								e.printStackTrace();

							}
							continue;

						}else {
							System.out.println("메뉴를 다시 확인해 주세요.");

						}

					}

				}else if (input.contentEquals("2")) {

					System.out.println("프로그램 종료");
					System.exit(0);    

				}else {
					System.out.println("메뉴를 다시 확인해 주세요.");
				}

			}catch(Exception e) {
				e.printStackTrace();

			}

		}

	}
}

// 5482 9107