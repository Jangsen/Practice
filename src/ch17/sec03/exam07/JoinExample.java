package ch17.sec03.exam07;

import java.util.StringJoiner;

public class JoinExample {
	public static void main(String[] args) {
		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");	//문장을 ','를 구분자로 나눠서 배열에 저장
		String str = String.join(" -",arr);	// 배열의 문자열을 '-'로 구분해서 결합
		System.out.println(str);			//dog - cat - bear
		
		StringJoiner sj = new StringJoiner(" : "," [ "," ] ");
		sj.add("George").add("Sally").add("Fred");
		String desiredsting = sj.toString();
		System.out.println(desiredsting);
		
		int iVal = 100;
		String strVal = String.valueOf(iVal);	// int를 String으로 변환
		double dVal = 200.0;
		String strVal2 = dVal +"";				// int를 String으로 변환하는 또 다른 방법
		double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.parseInt(strVal) + Double.valueOf(strVal2);
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum2);
		System.out.println(strVal + "+" + strVal2 + "=" +sum2);
		// + 피연산자의 타입에 따라서 문자열을 더할지 정수를 더할지 JVM이 알아서  (연산자 오버로딩.) 
		// c++ 은 연산자 오버로딩을 따로 해야함.
		
	}

}
