
public class Exam02 {
   public static void main(String[] args) {
      
      
      
      double rand1 = Math.random();
      double rand2 = Math.random();
      double rand3 = Math.random();
      double rand4 = Math.random();
      
      System.out.println("0 ~ 9까지의 랜덤 수 :" + (int)(rand1*10));
      System.out.println("1 ~ 10까지의 랜덤 수 :"+ ((int)(rand2*10)+1));
      System.out.println("20 ~ 35까지의 랜덤 수 :"+ (int)(rand3*(35-20+1)+20));
      System.out.println("0 또는 1 :"+ (int)rand4);      
   }
}
