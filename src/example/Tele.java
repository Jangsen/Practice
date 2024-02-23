package example;

class Tele {
	public static void main(String[] args) {
		System.out.println(Television.info);
	}
//클래스 앞에 접근제어지시자를 붙일때 퍼블릭이거나 생략됐을때만 이너 클래스에 프라이빗을 붙일수있다.
	private class Tellv {		
		public void test(String[] args) {
			System.out.println(Television.info);
		}
}
	
}

