package ch15.exam13;

public class Button {
	// 정적 멤버 인터페이스
	public static interface ClickListener {
		void onClick();
	}

	// 필드
	private ClickListener clickListener;

	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
		//Button 이 클릭되었을때 실행하는 메소드
	}
}
