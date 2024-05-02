package dao;

import java.util.ArrayList;

import classes.Member;

public class MemberDAO {  //  DAO : Data Access Object 데이터를 접근하는 목적의 객체
//	private Silver[] silverMembers = new Silver[10];
//	private Gold[] goldMembers = new Gold[10];
	
	private ArrayList<Member> members = new ArrayList<>();	
	
	
	
	public void addMember(Member member) {
		this.members.add(member);
	}	
	
	public ArrayList<Member> getMembers() {		
		return this.members;
	}
				
	public int getSize() {
		return this.members.size();
	}
	
}
