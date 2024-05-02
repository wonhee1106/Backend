package classes;

abstract public class Animal {
	
	private String name;
	
	public Animal() {}
	
	abstract public String sound();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
	
	
	

}
