package ch23.sec05;

public class PrintThread extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			System.out.println("InterruptedException 발생");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
//sleep 상태일때만 interrupt 를 받을수 있음
