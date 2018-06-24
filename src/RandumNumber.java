
public class RandumNumber {

	public static void main(String[] args) {
		
		int x = generateRandumNumber(35);
		System.out.println(x);
		if(x>35){
			System.out.println("Method is incorrectly written");
		}
			

	}

	public static int generateRandumNumber(int n){
		
		double d = Math.random()*n;
		System.out.println(d);
		int i = (int)d;
		//System.out.println(i);
		return i;
	}
}
