package com.org.yash.assignment.seven;

import java.util.HashMap;
import java.util.Map;

import com.yash.org.assignment.exception.InvalidInputException;

public class SubArrayCal {

	public Map<Integer, Integer[]> getSubArrayWithMaxSum(Integer[] inputArray) {
		if(inputArray==null || inputArray.length==0){
			throw new InvalidInputException("Invalid input");
		}
		Map<Integer,Integer[]> result=new HashMap<>(); 
		int maxSum = 0;
		
		int maxEndingHere = 0;
		
		int start = 0;
		int end = 0;

		int begin = 0;

		for (int i = 0; i < inputArray.length; i++)
		{
	
			maxEndingHere = maxEndingHere + inputArray[i];

			if (maxEndingHere < 0)
			{
				maxEndingHere = 0;
				begin = i + 1;
			}
			if (maxSum < maxEndingHere)
			{
				maxSum = maxEndingHere;
				start = begin;
				end = i;
			}
		}
		
		Integer[] subArray=new Integer[(end-start)+1];
		int count=0;
			for (int i = start; i <= end; i++) {
				subArray[count]=inputArray[i];
				count++;
			}
		result.put(maxSum, subArray);
		return result;
	}

}
