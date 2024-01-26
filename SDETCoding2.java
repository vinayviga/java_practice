package test;

import java.util.HashSet;
import java.util.Set;

public class SDETCoding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Function for finding elements which   
	    // are there in a[] but not in b[].

		int a[] = { 1, 2, 6, 3, 4, 5 };  
        int b[] = { 2, 4, 3, 1, 0 };
        
        Set<Integer> setA = SDETCoding2.convert(a);
        Set<Integer> setB = SDETCoding2.convert(b);
        
        
        setA.removeAll(setB);
        System.out.println("Unique elements in set A: "+setA);
        
        
	}
	
	
	static Set<Integer> convert(int[] array)
    {
        // Hash Set Initialisation
        Set<Integer> set = new HashSet<>();
 
        // Iteration using enhanced for loop
        for (int element : array) {
            set.add(element);
        }
        // returning the set
        return set;
    }

}
