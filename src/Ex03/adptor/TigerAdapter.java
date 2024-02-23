package Ex03.adptor;

public class TigerAdapter extends Animal{
	private OuterTiger outerTiger; //컴포지션
	
	public TigerAdapter(OuterTiger outerTiger) {
		this.outerTiger = outerTiger;
	}
	@Override
	public String getName() {
		return outerTiger.getFullName();
	}

}
