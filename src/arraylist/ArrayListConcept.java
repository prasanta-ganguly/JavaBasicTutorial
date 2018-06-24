package arraylist;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println("Start length of this array list = "+ar.size());
		System.out.println(ar.get(0));
		System.out.println();
		
		ar.add("Prakash");
		ar.add("Tarun");
		
		System.out.println("Size is increased to "+ar.size());
		System.out.println(ar.get(4));
		System.out.println();
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println();
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(1111);
		ar1.add(2222);
		ar1.add(3333);
		ar1.add(4444);
		
		for(int k=0; k<ar1.size(); k++) {
			
			System.out.println(ar1.get(k));
		}
		System.out.println();
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Mumbai");
		ar2.add("Chennai");
		ar2.add("Kolkata");
		ar2.add("Delhi");
		
		for(int m=0; m<ar2.size(); m++) {
			
			System.out.println(ar2.get(m));
		}
	}

}
