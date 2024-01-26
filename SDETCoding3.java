package test;

import java.util.Arrays;

public class SDETCoding3 {

	public static void main(String[] args) {
		// counting vowels
		
		String name = "Vinay";
		name=name.toLowerCase();
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		
		int vovelCount = 0;
		
		
		for(int i=0; i<name.length(); i++)
		{
			int status = Arrays.binarySearch(vowel, name.charAt(i));
			if(status>=0)
			{
				vovelCount++;
			}
			
		}
		
		
		System.out.println("the number of vowels in the given string are "+Integer.toString(vovelCount));

	}

}
