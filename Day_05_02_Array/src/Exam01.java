
public class Exam01 {
	public static void main(String[] args) {
		
		// 배열 생성 Step1. 참조변수 생성
//		int[] arr; // 배열을 저장할 주소 생성한것
		
		// 배열 생성 Step2. 배열 생성
//		new int[4]; // 힙메모리에다가 int형 변수 4개를 연달아 배열해달라는 코드
		
//		int[] arr = new int[4]; // 배열을 생성하는 문법 여기서 4는 인덱스 []의 개수가 1개이면 1차원 2개이면 2차원	arr의 자료형은 참조형, arr의 변수형은 배열형	
//		arr[0] = 5;		// 생성은 0부터 마지막은 n-1 // index 값은 offset
//		arr[1] = 10;
//		arr[2] = 15;
//		arr[3] = 20;
//		
//		for(int i = 0;i < 4;i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[] {5,10,15,20}; // 초기값을 넣어주기 조금 더 편함 초기값을 넣어줄거면 칸수를 적어야하고 초기값을 빼줄거면 칸수를 적어야함
		
		// char형 변수 4개를 묶어 배열로 만들고 0 ~ 3번칸에 각 'A', 'B', 'C', 'D'를 담아주세요
		// 변수이름은 arr1
//		char[] arr1 = new char[] {'A','B','C','D'};
//		
//		// String형 변수 3개를 묶어 배열로 만들고, 0~2번칸에 각 Hello Java Array를 담아주세요.
//		// 변수 이름은 arr2
//		String[] arr2 = new String[] {"Hello", "Java", "Array"};
//		System.out.println(arr2); // 이렇게 하면 arr2의 주소가 나온것
		
		// int형 변수 100개를 묶어 배열로 만들고, 0~99번칸에 1~100까지를 담아주세요.
		// 변수 이름은 arr3
		
		int[] arr3 = new int[100];
		for(int i = 0;i < arr3.length;i++){
			arr3[i] = i+1;
		}
		System.out.println(arr3[0]);
		System.out.println(arr3[99]);
		
		
		// char형 변수 26개를 묶어 배열로 만들고, 0 ~ 25번칸에 'A' ~ 'Z'까지를 담아주세요.
		// 변수 이름은 arr4
		char[] arr4 = new char[26];
		for(char i = 0;i < arr4.length;i++) {
			arr4[i] = (char)(65+i);
		}
		System.out.println(arr4[0]); // A
		System.out.println(arr4[25]); // Z
		
		
		
	
		
		
 		
		
		
		
		
		
	}
}
