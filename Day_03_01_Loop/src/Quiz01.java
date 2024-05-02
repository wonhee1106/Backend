
public class Quiz01 {
	public static void main(String[] args) {
		// 1 ~ 100까지 출력하는 프로그램 작성
		
//		int count = 100;		
//		while(count<=100) {
//			System.out.println(count + " : 출력값");
//			count++;
//		}
//		int count = 100;
//		while(count < 100) {
//			System.out.println(count + " : 출력값");
//			--count;
//		}
		
//		int count = 0;
//		while (count <= 100) {
//		    System.out.println(count++);
//		    if (count <= 9) {
//		        while (count <= 9)
//		            System.out.print(count++);
//		    } else if (count <= 19) {
//		        while (count <= 19)
//		            System.out.print(count++);
//		    } else if (count <= 29) {
//		        while (count <= 29)
//		            System.out.print(count++);
//		    } else if (count <= 39) {
//		        while (count <= 39)
//		            System.out.print(count++);
//		    } else if (count <= 49) {
//		        while (count <= 49)
//		            System.out.print(count++);
//		    } else if (count <= 59) {
//		        while (count <= 59)
//		            System.out.print(count++);
//		    } else if (count <= 69) {
//		        while (count <= 69)
//		            System.out.print(count++);
//		    } else if (count <= 79) {
//		        while (count <= 79)
//		            System.out.print(count++);
//		    } else if (count <= 89) {
//		        while (count <= 89)
//		            System.out.print(count++);
//		    }else {
//		    	System.out.print(count++);
//		    }
		
		int count = 0;
		while(count < 100) {
			count++;
			System.out.print(count + " ");
			if(count % 10 == 0) {
				System.out.println();
			}
		
		
		}
	}
}
