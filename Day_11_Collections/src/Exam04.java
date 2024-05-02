
public class Exam04 {
	public static void main(String[] args) {
		
		String[] arr = new String[] {"Hello","World"};
		

		for(String str : arr) {           // 무조건 전체 데이터를 다 순회한다.
			System.out.println(str);			
		}
		
//		for(int i = 0;i < arr.length;i++) {		// 순회 부분 지정 가능 i값이 필요하냐 필요 없냐에 따라 사용
//			System.out.println(arr[i]);
//		}
	}
}
