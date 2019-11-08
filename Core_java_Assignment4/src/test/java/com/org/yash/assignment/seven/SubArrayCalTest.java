package com.org.yash.assignment.seven;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

public class SubArrayCalTest {
	
	@Rule
	public ExpectedException expection=ExpectedException.none();
	
	@Test
	public void shouldReturnSubArrayWithMaxSumGivenAArray(){
		Integer[] inputArray={-2,1,-3,4,-1,2,1,-5,4};
		Map<Integer,Integer[]> expectedResult=new HashMap<>();
		Integer[] expArray={4,-1,2,1};
		expectedResult.put(6,expArray);
		SubArrayCal subArrayCal=new SubArrayCal();
		Map<Integer,Integer[]> actualResult=subArrayCal.getSubArrayWithMaxSum(inputArray);
		assertArrayEquals(expArray,actualResult.entrySet().iterator().next().getValue());
		assertEquals((Integer)6,actualResult.entrySet().iterator().next().getKey());
	}
	
	@Test
	public void shouldThrowExceptionGivenArrayIsNull(){
		Integer[] inputArray=null;
		SubArrayCal subArrayCal=new SubArrayCal();
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid input");
		subArrayCal.getSubArrayWithMaxSum(inputArray);		
	}
	
	@Test
	public void shouldThrowExceptionGivenArrayIsEmpty(){
		Integer[] inputArray={};
		SubArrayCal subArrayCal=new SubArrayCal();
		expection.expect(InvalidInputException.class);
		expection.expectMessage("Invalid input");
		subArrayCal.getSubArrayWithMaxSum(inputArray);		
	}

}
