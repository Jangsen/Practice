package ch007;

public class ArrayEx9 {

	public static void main(String[] args) {
		String source = "ARGS";
		String[] morse = { ".-", "-...", "-.-", "-..", "."		//A,B,C,D,E
						, "..-.", "--.", "....", ".." , "---"	//F,G,H,I,J
						, "-.-" , ".-..", "--", "-.", "---"		//K,L,M,N,O
						, ".--", "--.-", ".-.", "...", "-"		//P,Q,R,S,T
						, "..-", "...-", ".--", "-..-", "-.--"	//U,V,W,X,Y
						, "--.." };								//Z
		
		String result = " ";
		for(int i = 0; i < source.length(); i++)
		{
			result = result + morse[source.charAt(i) - 'A']+"/";
		}
		System.out.println("source: "+ source);
		System.out.println("morse: " + result);
	}

}
