
public class Exam02 {
	public static void main(String[] args) {
		String[] arr = new String[10];
		arr[0] = "Hello";
		arr[1] = "World";
		arr[2] = "Java";
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = arr[3];
		System.out.println("==============");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		arr[2] = arr[1];
		arr[1] = "Collection";
		System.out.println("==============");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr.length);
		
	}
}
