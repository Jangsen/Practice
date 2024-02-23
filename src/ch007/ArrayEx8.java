package ch007;

public class ArrayEx8 {

	public static void main(String[] args) {
		
		char[] hex = { 'C','A','F','E','1','1','2' };
		String[] binary = { "0000","0001","0010","0011" ,
						    "0100","0101","0110","0111" ,
						    "1000","1001","1010","1011" ,
						    "1100","1101","1110","1111" } ;
		String result = "";
		for (int i = 0; i < hex.length; i++) 
		{
			if(hex[i] >= '0' && hex[i] <= '9') 
			{
				result = result + binary[hex[i]-'0'] + "/";
			}
			else 
			{
				result = result + binary[hex[i]-'A'+10] + "/";
			}
		}
		System.out.println("hex: " + new String(hex));	//String(char[] value)
		System.out.println("binary: " + result);
	}
}
