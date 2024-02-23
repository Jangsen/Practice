package ch17.sec03.exam09;
import java.util.*;
public class StringTokenizerExample00 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source,",");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
	
}