package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.CafeDAO;
import DTO.CafeDTO;

public class Main {
	// caller method
	// main method는 예외를 전가해선 안 된다.
	public static void main(String[] args){

		// 카페 메뉴 관리 시스템
		// 디자인 패턴 : MV 패턴 적용
		// CafeDTO 
		// 멤버필드 : id, name, price
		// 멤버메서드 : getter / setter / constructor / default constructor

		// CafeDAO
		// 멤버필드 : menus 컬렉션
		// 멤버메서드 : CRUD 기능을 모두 구현

		// Main
		// 1. 신규 메뉴 등록
		// 2. 메뉴 목록 출력
		// 3. 메뉴 정보 검색 ( name으로 검색 )
		// 4. 메뉴 삭제 ( ID로 삭제 )
		// 5. 메뉴 수정 ( ID로 수정 : 수정 대상은 ID를 제외한 모든 항목 )
		// 0. 시스템 종료

		Scanner sc = new Scanner(System.in);
		CafeDAO dao = new CafeDAO();



		while(true) {
			try {
				System.out.println("<< Cafe >>");
				System.out.println();
				System.out.println("1. 신규 메뉴 등록");
				System.out.println("2. 메뉴 목록 출력");
				System.out.println("3. 메뉴 정보 검색 ( name 으로 검색 )");
				System.out.println("4. 메뉴 삭제 ( ID로 삭제 )");
				System.out.println("5. 메뉴 수정 (ID로 수정 : 수정 대상은 ID를 제외한 모든 항목 )");
				System.out.println("0. 시스템 종료");


				int num = Integer.parseInt(sc.nextLine());

				if(num == 1) {


					System.out.print("메뉴 이름을 입력해주세요");
					String name = sc.nextLine();
					System.out.print("메뉴 가격을 입력해주세요");
					int price = Integer.parseInt(sc.nextLine());
					int result = dao.adddto(new CafeDTO(0,name, price));
					
					if(result > 0) {
						System.out.println("입력 성공!");
					}

				}else if(num==2) {
					
					
					List<CafeDTO> array = dao.selectAll();
					System.out.println("Id\tName\tPrice");
					
					for(CafeDTO menu : array) {
						System.out.println(menu.getId() + "\t" +
								menu.getName()+ "\t" +
								menu.getPrice());
					}

				}else if(num==3) {
					System.out.print("메뉴 이름을 입력해주세요");
					String name = sc.nextLine();
					ArrayList<CafeDTO> result = dao.SearchByName(name);

					if(result.size()==0) {
						System.out.println("검색하신 메뉴가 없습니다");
					}else {
						System.out.println("Id\tName\tPrice");
						for(CafeDTO dto : result) {
							System.out.println(dto.getId()+ "\t" +
									dto.getName()+"\t"+
									dto.getPrice());
						}
					}


				}else if(num==4) {
					System.out.print("삭제하실 메뉴의 ID를 입력해주세요.");
					int id = Integer.parseInt(sc.nextLine());
					int result=dao.deleteById(id);
					
					if(result > 0) {
						System.out.println("입력 성공!");
					}
					else {
						System.out.println("삭제할 대상을 찾을 수 없습니다.");
					}

				}
				else if(num==5) {
					
					System.out.print("수정하실 메뉴의 ID를 입력해주세요");
					int id = Integer.parseInt(sc.nextLine());
					
					// 대상이 존재하는지 먼저 검사 후,
					// 존재 한다면 아래 입력을 진행한다.
					
					boolean check = dao.tf(id);
					if(check==true) {
						System.out.print("이름을 입력해주세요");
						String name = sc.nextLine();

						System.out.print("가격을 입력해주세요");
						int price = Integer.parseInt(sc.nextLine());
						
						int result = dao.updateMenu(id, name, price);
						
						if(result > 0) {
							System.out.println("입력 성공!");
						}
					}else {
						System.out.println("수정할 대상을 찾을 수 없습니다.");
					}
					
				}else if(num==0) {
					System.out.println("시스템 종료");
					System.exit(0);
				}else {
					System.out.print("다시 입력해주세요.");
				}



			}catch(Exception e){
				e.printStackTrace();
				System.out.println("오류가 발생했습니다. 같은 오류가 반복되면 관리자에게 문의하세요.");
			} 
		}//while
	}
}
