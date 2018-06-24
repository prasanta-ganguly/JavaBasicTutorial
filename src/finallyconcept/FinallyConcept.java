package finallyconcept;

public class FinallyConcept {

	public static void main(String[] args) {

		
		try {
		int i =10/0;
		System.out.println(i);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		finally {
		System.out.println("Inside finally block");
		}
		
		
	}

}
