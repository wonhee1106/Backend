import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int bestScore = 100;
		int score = 1;

		while(true) {



			System.out.println("=== Up & dOWN Game ===");
			System.out.println();
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println();
			System.out.print(">");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu==1) {
				System.out.println("<<   Game Start   >>");
				int rand = (int)(Math.random()*100+1);

				while(true) {
					
				System.out.print("Input Number : ");
				int num = Integer.parseInt(sc.nextLine());
				if(num>rand) {
					System.out.println("<<   D O W N   >>");					
					score++;					

				}else if(num<rand) {
					System.out.println("<<   U P   >>");
					score++;					

				}else {
					System.out.println("<<   정 답   >>");
					System.out.println("랜덤값 : " + rand);
					System.out.println("Score : " + score);
					if(score<bestScore) {
						System.out.println("최고 기록 갱신입니다!!");
						bestScore = score;
						
					}
					score = 1;
					break;
				}
				}

			}else if(menu==2) {
				System.out.println("현재 최고 기록은 " + bestScore + " 번 입니다");
			}else if(menu==3) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}else {
				System.out.println("다시 선택해주세요");
			}
		}
	}
}