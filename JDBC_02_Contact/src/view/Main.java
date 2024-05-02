package view;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import DAO.ContactDAO;
import DTO.ContactDTO;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactDAO dao = new ContactDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd"); 

		while(true) {
			try {
				System.out.println("=== 연락처 시스템");
				System.out.println("");
				System.out.println("1. 신규 등록");
				System.out.println("2. 목록 출력");
				System.out.println("3. 항목 삭제 ( ID로 삭제 )");
				System.out.println("4. 항목 수정 ( ID 기반으로 이름과 연락처 - 등록날짜는 수정된 시간으로 반영 )");
				System.out.println("5. 항목 검색 ( 이름으로 검색 )");
				System.out.println("0. 시스템 종료");
				System.out.print(">> ");

				int menu = Integer.parseInt(sc.nextLine());

				if(menu==1) {
					System.out.print("이름을 입력해주세요.");
					String name = sc.nextLine();
					System.out.print("핸드폰 번호를 입력해주세요.");
					String phone = sc.nextLine();
					System.out.print("시간을 입력해주세요.(yy.MM.dd)");
					String date = sc.nextLine();
					Date d= sdf.parse(date);
					Timestamp ts = new Timestamp(d.getTime());

					int result = dao.insert(new ContactDTO(0,name,phone,ts));

					if(result > 0) {
						System.out.println("입력 성공!");
					}
				}else if(menu==2) {
					ArrayList<ContactDTO>array = dao.selectAll();
					System.out.println("Id\tName\tPhone\tReg_date");

					for(ContactDTO people : array) {
						System.out.println(people.getId()+"\t"+people.getName()+"\t"+people.getPhone()+"\t"+people.getDate());
					}
				}else if(menu==3) {
					System.out.print("삭제하실 ID를 입력해주세요.");
					int id = Integer.parseInt(sc.nextLine());			
					int result = dao.deleteById(id);

					if(result > 0) {
						System.out.println("입력 성공!");
					}else {
						System.out.println("삭제할 대상을 찾을 수 없습니다.");
					}

				}else if(menu==4) {
					System.out.print("수정하실 ID를 입력해주세요.");
					int id = Integer.parseInt(sc.nextLine());
					
					boolean check = dao.tf(id);

					if(check==true) {
						System.out.print("이름을 입력하세요.");
						String name = sc.nextLine();
						System.out.print("핸드폰 번호를 입력하세요.");
						String phone = sc.nextLine();

						int result = dao.updateMenu(id, name, phone);

						if(result > 0) {
							System.out.println("입력 성공!");
						}
					}else {
						System.out.println("수정하실 ID를 찾을 수 없습니다.");
					}

				}else if(menu==5) {
					System.out.print("검색하실 이름을 입력해주세요.");
					String name = sc.nextLine();
					ArrayList<ContactDTO>result = dao.SearchByName(name);

					if(result.size()==0) {
						System.out.println("검색 대상을 찾을 수 없습니다.");
					}else {
						System.out.println("Id\tName\tPhone\tReg_timestamp");
						for(ContactDTO dto : result) {
							System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+dto.getPhone()+"\t"+dto.getDate());
						}
					}

				}else if(menu==0) {
					System.out.println("시스템 종료");
					System.exit(0);
				}else {
					System.out.println("메뉴를 다시 확인해주세요.");
				}
			}catch(Exception e){
				e.printStackTrace(); // 개발자가 보는 에러 메세지, 배포 단계에서는 이 코드를 뺌
				System.out.println("오류가 발생했습니다. 같은 오류가 반복되면 관리자에게 문의하세요.");
			}
		}
	}
}



