package ch08;

public class MyMathTest3 {
	public static void main(String[] args) {
		MyMath3 mm3 = new MyMath3();
		System.out.println("mm3.add(55, 88)="+mm3.add(55,88));
		System.out.println("mm3.add(55, 88)="+mm3.add(55,88));
		System.out.println("mm3.add(55, 88)="+mm3.add(55,88));
		System.out.println("mm3.add(55, 88)="+mm3.add(55,88));
		int[] arr = {55,88,99,77,55,22};
		System.out.println("mm3.add(arr[])="+mm3.add(arr));
	}//static 이 없는 메서드 = 인스턴스 메서드 (객체가 있어야 사용가능)
}

class MyMath3 extends Object {
	int add(int a, int b) {
		System.out.println("add(int,int)");
		return a+b;
	}
	long add(int a, long b) {
		System.out.println("add(int,long)");
		return a+b;
	}
	long add(long a, int b) {
		System.out.println("add(long,int)");
		return a+b;
	}
	long add(long a, long b) {
		System.out.println("add(long,long)");
		return a+b;
	}
	int add(int[] a) {
		System.out.println("add(int[])");
		int result = 0;
		for(int i = 0; i < a.length; i++)
			result += a[i];
		return result;
	}	//지역변수는 명시적으로 초기화 해야한다.
}