package ch20.sec01.exam00;

public class Product<K, M> {
	//필드
	private K kind;
	private M model;
	
	//메소드
	private K getKind() {
		return kind;
	}
	private M getModel() {
		return model;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
