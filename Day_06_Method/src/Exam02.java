
public class Exam02 {
	public static void main(String[] args) {
		
		String str = "Hello Java World";		
//		int result = str.length();
//		System.out.println(result);
		
		char result = str.charAt(0);
		System.out.println(result);
		
		boolean bool = str.startsWith("He");
		System.out.println(bool);
		
		boolean bool2 = str.contains("Java");  // boolean을 사용하면 의문문으로 바꿔서 포함하다가 아니라 포함하냐?로 생각하기
		System.out.println(bool2);
		
		
		String str2 = "ABCDE";
		char[] arr = str2.toCharArray();
		
		System.out.println(arr[0] + " : " + arr[1]);
		
		String str3 = "Apple#Orange#Strawberry";
		String[] words = str3.split("#");
		System.out.println(words[0] + " : " + words[1] + " : " + words[2]);
 		
		
		}
}
