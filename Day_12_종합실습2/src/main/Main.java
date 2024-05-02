package main;

import java.util.ArrayList;
import java.util.Scanner;

import dao.StudentDAO;
import dto.StudentDTO;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();

		while(true) {
			System.out.println("=== 학생 관리 시스템 ===");
			System.out.println("");
			System.out.println("1. 신규 학생 등록");
			System.out.println("2. 학생 목록 출력");
			System.out.println("3. 학생 정보 검색 ( 이름으로 검색 )");
			System.out.println("4. 학생 정보 삭제 ( ID로 삭제 )");
			System.out.println("5. 학생 정보 수정 ( ID로 수정 - 이름, 국어, 영어, 수학 - Optional (날짜)");
			System.out.println("6. 시스템 종료");

			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
							System.out.print("학번을 입력해주세요.");
							int id = Integer.parseInt(sc.nextLine());
							
							System.out.print("이름을 입력해주세요.");
							String name = sc.nextLine();
							
							System.out.print("국어 점수를 입력해주세요.");
							int kor = Integer.parseInt(sc.nextLine());
							
							System.out.print("영어 점수를 입력해주세요.");
							int eng = Integer.parseInt(sc.nextLine());
							
							System.out.print("수학 점수를 입력해주세요.");
							int math = Integer.parseInt(sc.nextLine());
							
							dao.addStudent(new StudentDTO(id,name,kor,eng,math));
//				dao.addStudent(new StudentDTO(1000,"lee",70,80,90));

			}else if(menu==2) {
				ArrayList<StudentDTO> students = dao.getStudents();

				System.out.println("Id\tName\tKor\tEng\tMath\tSum\tAvg");
				for(StudentDTO student : students) {
					System.out.println(student.getId()+"\t"+
							student.getName()+"\t"+
							student.getKor()+"\t"+
							student.getEng()+"\t"+
							student.getMath()+"\t"+
							student.getSum()+"\t"+
							student.getAvg()
							);				
				}
			}else if(menu==3) {
				System.out.print("학생 이름을 입력해주세요.");
				String name = sc.nextLine();
				ArrayList<StudentDTO> result = dao.searchByName(name);

				if(result.size()==0) {
					System.out.println("검색하신 학생을 찾을 수 없습니다.");
				}else {
					System.out.println("ID\tName\tKor\tEng\tMath\tSum\tAvg");
				}for(StudentDTO dto : result) {
					System.out.println(dto.getId()+"\t"+dto.getName()+"\t"+
							dto.getKor()+"\t"+dto.getEng()+"\t"+dto.getMath()+"\t"+
							dto.getSum()+"\t"+dto.getAvg()
							);				
				}
			}else if(menu==4) {
				ArrayList<StudentDTO>students = dao.getStudents();
				System.out.print("삭제하실 학생을 선택해주세요.");
				System.out.println("Id\tName\tKor\tEng\tMath\tSum\tAvg");
				for(StudentDTO student : students) {
					System.out.println(student.getId()+"\t"+
							student.getName()+"\t"+student.getKor()+"\t"+
							student.getEng()+"\t"+student.getMath()+"\t"+
							student.getSum()+"\t"+student.getAvg());
				}
				int id = Integer.parseInt(sc.nextLine());
				dao.delStudent(id);
			}else if(menu==5) {
				ArrayList<StudentDTO>students = dao.getStudents();
				System.out.println("수정하실 학생을 선택해주세요.");
				System.out.println("Id\tName\tKor\tEng\tMath\tSum\tAvg");
				for(StudentDTO student : students) {
					System.out.println(student.getId()+"\t"+
							student.getName()+"\t"+student.getKor()+"\t"+
							student.getEng()+"\t"+student.getMath()+"\t"+
							student.getSum()+"\t"+student.getAvg());
				}
				System.out.print("학번을 입력하세요.");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("이름을 입력하세요.");
				String name = sc.nextLine();
				System.out.print("국어 점수를 입력하세요.");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 점수를 입력하세요.");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 점수를 입력하세요.");
				int math = Integer.parseInt(sc.nextLine());

				dao.updateStudent(id, name, kor, eng, math);
			}else if(menu==6) {
				System.out.println("시스템 종료");
				System.exit(0);
			}else {
				System.out.println("다시 입력해주세요");
			}
		}		
	}
}
