package finalconcept;

public class Car {

	String mod; final int wheels; int price;
	
	public Car(String mod, int wheels, int price) {
		
		this.mod=mod; this.wheels=wheels; this.price=price;
	}
	
	public static void main(String[] args) {
		

		Car c = new Car("Maruti", 4, 500000);
		System.out.println(c.mod);
		System.out.println(c.wheels);
		System.out.println(c.price);
		c.start();
		c.stop();
		
		
	}
	
	public void start() {
		
		System.out.println(mod+" starting");
	}
	
	public void stop() {
		
		System.out.println(mod+" stopping");
	}

}
