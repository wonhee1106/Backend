package quiz;

import classes.Animal;
import classes.Cat;
import classes.Dog;

public class Quiz01 {
	public static void main(String[] args) {
		
		// 컬렉션 , 다형성 , 실습		
		Animal[] animals = new Animal[5];		
		animals[0] = new Dog("Hodu");
		animals[1] = new Cat("Navi");
		animals[2] = new Dog("Browny");
		
		for(int i = 0;i < 3;i++) {
			System.out.println(animals[i].sound());
		}
				
	}
}
