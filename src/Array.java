
public class Array {

	public static void main(String[] args) {
		
		//Single dimensional array
		/*int i[]= new int[5];
		i[0]=100;
		i[1]=125;
		i[2]=150;
		i[3]=175;
		i[4]=200;
		System.out.println("Length of the integer array = "+i.length);
		
		for(int m=0;m<i.length;m++){
			
			System.out.println(i[m]);
			
		}
		
		String str[] = new String[7];
		str[0]="Prasanta Ganguly";
		str[1]="Nakoda Heights";
		str[2]="Yashwant Gaurav Township";
		str[3]="Nalasopara West";
		str[4]="Palghar";
		str[5]="Maharashtra";
		str[6]="India";
		System.out.println();
		System.out.println("Length of the string array = "+str.length);
		
		for(int j=0;j<str.length;j++){
			System.out.println(str[j]);
		}*/
		
		
		
		//Two Dimensional array
	/*	String str[][] = new String[3][4];
		
		str[0][0]="Science";
		str[0][1]="Arts";
		str[0][2]="Commerce";
		str[0][3]="Management";
		
		str[1][0]="Asia";
		str[1][1]="Europe";
		str[1][2]="America";
		str[1][3]="Africa";
		
		str[2][0]="Mumbai";
		str[2][1]="Delhi";
		str[2][2]="Kolkata";
		str[2][3]="Chennai";
		
		System.out.println("Number of rows = "+str.length);
		System.out.println("Number of columns = "+str[0].length);
		System.out.println();
		
		for(int rownum=0;rownum<str.length; rownum++){
			for(int colnum=0;colnum<str[0].length;colnum++){
				
				System.out.print(str[rownum][colnum]+"--");
			}
			System.out.println();
		}*/
		
		
		//Object array
		Object ar[][] = new Object[3][4];
		
		ar[0][0]="Air India";
		ar[0][1]=555.55;
		ar[0][2]="Mumbai to Delhi";
		ar[0][3]=4589;
		
		ar[1][0]="Jet Airways";
		ar[1][1]=666.66;
		ar[1][2]="Kolkata to Mumbai";
		ar[1][3]=3889;
		
		ar[2][0]="Indegio";
		ar[2][1]=777.77;
		ar[2][2]="Mumbai to Delhi";
		ar[2][3]=4555;
		
		System.out.println("Length of row of object array = "+ar.length);
		System.out.println("Length of column of object array = "+ar[0].length);
		System.out.println();
		
		for(int rownum=0; rownum<ar.length;rownum++){
			for(int colnum=0;colnum<ar[0].length;colnum++){
				System.out.print(ar[rownum][colnum]+"--");
			}
			System.out.println();
		}
				
	}

}
