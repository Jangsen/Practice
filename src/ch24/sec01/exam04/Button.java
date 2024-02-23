package ch24.sec01.exam04;

public class Button {
	//정적 중첩 인터페이스
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}

}
