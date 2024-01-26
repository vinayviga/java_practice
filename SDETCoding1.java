package test;

import java.util.Arrays;
import java.util.Scanner;

public class SDETCoding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//taking the inputs from users
		System.out.println("Enter the first word");
		Scanner s = new Scanner(System.in);
		String word1 = s.nextLine();
		System.out.println("Enter the second word");
		String word2 = s.nextLine();
		SDETCoding1 ag = new SDETCoding1();
		System.out.println("Is it anagram? " + ag.anagramVerify(word1, word2));

	}

	public Boolean anagramVerify(String a, String b) {
		Boolean anagram = true;

		if (a.length() != b.length()) {
			System.out.println("one word is lengthier than the other, cannot be an anagram");
			anagram = false;
		} else {
			char[] ch1 = new char[a.length()];
			char[] ch2 = b.toCharArray();

			for (int i = 0; i < ch1.length; i++) {
				ch1[i] = a.charAt(i);
			}

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					anagram = false;
					break;
				}

			}
		}
		return anagram;
	}

}
