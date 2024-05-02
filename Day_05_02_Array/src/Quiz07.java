import java.util.Scanner;
public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 몇개를 구매하면 1등에 당첨을 할수 있을까

		int[] arr = new int[45]; // 1 ~ 45 숫자 만들기
		int[] number = new int[6]; // 당첨번호 6개
		int[] bonusnumber = new int[1];		// 보너스 번호

		int[] autonumber = new int[6];
		int[] autobonusnumber = new int[1]; 

		int wow = 0; // 맞은 번호 카운트 선언 및 초기화
		int wowbonus = 0; // 맞은 보너스 번호 카운트 선언 및 초기화

		long count = 0; // 시도 횟수
		long money = 0; // 사용 비용


		// 당첨 금액
		int winner1_money = 1600000000;  
		int winner2_money = 56000000; 
		int winner3_money = 1400000;
		int winner4_money = 50000;
		int winner5_money = 5000;

		// 당첨 횟수 
		long winner1_total = 0;
		long winner1_count = 0;

		long winner2_total = 0;
		long winner2_count = 0;

		long winner3_total = 0;
		long winner3_count = 0;

		long winner4_total = 0;
		long winner4_count = 0;

		long winner5_total = 0;
		long winner5_count = 0;

		// 당첨 확률
		double winner1_odds = 0;
		double winner2_odds = 0;
		double winner3_odds = 0;
		double winner4_odds = 0;
		double winner5_odds = 0;




		for(int i = 0;i < arr.length;i++) {
			arr[i] = i + 1;
		}
		while(true) {
			count++;
			wow=0;
			wowbonus=0;
		
		for(int i = 0;i < 50;i++) {
			int x = (int)(Math.random()*45);
			int y = (int)(Math.random()*45);
			int tmp = arr[x];
			arr[x] = arr[y];
			arr[y] = tmp;

		}
		for(int i = 0;i < 6;i++) {
			number[i] = arr[i];
		}
		System.out.println(count + " 회차");
		for(int i = 0;i < 6;i++) {
			System.out.println(autonumber[i]);
		}
		System.out.println("\t");
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(autonumber[i]==number[j]) {
					wow=wow+1;	
				}
				if(autobonusnumber[0]==bonusnumber[j]) {
					wowbonus=1;
				}
			}
		}
		//일치하는 숫자 있는지 끝
		if(wow==6) {
			System.out.println(" 1등 당첨!!!!!!");
			winner1_total+=	winner1_money;	
			winner1_count++;

			break;
		}else if(wow==5){//2등과 3등 판별
			//당첨번호가 5개 일치하면서 보너스 숫자가 일치하는지 확인
			if(wowbonus==1)
			{
				System.out.print(" 2등 당첨!!!!!!");
				winner2_total+=	winner2_money;	
				winner2_count++; 
			}
			//3등 당첨
			System.out.println(" 3등 당첨!!!");
			winner3_total+=	winner3_money;	
			winner3_count++;
		}else if(wow==4) {
			System.out.println(" 4등 당첨!!!");
			winner4_total+=	winner4_money;	
			winner4_count++;
		}else if(wow==3) {
			System.out.println(" 5등 당첨!!!");
			winner5_total+=	winner5_money;	
			winner5_count++;
		}else {
			System.out.println(" 꽝ㅠㅠ");
		}

		System.out.println();
	}
		
		


	}
}
