import java.util.Scanner;
public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double rand = Math.random();
		rand = rand*(3+1);
		int money = 0;
		int total= 0;
		int in = 0;
		while(true) {
			
		
		System.out.println("경마게임에 오신 것을 환영합니다.");
		System.out.println("1. 게임 시작");
		System.out.println("2. 잔액 충전");
		System.out.println("3. 잔액 조회");
		System.out.println("4. 종료");
		System.out.println(">>");
		try {
		int menu = Integer.parseInt(sc.nextLine());
		
		if(menu==1) {
			System.out.println("말들이 준비 되었습니다. 배팅하고 싶은 말을 선택해주세요.");
			System.out.println("1번말 : 우승경력이 많지만 은퇴시기를 앞둔 늙은말");
			System.out.println("2번말 : 2월달 연습 기록이 가장 좋았던 젊은말");
			System.out.println("3번말 : 떠오르는 신예 말");
			System.out.println(">>");									
			int horse = Integer.parseInt(sc.nextLine());
			
			if(horse==1) {	
				System.out.println("1 번 말을 선택하셨습니다.");
				System.out.println("얼마를 베팅하시겠습니까?");
				System.out.println(">>");
				money = Integer.parseInt(sc.nextLine());
				System.out.println( money + "원 만큼의 금액이 베팅되었습니다.1번 말이 승리하는 경우 베팅액의 50%를 가져가게 됩니다.");
				System.out.println("반대로 다른말이 경주에 승리하는 경우, 베팅한 금액 전액을 잃게됩니다.");
			}else if(horse==2) {
				System.out.println("2 번 말을 선택하셨습니다.");
				System.out.println("얼마를 베팅하시겠습니까?");
				System.out.println(">>");
				money = Integer.parseInt(sc.nextLine());
				System.out.println( money + "원 만큼의 금액이 베팅되었습니다.2번 말이 승리하는 경우 베팅액의 50%를 가져가게 됩니다.");
				System.out.println("반대로 다른말이 경주에 승리하는 경우, 베팅한 금액 전액을 잃게됩니다.");
			}else if(horse==3) {
				System.out.println("3 번 말을 선택하셨습니다.");
				System.out.println("얼마를 베팅하시겠습니까?");
				System.out.println(">>");
				money = Integer.parseInt(sc.nextLine());
				System.out.println( money + "원 만큼의 금액이 베팅되었습니다.3번 말이 승리하는 경우 베팅액의 50%를 가져가게 됩니다.");
				System.out.println("반대로 다른말이 경주에 승리하는 경우, 베팅한 금액 전액을 잃게됩니다.");
			}
			
			if(horse==(int)rand) {
				System.out.println("[[[베팅한" + horse + "번 말이 승리하였습니다. 베팅액의 50%를 받았습니다!]]]");
				System.out.println("[[[베팅으로 얻은 금액은" + (money/2) + "원 입니다.]]]");
				total = total + money;
				System.out.println("[[[현재 잔액은 " + total + "입니다" );
			}else if(horse!=(int)rand) {
				System.out.println("[[[아.....안타깝습니다." + (int)rand + "말이 승리하였습니다.");
				total = total - money;
				System.out.println("[[[" + money + "원 만큼 잃으셨습니다. 안타깝습니다. 현재 잔액은 " + total +"원 입니다.");
			}



		}else if(menu==2) {
			System.out.println("얼마를 충전하시겠습니까?");
			System.out.println(">>");
			in = Integer.parseInt(sc.nextLine());
			System.out.println(in + "원이 충전되었습니다.");
			System.out.println("현재 잔액은 다음과 같습니다. : " + (total+in));
			total = total+in;
		}else if(menu==3) {
			System.out.println("현재 잔액은 다음과 같습니다. : " + total + "원");
		}else if(menu==4) {
			System.exit(0);
		}
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다. 숫자를 다시 입력해주세요.");
		}
		}


	}
}