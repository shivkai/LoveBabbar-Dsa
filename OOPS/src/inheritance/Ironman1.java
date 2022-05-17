package inheritance;

public class Ironman1 {
 private String name = "Ironman";
 private int leg;
 private int arm;
 private int fingers;
 int value = 10;
 public Ironman1(String name)
 {
	 this.name = name;
	 this.leg = 2;
	 this.arm = 2;
	 this.fingers = 20;
 }
 public Ironman1()
 {
	 this.leg = 2;
	 this.arm = 2;
	 this.fingers = 20;
 }
 public void info() {
	 System.out.println("Hi I am " +name);
	 System.out.println("I have "+leg+" legs, "+arm+" arms, and "+fingers+" fingers");
 }
 public void canFly() {
	 System.out.println("I can't fly");
	 System.out.println("value = "+value);
 }
 public void run() {
	 System.out.println("I can run");
 }
}
