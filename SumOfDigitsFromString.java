package week1.Day2;

import java.util.Arrays;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		String temp = "";
		int sum = 0;
		int n;
		for(int i = 0; i<text.length();i++) {
			char newString = text.charAt(i);
			if(Character.isDigit(newString)) {
				n = Character.getNumericValue(newString);
				sum += n;
			}
				
			}
		System.out.println(sum);
		}
	}

