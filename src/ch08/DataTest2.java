package ch08;

public class DataTest2 {

	public static void main(String[] args) {	//선언부
		Data d = new Data();
		d.x = 100;
		Data d2 = copy(d);						//구현부
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = "+d2.x);
	}
	static Data copy(Data test) 
	{
		Data tmp = new Data();
		tmp.x = test.x;
		System.out.println("tmp.x " + tmp.x);
		return tmp;
	}
}
