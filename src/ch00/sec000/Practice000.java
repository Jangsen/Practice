package ch00.sec000;

public class Practice000 {

	public static void main(String[] args) {
		int sum = 0 , i = 1;
		while ( i < 100 ) {
			if(i % 3 != 0) {
				i++;
				continue;
			}
			sum += 1;
			i++;
		}
		System.out.println(sum);
	}

}
