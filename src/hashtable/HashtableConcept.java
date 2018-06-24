package hashtable;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {

		
		Hashtable h = new Hashtable();
		
		h.put(1, "Prasanta");
		h.put(2, "Jon");
		h.put(3, "Reshma");
		
		System.out.println("Size of this hashtable "+h.size());
		System.out.println(h.get(2));
		System.out.println();
		
		h.put("A", 100);
		h.put("B", 200);
		
		System.out.println("Size of this hashtable "+h.size());
		System.out.println(h.get(3));
		System.out.println(h.get("B"));
		System.out.println();
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer,String>();
		
		h.put(1, "Mumbai");
		h.put(2, "Kolkata");
		h.put(3, "Delhi");
		h.put(4, "Chennai");
		
		for(int l=0; l<h1.size(); l++) {
			System.out.println(h.get(l));
		}
		
		
		
	}

}
