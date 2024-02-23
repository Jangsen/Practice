package ch15.exam14;
public class Outer {
	private class InstanceInner {
		public InstanceInner() {
			System.out.println("private class InstanceInner()");
		}
	}
	protected static class StaticInner{
		public StaticInner() {
			System.out.println("protected static class StaticInner");
		}
	}
	void myMethod() {
		class LocalInner{
			public LocalInner() {
				System.out.println("LocalInner");
			}
		}
		System.out.println("myMethod()실행");
		
		StaticInner si = new StaticInner();
		InstanceInner ii = new InstanceInner();
		
	}
}
