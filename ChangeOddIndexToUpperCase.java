package week1.Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		StringBuffer appendString= new StringBuffer();
		char[] testToChar = test.toCharArray();
		for (int i = 0; i < testToChar.length; i++) {

			char upperString = testToChar[i];
			if (i % 2 != 0) {
				upperString = Character.toUpperCase(upperString);
				
				appendString.append(upperString);
				System.out.println(appendString.toString());

			}

		}

	}

}
