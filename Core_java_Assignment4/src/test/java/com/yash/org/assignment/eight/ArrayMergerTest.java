package com.yash.org.assignment.eight;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

public class ArrayMergerTest {
	
	@Rule
	public ExpectedException expect=ExpectedException.none();
	
	@Test
	public void shouldReturnMergedSortedArrayGivenTwoArray(){
		Integer[] array1={4,6,7,8};
		Integer[] array2={1,2,3,9};
		ArrayMerger arrayMerger=new ArrayMerger();
		Integer[] actualSortedArray=arrayMerger.getMergedSortedArray(array1,array2);
		Integer[] expectedSortedArray={1,2,3,4,6,7,8,9};
		assertArrayEquals(actualSortedArray,expectedSortedArray);
		
	}
	
	@Test
	public void shouldReturnMergedSortedArrayGivenTwoArrayOneOfWhichIsNull(){
		Integer[] array1={4,6,7,8};
		Integer[] array2=null;
		ArrayMerger arrayMerger=new ArrayMerger();
		Integer[] actualSortedArray=arrayMerger.getMergedSortedArray(array1,array2);
		Integer[] expectedSortedArray={4,6,7,8};
		assertArrayEquals(actualSortedArray,expectedSortedArray);
		Integer[] array3=null;
		Integer[] array4={4,6,7,8};
		actualSortedArray=arrayMerger.getMergedSortedArray(array3,array4);
		assertArrayEquals(actualSortedArray,expectedSortedArray);
	}
	
	@Test
	public void shouldThrowExceptionGivenTwoArrayAreNull(){
		Integer[] array1=null;
		Integer[] array2=null;
		expect.expect(InvalidInputException.class);
		expect.expectMessage("Invalid input");
		ArrayMerger arrayMerger=new ArrayMerger();
		arrayMerger.getMergedSortedArray(array1,array2);
	}

}
