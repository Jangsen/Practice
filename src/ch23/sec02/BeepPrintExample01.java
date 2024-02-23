package ch23.sec02;

public class BeepPrintExample01 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {		//익명 이너클래스
				for (int i = 0; i < 5; i++) {
					System.out.println("ABCDEFG");
					try {
						Thread.sleep(500);
					} catch (Exception e) {

					}
				}
			}
		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
