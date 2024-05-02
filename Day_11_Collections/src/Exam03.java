import java.util.ArrayList;
import java.util.Scanner;


public class Exam03 {
	public static void main(String[] args) {
		
		// Object : 자바에 존재한느 모든 클래스타입의 최고 조상
		// 자바에 존재하는 모든 클래스는 Object를 상속 받게 되어있다.
		// Object는 다형성의 꼭대기이므로 모든 변수 타입을 다 가질 수 있다. 
		// 다형성은 꼭 필요할때가 아니면 최대한 사용을 자제하는것이 좋다.
		
		
		ArrayList<String> arr = new ArrayList<>();  // String Generic Type
		arr.add("Hello");
		arr.add("World");
		arr.add("Java");
		
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));		
		arr.remove(0);		
		System.out.println("=========");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		arr.add(1, "Collection");
		System.out.println("=========");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		System.out.println(arr.size());
		
		
	}
}
