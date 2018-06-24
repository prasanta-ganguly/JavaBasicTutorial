package inheritance;

public class Car {
	
	String mod; static int wheels=4; int price;
	
	//Constructor
	public Car() {
		
		System.out.println("In Car constructor - no arg");
	}
	
	//Constructor overloading
	public Car(String mod, int price) {
		
		this.mod=mod; this.price=price;
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		
		c1.mod = "Maruti";
		//c1.wheels = 4;
		c1.price = 123456;
		System.out.println(c1.mod);
		//System.out.println(c1.wheels);
		System.out.println(wheels);
		//c1.wheels=8;
		System.out.println(c1.price);
		fillGas();
		c1.start();
		c1.accel();
		c1.stop();
		
		System.out.println("********************");
		
		Car c2 = new Car();
		
		c2.mod="Honda";
		//c2.wheels=4;
		c2.price=56321;
		System.out.println(c2.mod);
		//System.out.println(c2.wheels);
		System.out.println(wheels);
		System.out.println(c2.price);
		fillGas();
		c2.start();
		c2.accel();
		c2.stop();
		
	
	
	}
	
	public void start() {
		
		System.out.println(mod+" staring");
	}
	
	public void stop() {
		
		System.out.println(mod+" stopping");
	}
	
	public void accel() {
		
		System.out.println(mod+" acclerating");
	}
	
	public static void fillGas() {
		System.out.println("Feeling gas");
	}
	
	

}
