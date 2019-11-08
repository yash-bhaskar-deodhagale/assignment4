package com.yash.org.assignment.nine;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;

public class RotateArrayTest {
	
	@Rule
	public ExpectedException expection=ExpectedException.none();
	
	@Test
	public void shouldReturnRotatedArrayGivenNumberOfRotation(){
		Integer[] inputArray={1,2,3,4,5,6,7};
		Integer numOfRotations=3;
		Integer[] expectedRotatedArray={5,6,7,1,2,3,4}; 
		RotateArray rotateArray=new RotateArray();
		Integer[] actualRotatedArray=rotateArray.getRotatedArray(inputArray,numOfRotations);
		assertArrayEquals(expectedRotatedArray,actualRotatedArray);
	}
	
	@Test
	public void shouldThrowExceptionGivenNumberOfRotationIsNegative(){
		Integer[] inputArray={1,2,3,4,5,6,7};
		Integer numOfRotations=-3;
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid Input");
		RotateArray rotateArray=new RotateArray();
		rotateArray.getRotatedArray(inputArray,numOfRotations);
	}
	
	@Test
	public void shouldThrowExceptionGivenInputArrayIsNull(){
		Integer[] inputArray=null;
		Integer numOfRotations=3;
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid Input");
		RotateArray rotateArray=new RotateArray();
		rotateArray.getRotatedArray(inputArray,numOfRotations);
	}
	
	@Test
	public void shouldThrowExceptionGivenInputArrayIsEmpty(){
		Integer[] inputArray={};
		Integer numOfRotations=3;
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid Input");
		RotateArray rotateArray=new RotateArray();
		rotateArray.getRotatedArray(inputArray,numOfRotations);
	}

}
