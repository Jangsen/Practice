package ch15.exam13;
public class ButtonExample {
	public static void main(String[] args) {
		//OK 버튼 객체 생성
		Button btnOk = new Button();
		
		//OK 버튼 객체에 ClickListner 구현 객체 주입
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다");
			}
		});
		//Ok 버튼 클릭하기
		btnOk.click();
		
		//Cancel 버튼 객체에 ClickListener
		Button btnCancel = new Button();
		
	}

}
