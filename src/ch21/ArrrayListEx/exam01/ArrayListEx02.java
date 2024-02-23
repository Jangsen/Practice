package ch21.ArrrayListEx.exam01;
import java.util.*;
public class ArrayListEx02 {
		public static void main(String[] args) {
			final int LIMIT = 10;	//자르고자 하는 글자의 개수를 지정
			String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
			int length = source.length();
			System.out.println(length);
			List list = new ArrayList();	//크기를 약간 여유 있게
										//length = 43 / LIMIT = 10 = 14
			for(int i = 0; i < length; i += LIMIT) {
				if(i + LIMIT < length) {
					list.add(source.substring(i, i + LIMIT));
				}else {
					list.add(source.substring(i));
				}
			}
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
}
