package classes;

public class Contact {
	// 연락처 관리 프로그램
	// 클래스 이름 : Contact
	// 멤버필드 : id / name / phone
	// 멤버메서드 : getter&setter / constructor / default constructor
	// CRUD 중 C,R 기능을 구현
	// 이름 기반의 검색 기능 구현
	// 1. 신규 연락처 등록
	// 2. 연락처 목록출력
	// 3. 연락처 검색

	// 생성자
	public Contact() {}
	public Contact(String id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	// 멤버필드
	private String id;
	private String name;
	private String phone;

	// 멤버메서드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}







}
