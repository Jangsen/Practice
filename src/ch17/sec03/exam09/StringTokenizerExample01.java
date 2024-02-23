package ch17.sec03.exam09;
import java.util.*;
public class StringTokenizerExample01 {
	public static void main(String[] args) {
		String expression = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expression,"+-*/=()",true);
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
	
}