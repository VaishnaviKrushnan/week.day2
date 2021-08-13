package week1.Day2;

public class LearnContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 50;

		System.out.println("Odd Numbers are : ");
		for (int i = 0; i < 50; i++) {

			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
