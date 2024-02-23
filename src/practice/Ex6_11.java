package practice;

public class Ex6_11 {

	public static void main(String[] args) {
		DataA d1 = new DataA();
		DataB d2 = new DataB(55);
	}

}
class DataA
{
	int value;
//	DataA(){}
}
class DataB
{
	int value;
	String name;
	char c;
	double dvalue;
//	DataB(){}
	DataB(int value)	
	{
		this.value = value;
	}
	public DataB(int value, String name, char c, double dvalue) {
		super();
		this.value = value;
		this.name = name;
		this.c = c;
		this.dvalue = dvalue;
}
}
