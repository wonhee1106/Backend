package view;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.TravelDAO;
import DTO.TravelDTO;

public class Travel {
	public static void main(String[] args) {
		//		<< 여행 예약 관리 시스템 >>
		//
		//		1. 새로운 여행 예약 추가
		//		2. 예약 목록 출력
		//		3. 특정 예약 상세 정보 검색 (예약 번호 또는 고객명으로 검색)
		//		4. 예약 취소 (예약 번호로 취소)
		//		5. 예약 수정 (예약 번호로 수정: 수정 대상은 예약 내용을 제외한 모든 항목)
		//		0. 시스템 종료

		Scanner sc = new Scanner(System.in);
		TravelDAO dao = new TravelDAO();
		while(true) {
			try {
				System.out.println("<< 여행 예약 관리 시스템 >>");
				System.out.println("");
				System.out.println("1. 새로운 여행 예약 추가");
				System.out.println("2. 예약 목록 출력");
				System.out.println("3. 예약 정보 검색 ( 고객명으로 검색 )");
				System.out.println("4. 예약 취소 ( 예약 번호로 취소 )");
				System.out.println("5. 예약 수정 ( 예약 번호로 수정 )");
				System.out.println("0. 시스템 종료");

				int menu = Integer.parseInt(sc.nextLine());

				if(menu==1) {

					System.out.print("예약자 이름을 입력해주세요.");
					String name = sc.nextLine();
					System.out.print("전화번호를 입력해주세요.");
					String phone = sc.nextLine();
					System.out.print("여행지를 입력해주세요.");
					String spot = sc.nextLine();

					int result = dao.addnum(new TravelDTO(0,name,phone,spot));
					if(result > 0) {
						System.out.println("예약 성공!");
					}
				}else if(menu==2) {
					ArrayList<TravelDTO>tourists = dao.selectAll();
					System.out.println("Code\tName\tPhone\tSpot");
					
					for(TravelDTO tourist : tourists) {
						System.out.println(tourist.getCode()+"\t"+tourist.getName()+"\t"+
								tourist.getPhone()+"\t"+tourist.getSpot());
					}
				}else if(menu==3) {
					System.out.print("검색하실 예약자 이름을 입력해주세요.");
					String name = sc.nextLine();
					ArrayList<TravelDTO>result = dao.searchByName(name);
					
					if(result.size()==0) {
						System.out.println("검색하신 예약자를 찾을 수 없습니다.");
					}else {
						System.out.println("Code\tNmae\tPhone\tSpot");
						for(TravelDTO reservation : result) {
							System.out.println(reservation.getCode()+"\t"+
									reservation.getName()+"\t"+reservation.getPhone()+"\t"+
									reservation.getSpot());
						}
					}
				}else if(menu==4) {
					System.out.print("취소하실 예약번호를 입력해주세요.");
					int code = Integer.parseInt(sc.nextLine());
					int result = dao.deleteByCode(code);
					if(result > 0 ) {
						System.out.println("취소가 정상 처리되었습니다.");
					}else {
						System.out.println("예약자를 찾을 수 없습니다.");
					}
				}else if(menu==5) {
					System.out.print("수정하실 예약 번호를 입력해주세요.");
					int code = Integer.parseInt(sc.nextLine());
					
					boolean check = dao.tf(code);
					
					if(check==true) {
						System.out.print("예약자 이름을 입력해주세요.");
						String name = sc.nextLine();
						System.out.print("전화번호를 입력해주세요.");
						String phone = sc.nextLine();
						System.out.print("여행지를 입력해주세요.");
						String spot = sc.nextLine();
						
						int result =  dao.updateData(code, name, phone, spot);
						
						if(result > 0) {
							System.out.println("수정 성공!");
						}else {
							System.out.println("예약자를 찾을 수 없습니다.");
						}
					}
				}else if(menu==0) {
					System.out.println("시스템 종료");
					System.exit(0);
				}else {
					System.out.println("메뉴를 다시 선택해주세요.");
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("오류가 발생했습니다.");
			}
		}
	}
}
