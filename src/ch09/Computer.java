package ch09;

public class Computer {
	int sum(int ... values) { // 가변인자 변수가 몇개가 될 지 모를때 사용
		int sum = 0;
		for(int i = 0 ; i < values.length; i++)
		{
			sum += values[i];
		}
		return sum;
	}

}
