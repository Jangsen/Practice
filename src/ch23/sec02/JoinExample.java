package ch23.sec02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread  sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();		//main에 sumThread가 붙어서 하나가 됨.
		}catch (InterruptedException e) {
			
		}
		System.out.println("1 ~ 100 합: " + sumThread.getSum());
		
	}

}
