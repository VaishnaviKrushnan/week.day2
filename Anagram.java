package week1.Day2;

import java.util.Arrays;

public class Anagram {
	boolean bTrue = false;
	 // Declare a String
	static String text1 = "stops";
	// Declare another String
	static String text2 = "potss";

	public boolean isAnagram() {

		if (text1.length() == text2.length()) {
			char[] ctext1 = text1.toCharArray();
			char[] ctext2 = text2.toCharArray();
			Arrays.sort(ctext1);
			Arrays.sort(ctext2);
			bTrue = Arrays.equals(ctext1, ctext1);

		}
		return bTrue;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram isANa = new Anagram();
		boolean isAnagramString = isANa.isAnagram();
		if (isAnagramString) {
			System.out.println(text1 + " " + text2 + " is an Anagram");
		}

	}

}
