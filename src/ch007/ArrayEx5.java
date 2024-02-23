package ch007;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[] numArr = new int [10]; 
		int[] counter = new int [10];
		for (int i = 0; i < numArr.length; i++)
		{
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);			/// 0~ 9까지 난수 10번
		}
		System.out.println();
		for (int i = 0; i < numArr.length; i++)
		{
			counter[numArr[i]]++;		//counter[5] = counter[5] + 1
		}
		for (int i = 0; i < numArr.length; i++)
		{
			System.out.println(i + " : " + counter[i]);
		}
	}

}
