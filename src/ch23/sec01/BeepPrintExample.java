package ch23.sec01;

public class BeepPrintExample {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("ABCDEFG");
			try { 
				Thread.sleep(500);
			} catch (Exception e){
				
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}

}
