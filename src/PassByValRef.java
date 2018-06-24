
public class PassByValRef {
	
	int a, b;

	public static void main(String[] args) {
		
		PassByValRef pvr = new PassByValRef();
		
		pvr.a=20;
		pvr.b=30;
		System.out.println("a = "+pvr.a+" b = "+pvr.b);
		//pvr.swap(pvr.a, pvr.b);
		pvr.swap1(pvr);
		System.out.println("a = "+pvr.a+" b = "+pvr.b);

		
		
	}
	
	
	public void swap(int x, int y) {
		
		int temp=x;
		x=y;
		y=temp;
	}
	
	public void swap1(PassByValRef vr) {
		
		int temp=vr.a;
		vr.a=vr.b;
		vr.b=temp;
	}
		
		
	}
