

class Worker extends Thread{
	
	public void run() {
		for(int i = 0;i < 100;i++) {
			System.out.print(i + " ");
		}
		
	}
}


public class Exam01 {
	public static void main(String[] args) {
		
		// Thread - Process 내에서 작업을 처리하는 단위 ( 일꾼 )
		// Single Thread Process : 하나의 Thread로 동작하는 프로그램
		// Multi Thread Process : 하나 이상의 Thread로 동작하는 프로그램

		// Thread 사용법 Steps
		// Step1. Thread클래스를 상속받는 사용자 정의 클랙스를 작성한다.
		// Step2. Thread 클래스로 부터 상속받은 public void run 메서드를 override 한다.
		// Step3. Override 된 메서드 내에 병행처리 할 코드를 작성한다.
		// Step4. 사용자 정의 클래스로부터 인스턴스를 생성한다.
		// Step5. 생성된 인스턴스로부터 start 메서드를 콜 한다.
		
		Worker worker = new Worker();
		worker.start(); // 스레드 깨우기
		
		for(int i = 0;i < 100;i++) {
			System.out.print(i + " ");
		}
		
		
		
		
	}
}
//하나의 프로세스당 한나의 스레드가 존재 만약 스레드가 없으면 죽은 프로세스
// cpu의 시분할 처리 방법

