package ch00.sec00;

public class ArrayLengthEx005 {

	public static void main(String[] args) {
		//2차원 배열 선언
		int intArray[][];
		//or
		int[][] intArray2 = new int[2][5];
		
		//2차원 배열 생성
		intArray = new int[2][5];
		//or
		int intArray3[][] = new int[3][5];
		System.out.println(intArray);
		System.out.println(intArray2);
		System.out.println(intArray3);
		System.out.println(intArray.length);
		System.out.println(intArray2.length);
		System.out.println(intArray3.length);
		intArray2=intArray3;	//주소 값이 같아짐
		System.out.println(intArray);
		System.out.println(intArray2);
		System.out.println(intArray3);
		System.out.println(intArray.length);
		System.out.println(intArray2.length);
		System.out.println(intArray3.length);
	}
}
