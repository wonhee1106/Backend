import java.util.Scanner;

public class Quiz01 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      while(true) {
         
         System.out.println("동전 앞 뒤 맞추기 게임");
         System.out.print("숫자를 입력해주세요[ 1.앞면 / 2.뒷면 ] >>");
         int num = Integer.parseInt(sc.nextLine());

         if(num==1||num==2) {

               if(((int)(Math.random() * 2)+1) == num ) {
                  System.out.println("맞췄습니다.");
               }else{
                  System.out.println("틀렸습니다.");
               }
               System.out.println();
               System.out.println("게임을 재시작합니다.");
               System.out.println("--------------------");
            }
         else {
            System.out.println();
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            System.out.println("--------------------");
         }

      }
   }
}
