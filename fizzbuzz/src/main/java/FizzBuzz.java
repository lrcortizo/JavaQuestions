
/*
    The Problem:
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three print "Fizz" instead of the number
    and for the multiples of five print "Buzz".
    For numbers which are multiples of both three and five print "FizzBuzz".

 */
public class FizzBuzz {

	public String run(int value) {
		if (value % 15 == 0) {
			return "FizzBuzz";
		} else if (value % 3 == 0) {
			return "Fizz";
		} else if (value % 5 == 0) {
			return "Buzz";
		}

		return String.valueOf(value);
	}

	public static void main(String... args) {
		FizzBuzz fizzBuzz = new FizzBuzz();

		for (int i = 1; i <= 100; i++) {
			System.out.println(fizzBuzz.run(i));
		}
	}
}
