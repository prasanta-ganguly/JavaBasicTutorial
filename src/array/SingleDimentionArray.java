package array;

public class SingleDimentionArray {

	public static void main(String[] args) {

		
		int i[] = new int[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println("Length of this array = "+i.length);
		
		for(int k=0; k<i.length; k++) {
			
			System.out.println(i[k]);
		}
		System.out.println();
		
		String str[] = new String[4];
		
		str[0]= "Mumbai";
		str[1]= "Delhi";
		str[2]= "Kolkata";
		str[3]= "Chennai";
		
		System.out.println("Length of this array = "+str.length);
		
		for(int l=0; l<str.length; l++) {
			
			System.out.println(str[l]);
		}
		System.out.println();
		
		Object ob[][] = new Object[3][4];
		
		ob[0][0] = "Jon";
		ob[0][1] = "32";
		ob[0][2] = "London";
		ob[0][3] = "56.5";
		
		ob[1][0] = "Tom";
		ob[1][1] = "66";
		ob[1][2] = "New York";
		ob[1][3] = "22.9";
		
		ob[2][0] = "Reshma";
		ob[2][1] = "19";
		ob[2][2] = "Mumbai";
		ob[2][3] = "11.5";
		
		System.out.println(ob[2][3]);
		System.out.println("No of rows of this object array = "+ob.length);
		System.out.println("No of columns of this object array = "+ob[0].length);
		System.out.println();
		
		for(int m=0; m<ob.length; m++) {
			for(int n=0; n<ob[0].length; n++) {
				
				System.out.print(ob[m][n]+" --- ");
			}
			
			System.out.println();
		}
		
	}
	
	
	

}
