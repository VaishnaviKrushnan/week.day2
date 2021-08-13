package week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String revString = "";
		int strLength = str.length();

		for (int i = strLength - 1; i >= 0; --i) {
			revString += str.charAt(i);
			if (str.equalsIgnoreCase(revString)) {
				System.out.println(str + " is a palindrome");
			}
		}
		System.out.println("outside the loop");

	}

}
