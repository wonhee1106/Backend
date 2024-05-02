package classes;

public class Dog extends Animal{
	public Dog() {}
	
	
	public Dog(String name) {
		super(name);
				
	}
	
	public String sound() {
		return this.getName()+ " : BowWow";
	}

}
