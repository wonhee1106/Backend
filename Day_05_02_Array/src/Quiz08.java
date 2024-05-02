import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {

		//입력을 위한 것
		Scanner sc = new Scanner(System.in);

		//변수 선언하기 시작

		int menu=0; //자동,수동 선택
		int re_menu=0;

		int[] numbers= new int[45]; //1~45 숫자 만들기용

		int[] thisweek_number= new int[6]; //금주 당첨 번호 6개
		int thisweek_bonusnumber;//금주당첨 보너스번호

		//int[] autonumbers= new int[6]; //자동 번호 6개
		//int autonumbers_bonusnumber; //자동 보너스번호 

		int[] mynumbers= new int[6]; //수동번호 6개
		//int mynumbers_bonusnumber; //수동 보너스번호

		int wow=0; //맞은번호 카운트 선언 및 초기화
		int wowbonus=0; //보너스번호 맞은거 카운트 선언 및 초기화

		long try_count=0; //총시도횟수 
		long try_money=0; //총사용비용

		//상금
		int winner1_price=1600000000;
		int winner2_price=56000000;
		int winner3_price=1400000;
		int winner4_price=50000;
		int winner5_price=5000;



		//1등 집계용
		long winner1_total=0;		
		long winner1_count=0;

		//2등 집계용
		long winner2_total=0;		
		long winner2_count=0;

		//3등 집계용
		long winner3_total=0;		
		long winner3_count=0;

		//4등 집계용
		long winner4_total=0;		
		long winner4_count=0;

		//5등 집계용
		long winner5_total=0;		
		long winner5_count=0;

		//확률
		double winner1_odds=0d;
		double winner2_odds=0d;
		double winner3_odds=0d;
		double winner4_odds=0d;
		double winner5_odds=0d;

		//변수 선언하기 끝




		//1~45숫자 만들기
		for(int i=0;i<45;i++) {
			numbers[i]=i+1;
		}
		
		while(true) {
		//금주의 로또당첨번호 뽑기용 카드섞기
		for(int i=0;i<100;i++) {
			int x=(int)(Math.random()*(44-0+1)+0);
			int y=(int)(Math.random()*(44-0+1)+0);
			int temp;
			temp =numbers[x];
			numbers[x]=numbers[y];
			numbers[y]=temp;
		}
		//금주의 로또당첨번호 가져오기
		for(int i=0;i<6;i++) {
			thisweek_number[i]=numbers[i];
		}
		thisweek_bonusnumber=numbers[7];


		//자동, 수동으로 할지 선택
		while(true) {
			System.out.println("**********************************");
			System.out.println("**** 로      또      시     뮬     레    이    터 *****");
			System.out.println("*********************************");
			System.out.println("1.수동번호 한번 구매");
			System.out.println("2.1등이 될 때까지 자동번호 구매");
			System.out.println("3.종료");
			System.out.print("메뉴선택 > ");
			menu=Integer.parseInt(sc.nextLine());

			if(menu==1){
				try_count=0;
				while(true) { // 수동번호를 구매하기로 함
					System.out.println("******* 수    동   번    호     구    매  ******");
					System.out.println("*******구입하려는 번호를 입력하세요.******");	
					for(int i=0;i<6;i++) {	
						System.out.print((i+1)+"번째 구매번호 : ");
						mynumbers[i]=Integer.parseInt(sc.nextLine());
					}

					try_count++;
					//일치하는 숫자 있는지 확인
					for(int i=0;i<6;i++) {
						for(int j=0;j<6;j++) {
							if(mynumbers[i]==thisweek_number[j]) {
								wow=wow+1;
							}
							if(mynumbers[i]==thisweek_bonusnumber) {
								wowbonus=1;
							}
						}
					}

					//구입한 수동 로또 번호 출력
					System.out.println();
					System.out.println("구매한 수동 번호");
					for(int i=0;i<6;i++) {
						System.out.print("("+mynumbers[i]+") ");
					}

					//구입한 수동 로또 번호 출력 끝


					//일치하는 숫자 있는지 끝
					if(wow==6) {
						System.out.println(" 1등 당첨!!!!!!");
						winner1_total+=	winner1_price;	
						winner1_count++;
						break;
					}else if(wow==5){//2등과 3등 판별
						//당첨번호가 5개 일치하면서 보너스 숫자가 일치하는지 확인
						if(wowbonus==1)
						{
							System.out.print(" 2등 당첨!!!!!!");
							winner2_total+=	winner2_price;	
							winner2_count++; 
						}
						//3등 당첨
						System.out.println(" 3등 당첨!!!");
						winner3_total+=	winner3_price;	
						winner3_count++;
					}else if(wow==4) {
						System.out.println(" 4등 당첨!!!");
						winner4_total+=	winner4_price;	
						winner4_count++;
					}else if(wow==3) {
						System.out.println(" 5등 당첨!!!");
						winner5_total+=	winner5_price;	
						winner5_count++;
					}else {
						System.out.println(" 꽝ㅠㅠ");
					}
					System.out.println();
					break;
				}
			}else if(menu==2){
				try_count=0;
				//1등 될때까지 자동번호 시도하기
				while(true) {
					try_count++;
					wow=0; //맞은번호 카운트 선언 및 초기화
					wowbonus=0; //보너스번호 맞은거 카운트 선언 및 초기화
					// 자동번호 뽑기용 카드섞기
					for(int i=0;i<100;i++) {
						int x=(int)(Math.random()*(44-0+1)+0);
						int y=(int)(Math.random()*(44-0+1)+0);
						int temp;
						temp =numbers[x];
						numbers[x]=numbers[y];
						numbers[y]=temp;
					}

					//자동번호 가져오기
					for(int i=0;i<6;i++) {
						mynumbers[i]=numbers[i];
					}
					//autonumbers_bonusnumber=numbers[7];
					System.out.print(try_count+"번째 구입한 로또 : ");
					for(int i=0;i<6;i++) {
						System.out.print("("+mynumbers[i]+") ");
					}
					System.out.print("\t");
					//System.out.print(" 보너스 :" + autonumbers_bonusnumber +"\t");


					//일치하는 숫자 있는지 확인
					for(int i=0;i<6;i++) {
						for(int j=0;j<6;j++) {
							if(mynumbers[i]==thisweek_number[j]) {
								wow=wow+1;
							}
							if(mynumbers[i]==thisweek_bonusnumber) {
								wowbonus=1;
							}
						}
					}
					//일치하는 숫자 있는지 끝
					if(wow==6) {
						System.out.println(" 1등 당첨!!!!!!");
						winner1_total+=	winner1_price;	
						winner1_count++;

						break;
					}else if(wow==5){//2등과 3등 판별
						//당첨번호가 5개 일치하면서 보너스 숫자가 일치하는지 확인
						if(wowbonus==1)
						{
							System.out.print(" 2등 당첨!!!!!!");
							winner2_total+=	winner2_price;	
							winner2_count++; 
						}
						//3등 당첨
						System.out.println(" 3등 당첨!!!");
						winner3_total+=	winner3_price;	
						winner3_count++;
					}else if(wow==4) {
						System.out.println(" 4등 당첨!!!");
						winner4_total+=	winner4_price;	
						winner4_count++;
					}else if(wow==3) {
						System.out.println(" 5등 당첨!!!");
						winner5_total+=	winner5_price;	
						winner5_count++;
					}else {
						System.out.println(" 꽝ㅠㅠ");
					}

					System.out.println();
				}
				//1등 될때까지 자동번호 시도하기 끝

			}else if(menu==3) {
				System.exit(0);
			}
			break;
		}

		//집계 및 출력
		try_money=try_count*1000; //총 구매금액 = 총시도횟수*1000원

		winner1_odds=winner1_count/(double)try_count;
		winner2_odds=winner2_count/(double)try_count;
		winner3_odds=winner3_count/(double)try_count;
		winner4_odds=winner4_count/(double)try_count;
		winner5_odds=winner5_count/(double)try_count;




		//금주의 로또 당첨 번호 출력
		System.out.println();
		System.out.println("***** 금주의 로또 당첨 번호 *****");
		for(int i=0;i<6;i++) {
			System.out.print("("+thisweek_number[i]+") ");
		}
		System.out.print("\t 보너스 :" + thisweek_bonusnumber);

		System.out.println();
		System.out.println();
		System.out.println("총 구매횟수 : " + try_count);
		System.out.println("총 구매금액 : " + try_money);
		System.out.println();
		System.out.println("1등 당첨 횟수 : " + winner1_count + "\t1등 당첨 누적총상금 : " + winner1_total + "\t당첨 확률 : " + winner1_odds);
		System.out.println("2등 당첨 횟수 : " + winner2_count + "\t2등 당첨 누적총상금 : " + winner2_total + "\t당첨 확률 : " + winner2_odds);
		System.out.println("3등 당첨 횟수 : " + winner3_count + "\t3등 당첨 누적총상금 : " + winner3_total + "\t당첨 확률 : " + winner3_odds);
		System.out.println("4등 당첨 횟수 : " + winner4_count + "\t4등 당첨 누적총상금 : " + winner4_total + "\t당첨 확률 : " + winner4_odds);
		System.out.println("5등 당첨 횟수 : " + winner5_count + "\t5등 당첨 누적총상금 : " + winner5_total + "\t당첨 확률 : " + winner5_odds);
		
		System.out.println("초기메뉴로 돌아가겠습니까? (1.Y/2.N)");
		re_menu=Integer.parseInt(sc.nextLine());
		if(re_menu==1) {
			continue;
		}
		}
	} //main 끝

}
