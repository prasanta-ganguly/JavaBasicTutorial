package ooppractice;

public class Car {
	
	String mod; int wheels; int price;
	
	public Car(String mod, int price) {
		
		this.mod=mod; this.price=price;
	}
	
	public Car() {
		
		System.out.println("In constructor - no args");
	}
	

	public static void main(String[] args) {

		
		
	}

	public void start() {
		
		System.out.println(mod+ " starting");
	}
	
	public void stop() {
		
		System.out.println(mod+" stopping");
	}
}
