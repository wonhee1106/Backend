package main;

import java.util.ArrayList;
import java.util.Scanner;

import dao.MusicDAO;
import dto.MusicDTO;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MusicDAO dao = new MusicDAO();

		while(true) {
			System.out.println("Melon 관리 시스템");			// CRUD방식
			System.out.println("1. 신규 음악 등록");
			System.out.println("2. 음악 목록 출력");
			System.out.println("3. 음악 검색");
			System.out.println("4. 항목 삭제");
			System.out.println("5. 항목 수정");
			System.out.println("0. 시스템 종료");

			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				System.out.print("ID 입력 : ");
				String id = sc.nextLine();

				System.out.print("제목 입력 : ");
				String title = sc.nextLine();

				System.out.print("가수 입력 : ");
				String singer = sc.nextLine();

				dao.addMusic(new MusicDTO (id,title,singer));
			}else if(menu==2) {
				ArrayList<MusicDTO> musics = dao.getMusics();

				System.out.println("Id\tTitle\tSinger");
				for(MusicDTO music : musics) {
					System.out.println(music.getId() + "\t" + 
							music.getTitle() + "\t" + 
							music.getSinger());
				}
			}else if(menu==3) {
				System.out.println("노래 제목을 검색해주세요.");
				String title = sc.nextLine();
				ArrayList<MusicDTO> result = dao.searchByTitle(title);

				if(result.size() == 0) {
					System.out.println("검색 대상을 찾을 수 없습니다.");
				}else {
					System.out.println("ID\tTitle\tSinger");
					for(MusicDTO dto : result) {
						System.out.println(dto.getId()+"\t"+dto.getTitle()+"\t"+dto.getSinger() );
					}
				}


			}else if(menu==4) {
				ArrayList<MusicDTO> musics = dao.getMusics();
				System.out.println("삭제하실 음악을 선택해주세요");
				System.out.println("Id\tTitle\tSinger");
				for(MusicDTO music : musics) {
					System.out.println(music.getId() + "\t" + 
							music.getTitle() + "\t" + 
							music.getSinger());
				}
				String id = sc.nextLine();
				dao.delMusic(id);

			}else if(menu==5) {
				ArrayList<MusicDTO> musics = dao.getMusics();
				System.out.println("수정하실 음악을 선택해주세요");
				System.out.println("Id\tTitle\tSinger");
				for(MusicDTO music : musics) {
					System.out.println(music.getId() + "\t" + 
							music.getTitle() + "\t" + 
							music.getSinger());
				}
				System.out.println("ID를 입력하세요.");
				String id = sc.nextLine();
				System.out.println("제목을 입력하세요.");
				String title = sc.nextLine();
				System.out.println("가수를 입력하세요.");
				String singer = sc.nextLine();
				dao.updateMusic(id, title, singer);

			}else if(menu==0) {
				System.out.println("시스템 종료");
				System.exit(0);
			}else {
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}		
	}
}
