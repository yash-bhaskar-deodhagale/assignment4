package com.yash.org.assignment.nine;

import com.yash.org.assignment.exception.InvalidInputException;

public class RotateArray {

	public Integer[] getRotatedArray(Integer[] inputArray, Integer numOfRotations) {
		if(inputArray==null ||  inputArray.length==0 ||Integer.signum(numOfRotations)==-1 ){
			throw new InvalidInputException("Invalid Input");
		}
		Integer LengthOfArray=inputArray.length;
		for (int i = 0; i < numOfRotations; i++) {
		      int lastElement = inputArray[LengthOfArray - 1];
		      for (int j = LengthOfArray - 1; j > 0; j--) {
		    	  inputArray[j] = inputArray[j - 1];
		      }
		      inputArray[0] = lastElement;
		    }
		    return inputArray;
	}

}
