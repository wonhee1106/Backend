import java.util.Scanner;
public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {


			System.out.println("====가위 바위 보 게임====");
			System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");

			int num = Integer.parseInt(sc.nextLine());
			double rand = Math.random();
			rand = rand*(3-1+1)+1;
			if(num==1) {
				if((int)rand==1) {
					System.out.println("=======결과=======");
					System.out.println("당신은 가위를 냈습니다.");
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("=================");
					System.out.println("비겼습니다.");
					System.out.println("");
				}else if((int)rand==2) {
					System.out.println("=======결과=======");
					System.out.println("당신은 가위를 냈습니다.");
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("=================");
					System.out.println("컴퓨터가 이겼습니다.");
					System.out.println("");
				}else if((int)rand==3) {
					System.out.println("=======결과=======");
					System.out.println("당신은 가위를 냈습니다.");
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("=================");
					System.out.println("플레이어가 이겼습니다.");
					System.out.println("");
				}
			}else if(num==2) {
				if((int)rand==1) {
					System.out.println("=======결과=======");
					System.out.println("당신은 바위를 냈습니다.");
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("=================");
					System.out.println("플레이어가 이겼습니다.");
					System.out.println("");
				}else if((int)rand==2) {
					System.out.println("=======결과=======");
					System.out.println("당신은 바위를 냈습니다.");
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("=================");
					System.out.println("비겼습니다.");
					System.out.println("");
				}else if((int)rand==3) {
					System.out.println("=======결과=======");
					System.out.println("당신은 바위를 냈습니다.");
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("=================");
					System.out.println("컴퓨터가 이겼습니다.");
					System.out.println("");
				}
			}else if(num==3) {
				if((int)rand==1) {
					System.out.println("=======결과=======");
					System.out.println("당신은 보를 냈습니다.");
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("=================");
					System.out.println("컴퓨터가 이겼습니다.");
					System.out.println("");
				}else if((int)rand==2) {
					System.out.println("=======결과=======");
					System.out.println("당신은 바위를 냈습니다.");
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("=================");
					System.out.println("비겼습니다.");
					System.out.println("");
				}else if((int)rand==3) {
					System.out.println("=======결과=======");
					System.out.println("당신은 가위를 냈습니다.");
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("=================");
					System.out.println("플레이어가 이겼습니다.");
					System.out.println("");
				}

			}
		}
	}
}
