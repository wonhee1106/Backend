import java.util.Scanner;

public class Quiz08 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int num1 = 0;
      int num2 = 0;
      
      while(true) {
         System.out.println("=== 계산기 프로그램 ===");
         System.out.print("연산자입력 (+,-,*,/,[q:종료]) : ");
         String oper = sc.nextLine();

         if (oper.equals("q")) {
            System.out.println("계산기를 종료합니다.");
            System.exit(0);
         }else if(!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
            System.out.println("연산자를 다시 확인해주세요.");
            continue;
         }

         
         while(true) {
            try {
               System.out.print("첫 번째 수 : ");
               num1 = Integer.parseInt(sc.nextLine());
               break;
            }catch(Exception e) {
               System.out.println("숫자만 입력 가능합니다.");
            }
         }


         while(true) {
            try {
               System.out.print("두 번째 수 : ");
               num2 = Integer.parseInt(sc.nextLine());
               break;
            }catch(Exception e) {
               System.out.println("숫자만 입력 가능합니다.");
            }
         }


         System.out.println("=== 결 과 ===");

         if (oper.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
         } else if (oper.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
         } else if (oper.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
         } else if (oper.equals("/")) {
            System.out.println(num1 + " / " + num2 + " = " + ((double)num1/num2));
         }


      }
   }
}
