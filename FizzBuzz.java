package javaProjectTestCases;

public class FizzBuzz {

	public static void main(String args[]) {
		int num = 100;

		for (int i = 1; i < num; i++) {
			System.out.println(printFizzBuzz(i));
		}

	}

	public static String printFizzBuzz(Integer number) {
		if (number % 15 == 0)
			return "FizzBuzz";
		else if (number % 3 == 0)
			return "Fizz";
		else if (number % 5 == 0)
			return "Buzz";

		return String.valueOf(number);
	}
}
