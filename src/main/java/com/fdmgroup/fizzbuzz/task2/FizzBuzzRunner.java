package com.fdmgroup.fizzbuzz.task2;

public class FizzBuzzRunner {

	public void fizzBuzz(int number) {
		for (int i = 1; i <= number; i++) {
			if (i % 15 == 0) {
				System.out.println(fizzbuzz(number));
			} else if (i % 3 == 0) {
				System.out.println(fizz(number));
			} else if (i % 5 == 0) {
				System.out.println(buzz(number));
			} else {
				System.out.println(i);
			}
		}
	}

	private boolean fizz(int num) {
		if (num % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private boolean buzz(int num) {
		if (num % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private boolean fizzbuzz(int num) {
		if (num % 15 == 0) {
			return true;
		} else {
			return false;
		}
	}
}