package week1.Day2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = {34,203,5,78,100,1000,1};
		
		Arrays.sort(arrNum);
		
		//Largest Number
		System.out.println("The largest number is " + arrNum[arrNum.length-1]);
		
		//Second Largest Number
		System.out.println("The second largest number is " + arrNum[arrNum.length-2]);
		
		/*
		 * //Reverse the array Collections.reverseOrder(arrNum);
		 */
		
		

	}

}
