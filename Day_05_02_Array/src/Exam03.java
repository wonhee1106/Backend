
public class Exam03 {
	public static void main(String[] args) {
		
//		int A = 15;
//		int B = 20;
//		
//		System.out.println(A + " : " + B);
//		
//		int tmp = A; // SWAP - 교환 기법
//		A = B;
//		B = tmp;
//		System.out.println(A + " : " + B);
		
		int[] arr = new int[] {10,20};
		
		System.out.println(arr[0] + " : " + arr[1]);		
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		System.out.println(arr[0] + " : " + arr[1]);
	}
}	
