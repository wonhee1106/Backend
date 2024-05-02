package DTO;

public class TravelDTO {
	private int code;
	private String name;
	private String phone;
	private String spot;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	public String getSpot() {
		return spot;
	}
	public void setSpot(String spot) {
		this.spot = spot;
	}
	
	
	public TravelDTO() {}
	
	
	public TravelDTO(int code, String name, String phone, String spot) {
		super();
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.spot = spot;
	}
	
	
	
	
}
