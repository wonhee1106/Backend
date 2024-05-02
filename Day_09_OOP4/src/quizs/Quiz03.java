package quizs;

import java.util.Scanner;

import classes.Contact;
import models.ContactManager;

public class Quiz03 {
	public static void main(String[] args) {

		// 연락처 관리 프로그램
		// 클래스 이름 : Contact
		// 멤버필드 : id / name / phone
		// 멤버메서드 : getter&setter / constructor / default constructor
		// CRUD 중 C,R 기능을 구현
		// 이름 기반의 검색 기능 구현
		// 1. 신규 연락처 등록
		// 2. 연락처 목록출력
		// 3. 연락처 검색

		Scanner sc = new Scanner(System.in);
		ContactManager manager = new ContactManager();



		while(true) {
			System.out.println("===연락처===");
			System.out.println("1. 신규 연락처 등록");
			System.out.println("2. 연락처 목록 출력");
			System.out.println("3. 연락처 검색");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				System.out.print("ID 입력 : ");
				String id = sc.nextLine();

				System.out.print("이름 입력 : ");
				String name = sc.nextLine();

				System.out.print("번호 입력 : ");
				String phone = sc.nextLine();

				manager.addContact(new Contact(id,name,phone));
			}else if(menu==2) {

				Contact[] cts = manager.getCts();

				System.out.println("ID\t이름\t번호");
				for(int i = 0;i < manager.getIndex();i++) {
					System.out.println(cts[i].getId() + "\t" + 
							cts[i].getName() + "\t" +
							cts[i].getPhone());               
				}
			}else if(menu == 3) {
				System.out.println("이름을 입력해주세요");
				String name = sc.nextLine();
				Contact[] cts = manager.getCts();

				int count = 0;
				for(int i = 0; i < manager.getIndex();i++) {
					if(cts[i].getName().contains(name)){
						System.out.println(cts[i].getId() + "\t" + 
								cts[i].getName() + "\t"+
								cts[i].getPhone()) ;  
						count++;
					}
				}
				if(count == 0) {
					System.out.println("검색 대상이 없습니다.");
				}


			}else if(menu==3) {

			}

		}

	}
}




