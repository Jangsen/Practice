package explanation;

public class MathRandomEx {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 10 + 1);
		}
		int avg = 0;
		for (int i = 0; i < num.length; i++) {
			avg += num[i];
		}
		System.out.print("랜덤한 정수들 : ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+ " ");
		}
		System.out.println("\n평균은" + (double)avg/num.length);
	}

}
