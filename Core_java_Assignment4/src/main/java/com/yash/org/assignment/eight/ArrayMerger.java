package com.yash.org.assignment.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yash.org.assignment.exception.InvalidInputException;

public class ArrayMerger {

	public Integer[] getMergedSortedArray(Integer[] array1, Integer[] array2) {
        if(array1==null && array2==null){
        	throw new InvalidInputException("Invalid input");
        }
        List<Integer> list=new ArrayList<>();
        if(array1!=null)
        list.addAll(Arrays.asList(array1));
        if(array2!=null)
	    list.addAll(Arrays.asList(array2));
	    Object[] mergedArray =  list.toArray();
	    Integer[] sortedArray = new Integer[mergedArray.length];;
		System.arraycopy(mergedArray, 0, sortedArray, 0, mergedArray.length);
		Arrays.sort(sortedArray);
		return sortedArray;
	}

}
