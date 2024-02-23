package ch08;

public class MyMathTest {
	public static void main(String[] args) {
		
	
	MyMath mm = new MyMath();
	long addres = mm.add(5L, 8L);
	long subres = mm.sub(5L, 8L);
	long mulres = mm.multiply(5, 8);
	double divres = mm.divide(5, 8);
	
	System.out.println("mm.add(5L, 8L) = " + addres);
	System.out.println("mm.sub(5L, 8L) = " + subres);
	System.out.println("mm.multiply(5, 8) = " + mulres);
	System.out.println("mm.divide(5, 8) = " + divres);
	

	}
	//static = 서로 다른 클래스에 있으면 소속을 밝혀야함.
	//ex ==> Mymath 클래스에서 static long multiply 라고 했으면
	//Mymathtest 에서 사용하려면 Mymath.multiply를 사용해야한다.
}	
class MyMath 
{
 long add(long a, long b)		{ return a+b; }
 long sub(long a, long b)		{ return a-b; }
 long multiply(long a, long b)		{ return a*b; }
 double divide(long a, long b)		{ return a*1.0/b; }
 	int max(int a, int b)
	{
	if(a > b)
		return a;	//조건식이 참일때 실행
	else
		return b;
	}
}
//	long add(long a, long b) 
//	{
//	long result = a + b;
//	return result;
//	}
//	long sub(long a, long b) 
//	{
//	long result = a - b;
//	return result;
//	}
//	long multiply(long a, long b) 
//	{
//	long result = a * b;
//	return result;
//	}
//	long divide(long a, long b) 
//	{
//	long result = a / b;
//	return result;