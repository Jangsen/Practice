package explanation;

public class WhileTest {

	public static void main(String[] args) {
		int sum = 0 , i = 0;
		while ( i < 100) {
			sum = sum + i;
			i += 2;	// 0에서 출발했기 때문에 짝수들의 합. 2~98까지의 합
		}
		System.out.println(sum);
	}
}