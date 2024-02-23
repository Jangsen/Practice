package ch00.sec00;

public class ArrrayException {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
				// i가 4일때 ArrayIndexOutOfBoundsException 예외 발생
				// i가 4일때는 intArrray[5]가 생성되기 떄문에 
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}

}
