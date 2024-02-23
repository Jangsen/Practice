package ch20.sec01.exam00;

import java.util.ArrayList;

import testclass02.Tv;

public class GeneicsExample {

	public static void main(String[] args) {
		//Tv객체만 저장할 수 있는 ArrayList를 생성
//		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		tvList.add(new Tv());	//Ok
//		tvList.add(new Audio());; //컴파일 에러, Tv 외에 다른 타입은 저장 불가
		
		ArrayList tvList = new ArrayList();
		tvList.add(new Tv());
		Tv t = (Tv)tvList.get(0);
		
	}

}
