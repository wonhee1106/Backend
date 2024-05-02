
public class Exam01 {
   public static void main(String[] args) {

      // 난수 (Random Number)
      // 사용자도 개발자도 예상할 수 없는 어떤 미지의 값
      // 부루마블 게임의 주사위 또는 카드게임의 패 값 등을 예시로 들수있다. 

      //double rand = Math.random(); //랜덤으로 나오는 예상할 수 없는 double 값 하나
      // 랜덤값의 범위 : 0 ~ 1 사이의 실수값

      for(int i = 0;i < 100; i++) {

         double rand = Math.random(); 
         //여기에서 선언 해주는 이유: 
         //안그러면 위에 생성된 동일한 랜덤값을 반복되게 되어 동일한 값 출력
         System.out.println((int)(rand * 6)+1);
      }
      
      // 34 ~ 72 사이의 난수?
      // 시간을 들이면 당연히 구할 수 있으나 시간이 아깝다.
      // 공식을 활용해서 풀어야 한다.
      // 난수 최대값 : Y  / 난수 최소값 : X
      // 난수 범위 조정 공식 : 난수 * (Y-X+1)+X
      // -> (72 - 34 + 1) -> (rand * 39(=72 - 34 + 1) + 34)
      
      
      
      
   }
}

