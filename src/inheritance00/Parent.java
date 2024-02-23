package inheritance00;
//상속관계 = 이즈 어 관계 
public class Parent {
	int x = 3;
	int y = x;
	
}
class Child extends Parent{
	int z = 1;
	
}

class Child2 extends Parent{
	int x1 = 4;
}

class GrandChild extends Child {
	
}