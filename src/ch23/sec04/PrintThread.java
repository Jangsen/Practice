package ch23.sec04;

public class PrintThread extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;	//default 값 = false
	}

	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
		//Thread 스케쥴링
	}
}
