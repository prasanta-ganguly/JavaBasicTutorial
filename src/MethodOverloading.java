
public class MethodOverloading {

	public static void main(String[] args) {
		
		
		MethodOverloading m = new MethodOverloading();

		m.sum(20,30);
		m.sum(50, 100, 200);
		m.sum("This is my new string value");
		
		
		
	}
	
	public void sum(int x, int y) {
		
		int sum=x+y;
		System.out.println("Sum of two numbers = "+sum);
	}
	
	public void sum(int x, int y, int z) {
		
		int sum = x+y+z;
		System.out.println("Sum of two numbers = "+sum);
		
	}
	
	public void sum(String str) {
		
		String sr = str;
		
		System.out.println("You have passesd a string value = "+sr);
	}

}
