package ch00.sec000;

public class ArrayEx00 {
//변수와 인덱스를 사용하는 방법
//변환기호 %d %n
	public static void main(String[] args) {
		int[]score = new int [5];
		int k = 1;
		score[0] = 50; 
		score[1] = 60; 
		score[k+1] = 70; 
		score[3] = 80; 
		score[4] = 90; 
		int temp = score[k+2] + score[4];
		for(int i=0; i < score.length; i++) {
			System.out.printf("score[%d}:%d%n", i, score[i]);
		}
		System.out.printf("temp:%d%n", temp);
//		System.out.printf("score[7]:%d%n", score[7]);	//out of bounce
		
	}

}
