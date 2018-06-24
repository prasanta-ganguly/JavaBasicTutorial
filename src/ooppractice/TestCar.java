package ooppractice;

public class TestCar {

	public static void main(String[] args) {

		
		Car c1 = new Car();
		c1.mod = "Honda";
		c1.price = 123456;
		c1.wheels = 4;
		
		System.out.println(c1.mod);
		System.out.println(c1.wheels);
		System.out.println(c1.price);
		c1.start();
		c1.stop();
		System.out.println("*****************************");
		
		Maruti m = new Maruti();
		m.mod = "Maruti";
		m.wheels = 4;
		m.price = 123456;
		System.out.println(m.mod);
		System.out.println(m.wheels);
		System.out.println(m.price);
		m.start();
		m.fillGas();
		m.stop();
		System.out.println("**************************");
		
		Car c2 = new Maruti();
		c2.mod="Mahendra";
		c2.wheels=4;
		c2.price=654321;
		System.out.println(c2.mod);
		System.out.println(c2.wheels);
		System.out.println(c2.price);
		c2.start();
		c2.stop();
		System.out.println("********************************");
		
		Car c3 = new Car("Tyota", 896542);
		System.out.println(c3.mod);
		System.out.println(c3.price);
		System.out.println("**************************");

}

}
