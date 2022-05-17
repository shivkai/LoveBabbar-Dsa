package inheritance;

public class Ironman2 extends Ironman1{

	int value = 100;
	public Ironman2() {
		super();
		System.out.println("Wass up mf");
	}
	@Override
	public void canFly()
	{
		System.out.println("I can fly");
		System.out.println("Value = "+value);
	}
	
	public void unibeam() {
		System.out.println("Big unibeams");
	}
	public void guns() {
		System.out.println("Guns. Lot of Guns");
	}
	
}
