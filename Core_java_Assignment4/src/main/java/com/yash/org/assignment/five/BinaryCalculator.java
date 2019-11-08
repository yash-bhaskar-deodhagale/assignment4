package com.yash.org.assignment.five;

import com.yash.org.assignment.exception.InvalidInputException;

public class BinaryCalculator {

	public String getSumOfBinary(String binaryNumberOne, String binaryNumberTwo) {
		if (binaryNumberOne == null || binaryNumberTwo == null || binaryNumberOne.isEmpty()
				|| binaryNumberTwo.isEmpty()) {
			throw new InvalidInputException("Invalid input");
		}

		int numberOne = Integer.parseInt(binaryNumberOne, 2);
		int numberTwo = Integer.parseInt(binaryNumberTwo, 2);

		int sum = numberOne + numberTwo;
		return Integer.toBinaryString(sum).toString();
	}

}
