package week1.Day2;

import java.util.Arrays;


public class SecondLargestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7}; //2,3,4,6,7,11
		
		Arrays.sort(data);
		System.out.println(data[data.length-2]);

	}

}
