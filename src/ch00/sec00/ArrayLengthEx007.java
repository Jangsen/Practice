package ch00.sec00;

public class ArrayLengthEx007 {

	public static void main(String[] args) {
		//정방형 배열 = 각 행의 열의 개수가 같은 배열
		int i2[][];
		i2 = new int [4][4];
		
		//비정방형 배열 = 각 행의 열의 개수가 다른 배열
		//비정방형 배열의 생성
		int i[][];
		i = new int [4][];
		i[0] = new int[1];
		i[1] = new int[2];
		i[2] = new int[3];
		i[3] = new int[4];

		System.out.println(i2.length);
		System.out.println(i.length);
		
	}
}
