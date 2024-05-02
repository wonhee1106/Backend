package view;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

import dao.BoardDAO;
import dao.MembersDAO;
import dto.BoardDTO;

public class MiniBoard {
	public static String id = "";
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
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MembersDAO mdao = new MembersDAO(); 
		BoardDAO bdao = new BoardDAO(); 

		try {
			while(true) {

				System.out.println("<< Mini Board 인증 >>");
				System.out.println("");
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("0. 시스템 종료");

				int menu = Integer.parseInt(sc.nextLine());

				if(menu==1) {
					System.out.print("ID를 입력해주세요.");
					id = sc.nextLine();
					System.out.print("PW를 입력해주세요.");
					String pw = getSHA512(sc.nextLine());

					boolean login = mdao.login(id,pw);

					if(login==true) {
						System.out.println("로그인 성공!");
						break;
					}else {
						System.out.println("로그인 실패!");
					}

				}else if(menu==2) {
					System.out.print("사용하실 ID를 입력해주세요.");
					String id = sc.nextLine();
					System.out.print("사용하실 PW를 입력해주세요.");
					String pw = getSHA512(sc.nextLine());
					System.out.print("사용하실 이름을 입력해주세요.");
					String name = sc.nextLine();

					Timestamp ts = new Timestamp(System.currentTimeMillis());

					int result = mdao.join(id, pw, name,ts);

					if(result > 0) {
						System.out.println("회원가입 성공!");
					}else {
						System.out.println("회원가입 실패!");
					}			
				}else if(menu==0){
					System.out.println("시스템 종료");
					System.exit(0);
				}else {
					System.out.println("메뉴를 다시 선택해주세요.");
				}
			}while(true) {
				System.out.println("<< Mini Board >>");
				System.out.println("1. 글 작성하기 ( 글 내용 ) ");
				System.out.println("2. 글 목록 보기 ( 글 번호, 작성자, 글 내용, 작성날짜 [yy.MM.dd]");
				System.out.println("3. 글 검색 하기 ( 작성자, 글 내용을 대상으로 검색 )");
				System.out.println("4. 글 수정 하기 ( 글 번호 기반으로 수정 - 작성자, 내용, 날짜를 수정 )");
				System.out.println("5. 글 삭제 하기 ( 글 번호 기반으로 삭제 )");
				System.out.println("0. 시스템 종료");
				System.out.print(">> ");

				int menu = Integer.parseInt(sc.nextLine());

				if(menu==1) {
					System.out.print("내용을 작성해주세요.");
					String contents = sc.nextLine();

					Timestamp ts = new Timestamp(System.currentTimeMillis());
					int result = bdao.addwrite(new BoardDTO(0,id,contents,ts));
					if(result > 0) {
						System.out.println("입력 성공!");
					}else {
						System.out.println("입력 실패!");
					}
				}else if(menu==2) {
					ArrayList<BoardDTO>array = bdao.selectAll();
					System.out.println("Seq\tWriter\tContents\tWrite_date");

					for(BoardDTO letter : array) {
						System.out.println(letter.getSeq()+"\t"+letter.getWriter()+"\t"+
								letter.getContents()+"\t"+letter.getWrite_date());
					}
				}else if(menu==3) {
					System.out.print("검색하실 작성자 이름을 입력해주세요.");
					String writer = sc.nextLine();
					ArrayList<BoardDTO>list = bdao.SearchByWriter(writer);

					if(list.size()>0) {
						System.out.println("Seq\tWriter\tContents\tWrite_date");
						for(BoardDTO search : list) {
							System.out.println(search.getSeq()+"\t"+search.getWriter()+"\t"+
									search.getContents()+"\t"+search.getWrite_date());
						}

					}else {
						System.out.println("검색하신 작성자를 찾을 수 없습니다.");
					}
				}else if(menu==4) {
					System.out.print("수정하실 글 번호를 입력해주세요.");
					int seq = Integer.parseInt(sc.nextLine());

					boolean check = bdao.tf(seq);

					if(check==true) {
						System.out.print("작성자 이름을 입력해주세요.");
						String writer = sc.nextLine();
						System.out.print("글 내용을 입력해주세요.");
						String contents = sc.nextLine();
						Timestamp ts = new Timestamp(System.currentTimeMillis());
						
						int result = bdao.updateList(seq, writer, contents,ts);

						if(result > 0) {
							System.out.println("수정 성공!");
						}else {
							System.out.println("수정하실 글 번호를 찾을 수 없습니다.");
						}
					}
				}else if(menu==5) {
					System.out.print("삭제하실 글 번호를 입력해주세요.");
					int seq = Integer.parseInt(sc.nextLine());
					int result = bdao.deleteBySeq(seq);

					if(result > 0) {
						System.out.println("삭제 성공!");
					}else {
						System.out.println("삭제할 글을 찾을 수 없습니다.");
					}					
				}else if(menu==0) {
					System.out.println("시스템 종료");
					System.exit(0);
				}else {
					System.out.println("메뉴를 다시 선택해주세요.");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("오류가 발생했습니다. 관리자에게 문의하세요.");
		}
	}
}
