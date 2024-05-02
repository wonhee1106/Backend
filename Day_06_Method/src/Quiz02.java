
public class Quiz02 {
	public static int countA(String str){
		int count = 0;
		for(int i = 0;i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch ==  'A') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "kasdjkfJKKjkfjknkjsjdaNFJKNSKANFnnkjAAAAAAAafnknkasdnfkjnsadfnknasj"
				+ "sadlfnsndlnflkasnldfnslkdafnklwenrwlkernlwqnekrnlqwnklrnwe";
		
		int count = countA(str);		
		System.out.println(count);
	}
}
