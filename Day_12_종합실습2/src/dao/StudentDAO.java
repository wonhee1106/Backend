package dao;

import java.util.ArrayList;

import dto.StudentDTO;

public class StudentDAO {
	
	private ArrayList<StudentDTO>students = new ArrayList<>();
	
	public void addStudent(StudentDTO student) {
		this.students.add(student);
	}
	
	public ArrayList<StudentDTO>getStudents(){
		return this.students;
	}
	
	public ArrayList<StudentDTO>searchByName(String name){
		ArrayList<StudentDTO>result = new ArrayList<>();
		for(StudentDTO dto : students) {
			if(dto.getName().contains(name)) {
				result.add(dto);
			}
		}
		return result;
	}
	public void delStudent(int id) {
		for(int i = 0;i < students.size();i++) {
			if(students.get(i).getId()==id) {
				students.remove(i);
				break;
			}
		}
	}
	public void updateStudent(int id, String name,
			int kor, int eng, int math) {
		for(int i = 0;i < students.size();i++) {
			if(students.get(i).getId()==id) {
				students.set(i, new StudentDTO(id, name, kor, eng, math));
			}
		}
	}
}
