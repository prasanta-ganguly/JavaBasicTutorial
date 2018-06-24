package finalconcept;

public class TestCar extends Car{

	public TestCar(String mod, int wheels, int price) {
		super(mod, wheels, price);
	}

	public static void main(String[] args) {

		
		Car c1 = new Car("Honda", 4, 652500);
		
		System.out.println(c1.mod);
		System.out.println(c1.wheels);
		//c1.wheels=8; // since wheels is final so can not be changed
		System.out.println(c1.price);
		c1.start();
		c1.stop();
		System.out.println(c1.wheels);
		
		TestCar c2 = new TestCar("Toyota", 4, 863524);
		System.out.println(c2.mod);
		System.out.println(c2.wheels);
		System.out.println(c2.price);
		c2.start();
		c2.stop();
		
	}
	
	public void start() {
		
		System.out.println("Only Tyota starting");
	}

}
