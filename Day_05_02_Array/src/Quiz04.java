
public class Quiz04 {
	public static void main(String[] args) {

		int[] arr = new int[] {97, 63, 57, 21, 30, 18};

		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("=======정렬 전");


		for(int i = 0;i < arr.length-1;i++) {
			System.out.println();
		}
		for(int j=0; j<arr.length-1;j++) {//버블 sort n-1회차 비교(3회)
	         for(int i = 0; i<arr.length-1;i++) {//버블 sort n-1번 1회차 비교(3회)
	            if(arr[i]>arr[i+1]) {
	               int tmp = arr[i];
	               arr[i] = arr[i+1];
	               arr[i+1] = tmp;         
	            }
	         }
	      }


		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("=======정렬 후");

	}
}
