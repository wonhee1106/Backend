import java.util.Scanner;
public class Quiz05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("우울증 자가 진단");
		System.out.println("아래 질문에 대해 그렇다/아니다로 답해주세요.");
		System.out.println("그렇다면 1을, 아니라면 0을 입력하세요.");
		System.out.println("================================================================");
		

		System.out.print("1. 최근에 흥미나 즐거움을 느끼지 못하는 일이 많다.");
		int answer1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("2. 나는 자주 우울하거나 우울한 기분이 든다.");
		int answer2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("3. 나는 자신감이 부족하다고 느낀다.");
		int answer3 = Integer.parseInt(sc.nextLine());
		
		System.out.print("4. 나는 자주 피곤하거나 에너지가 없다고 느낀다.");
		int answer4 = Integer.parseInt(sc.nextLine());
		
		System.out.print("5. 나는 잠을 자기가 어렵다고 느낀다.");
		int answer5 = Integer.parseInt(sc.nextLine());
		
		System.out.print("6. 나는 자주 가치 없는 생각을 한다.");
		int answer6 = Integer.parseInt(sc.nextLine());
		
		System.out.print("7. 나는 최근에 체중의 변화가 느낀다.");
		int answer7 = Integer.parseInt(sc.nextLine());
		
		System.out.println("8. 나는 최근에 사람들과의 관계에 대해 흥미를 잃었다.");
		int answer8 = Integer.parseInt(sc.nextLine());
		
		System.out.println("9. 나는 자살이나 다친다거나 상처받을까봐 두려움을 느낀다.");
		int answer9 = Integer.parseInt(sc.nextLine());
		
		System.out.println("10. 나는 자신에게 자주 실망하거나 자신을 비난한다.");
		int answer10 = Integer.parseInt(sc.nextLine());
		
		int score = answer1 + answer2 + answer3 + answer4 + answer5 + answer6 + answer7 + answer8 + answer9 + answer10;
		
		System.out.println("================================================================");
		
		
		if(score <= 10 && score >=0) {
			if(score >= 8) {
				System.out.println("당신은 지금 우울증의 증상이 매우 심한 것으로 보입니다. 즉시 전문가와 상담하시기 바랍니다.");
			}else if(score >= 6) {
				System.out.println("당신은 지금 우울증의 증상이 중간 정도로 보입니다. 전문가와 상담이 필요할 수 있습니다.");
			}else if(score >=4) {
				System.out.println("당신은 지금 우울증의 증상이 경미한 것으로 보입니다. 하지만 주의가 필요합니다. 전문가와 상담하는 것이 좋습니다.");
			}else {
				System.out.println("당신은 지금 우울증의 증상이 거의 나타나지 않는 것으로 보입니다. 하지만 계속해서 관리하는 것이 중요합니다.");
			}
		}else {
			System.out.println("0과 1 둘 중 하나만 선택하여 다시 검사해주세요");
		}
		
		System.out.println("================================================================");
				
	}
}

