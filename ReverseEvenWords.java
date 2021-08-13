package week1.Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] myArr = test.split(" ");
		String reversedString = "";
		for (int i = 0; i < myArr.length; i++) {
			if (i % 2 == 1) {
				String splWord = myArr[i];
				String reverseString = "";
				for (int j = splWord.length() - 1; j >= 0; j--) {
					reverseString += splWord.charAt(j);

					// System.out.println(reverseString);
				}
				reversedString = reversedString + reverseString + " ";
				System.out.println(reversedString);

			}

		}

	}

}
