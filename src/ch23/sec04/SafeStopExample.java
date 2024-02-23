package ch23.sec04;

public class SafeStopExample {
	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);		//Main Thread == static 현재 쓰레드에 전달
//			printThread.sleep(1000);	sleep 메소드는 try catch 로 묶어야 한다.
		} catch (InterruptedException e) {
			
		}

		printThread.setStop(true);
	}
}
