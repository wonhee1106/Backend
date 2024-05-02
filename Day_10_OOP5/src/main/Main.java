package main;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Gold;
import classes.Member;
import classes.Silver;
import dao.MemberDAO;

public class Main {
	public static void main(String[] args) {
		
		
		// A is a B : A는 B이다.
		// ex> Bear is a [ ]
		// ex> Lion is a [ ]
		
		// 현 회원관리시스템의 치명적인 문제점 3가지
		// 1. 코드 중복도 - 상속 ( IS - A 관계 )을 이용해서 해결
		//				 > 상속은 하나의 클래스만 가능하다. A extends B,C 는 불가
		//				 > A를 상속받은 B를 상속받은 C를 만드는 다중 상속은 가능
		
		// 2. 코드 결합도 - 다형성을 이용해서 해결
		
		// 3. 저장소 문제 - 컬렉션을 이용해서 해결
		
		
		Scanner sc = new Scanner(System.in);
		MemberDAO manager = new MemberDAO();
		
		while(true) {
			System.out.println("<< 회원 관리 시스템 >>");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 목록 출력");
			System.out.println("0. 시스템 종료");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {
				
				manager.addMember(new Silver("1001", "Tom",1000));     // DTO : Data Transfer Object 등급  데이터를 담는데 사용되는 일종의 틀이며,
				manager.addMember(new Silver("1002", "Susan",2000));   // 데이터를 간단한 형태로 전달하기 위해 사용됩니다. 주로 다음과 같은 상황에서 사용
				manager.addMember(new Gold("1003", "James", 3000));													  
				

			}else if(menu == 2) {				
				ArrayList<Member> members = manager.getMembers();
				
				System.out.println("ID\tName\tPoint\tBonus");
				for(Member member : members) {
					System.out.println(member.getId() + "\t" + 
							member.getName() + "\t" + 
							member.getPoint() + "\t" +
							member.getBonus());
				}
				
			}else if(menu == 0) {
				System.out.println("시스템 종료");
				System.exit(0);
			}else {
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}

	}
}
