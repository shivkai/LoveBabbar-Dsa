package inheritance;

public class Client {

	public static void main(String[] args) {
		Ironman1 mn = new Ironman1("murphy");
		mn.info();
		mn.canFly();
		
		System.out.println();
		
		Ironman2 mm = new Ironman2();
		mm.info();
		mm.canFly();
//		mm.guns(); It have guns method
		
		System.out.println();
		
		Ironman1 t1 = new Ironman2(); // UPCASTING : sending object of child to reference variable of parent 
		t1.info();
		t1.canFly();
//	  X	t1.guns() X  // We will not get guns method of child because in upcasting we have access only of parent,
						//  and partial access of child that are only over-riden methods of parent class can be accessed.

		
	}

}
