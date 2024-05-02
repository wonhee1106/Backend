import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello를 몇 번 출력하시겠습니까?");
        
        int count = Integer.parseInt(sc.nextLine());        
        int i = 0;
        while (i < count) {
            System.out.println("Hello");
            i++;
        }
    }
}
