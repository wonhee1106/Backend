import java.util.Scanner;

public class Japangi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = 10000;
		int coke = 0;
		int cider = 0;
		int water = 0;

		System.out.println("자판기 시뮬레이터");
		System.out.println("1. 콜라(1200)");
		System.out.println("2. 사이다");
		System.out.println("3. 물");

		int menu = Integer.parseInt(sc.nextLine());

		if(menu==1) {
			if(money>=1200) {
				money -= 1200;
				coke++;
				System.out.println("잔돈 : "+ money+"콜라 : " + coke);
			}else if(money<1200) {
				System.out.println("잔액이 부족합니다.");
			}


		}else if(menu==2) {

		}else if(menu==3) {

		}
	}
}
