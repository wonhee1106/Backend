
public class Quiz05 {
	public static void main(String[] args) {

		int[] arr = new int[] {15, 24, 35, 99, 86, 34, 13, 27, 46, 66};

		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("=======정렬 전");		

		for(int j = 0; j < arr.length-1;j++) {
			for(int i = 0;i < arr.length-1;i++) {
				if(arr[i]>arr[i+1] ) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		for (int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		System.out.println("정렬 후");



	}
}
