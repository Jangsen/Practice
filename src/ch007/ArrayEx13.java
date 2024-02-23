package ch007;

public class ArrayEx13 {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5 };
		int[] newNumber = new int[10];
		
		for(int i = 0; i < number.length; i++)
		{
			newNumber[i] = number[i];	//배열 number 값을 newNumber에 저장
		}
	
	}

}
