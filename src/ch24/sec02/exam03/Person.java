package ch24.sec02.exam03;

public class Person {
	public Member getMember(Creatable1 creatable) {
		String id = "winter";
		Member member = creatable.create(id);
		return member;
		
	}
	
	public Member getMember2(Creatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member member = creatable.create(id, name);
		return member;
	}

}
