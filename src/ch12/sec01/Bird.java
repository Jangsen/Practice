package ch12.sec01;

public class Bird extends Animal {

	// @Override
	int eat(String food) {
		System.out.println("새는 호리병에 먹는다");
		return 60;
	}
//		System.out.println("새는 호리병에 담아먹는다");
//		return 50;
//	}
}
