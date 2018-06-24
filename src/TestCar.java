
public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW(); // static polymorphisim or compile time polymorphisim
		
		b.mod = "Test Car";
	
		b.start(b.mod);
		b.accel(b.mod);
		b.stop(b.mod);
		b.reFuel(b.mod);
		System.out.println("**************");
		
		Car c = new Car();
		c.mod = "Original Car";
		c.start(c.mod);
		c.accel(c.mod);
		c.stop(c.mod);
		
		System.out.println("*************************");
		
		//Top casting - child class object can be referred by parent class reference variable
		Car c1 = new BMW(); // dynamic polymorphisim or run time polymorphisim
		
		c1.mod="Toyota";
		
		c1.start(c1.mod);
		c1.accel(c1.mod);
		c1.stop(c1.mod);
		
		//Down casting is not allowed i.e. paren class object can not be referred by child class reference variable
		BMW b1 = (BMW) new Car(); // down casting will throw ClassCastException
	}

}
