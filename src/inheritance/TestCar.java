package inheritance;

public class TestCar {

	public static void main(String[] args) {

		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod="Maruti";
		b.mod="Honda";
		c.mod="Toyota";
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		System.out.println("******************");
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		System.out.println("******************");
		
		Car d = new Car("BMW",8965432);
		System.out.println(d.mod);
		System.out.println(d.price);
		System.out.println("******************");
		
		Car e = new Car("Mahendra", 5456321);
		System.out.println(e.mod);
		System.out.println(e.price);
		
	}

}
