package construct;

public class MyMath {

		long a , b;		//<---iv  this.a  this.b
		MyMath (int a, int b) {		//생성자
			this.a = a;
			this.b = b;
		}
		long add() {	//인스턴스 메서드
			return a + b;	//return this.a + this.b
		}
		static long add (long a, long b) {	//클래스 메서드(static 메서드)
			return a + b;
		}
	}

