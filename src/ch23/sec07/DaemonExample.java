package ch23.sec07;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		for(int i = 0; i < 20; i++) {
			System.out.println("메인 스레드 실행");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 스레드 종료");

	}
}
