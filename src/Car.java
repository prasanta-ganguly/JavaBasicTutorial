
public class Car {
	
	String mod;
	int wheels;
	int price;

	public static void main(String[] args) {

		Car car1 = new Car();
		
		car1.mod = "Maruti";
		car1.wheels = 4;
		car1.price = 123456;
		
		System.out.println(car1.mod);
		System.out.println(car1.wheels);
		System.out.println(car1.price);
		car1.start(car1.mod);
		car1.accel(car1.mod);
		car1.stop(car1.mod);
		System.out.println();
		
		
		Car car2 = new Car();
		
		car2.mod = "Honda";
		car2.wheels = 4;
		car2.price = 765432;
		
		System.out.println(car2.mod);
		System.out.println(car2.wheels);
		System.out.println(car2.price);
		car2.start(car2.mod);
		car2.accel(car2.mod);
		car2.stop(car2.mod);
		
	}
	
	public void start(String car) {
		
		System.out.println(car+" starting");
	}
	
	
	public void stop(String car) {
		
		System.out.println(car+" stopping");
	}
	
	public void accel(String car) {
		
		System.out.println(car+" accelerating");
	}
	

}
