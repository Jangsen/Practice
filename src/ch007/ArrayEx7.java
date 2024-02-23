package ch007;

public class ArrayEx7 {

	public static void main(String[] args) {
		String src = "ABCDEFGHI";
		for(int i = 0 ; i < src.length(); i++)
		{
			char ch = src.charAt(i);	//문자 하나 짤라 변환
			System.out.println("src.charAt(" +i+ "):"+ ch);
		}
		char[] chArr = src.toCharArray();	//기존 배열로 돌려줌
		System.out.println(chArr);
	}

}
