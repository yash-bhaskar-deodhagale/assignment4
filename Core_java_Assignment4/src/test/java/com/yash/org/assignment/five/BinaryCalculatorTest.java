package com.yash.org.assignment.five;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

public class BinaryCalculatorTest {
	
	@Rule
	public ExpectedException except=ExpectedException.none();
	
	@Test
	public void shouldReturnSumOfTwoBinaryStringInBinary(){
		String binaryNumberOne="11";
		String binaryNumberTwo="1";
		String expectedSum="100";
		BinaryCalculator binaryCalculator=new BinaryCalculator();
		String actualSum=binaryCalculator.getSumOfBinary(binaryNumberOne,binaryNumberTwo);
		assertEquals(expectedSum,actualSum);		
	}
	
	@Test
	public void shouldReturnExceptionIfEitherInputOneIsNull(){
		String binaryNumberOne=null;
		String binaryNumberTwo="1";
		except.expect(InvalidInputException.class);
		except.expectMessage("Invalid input");
		BinaryCalculator binaryCalculator=new BinaryCalculator();
		binaryCalculator.getSumOfBinary(binaryNumberOne,binaryNumberTwo);		
	}
	
	@Test
	public void shouldReturnExceptionIfEitherInputTwoIsNull(){
		String binaryNumberOne="1";
		String binaryNumberTwo=null;
		except.expect(InvalidInputException.class);
		except.expectMessage("Invalid input");
		BinaryCalculator binaryCalculator=new BinaryCalculator();
		binaryCalculator.getSumOfBinary(binaryNumberOne,binaryNumberTwo);		
	}
	
	@Test
	public void shouldReturnExceptionIfEitherInputOneIsEmpty(){
		String binaryNumberOne="";
		String binaryNumberTwo="1";
		except.expect(InvalidInputException.class);
		except.expectMessage("Invalid input");
		BinaryCalculator binaryCalculator=new BinaryCalculator();
		binaryCalculator.getSumOfBinary(binaryNumberOne,binaryNumberTwo);		
	}
	
	@Test
	public void shouldReturnExceptionIfEitherInputTwoIsEmpty(){
		String binaryNumberOne="1";
		String binaryNumberTwo="";
		except.expect(InvalidInputException.class);
		except.expectMessage("Invalid input");
		BinaryCalculator binaryCalculator=new BinaryCalculator();
		binaryCalculator.getSumOfBinary(binaryNumberOne,binaryNumberTwo);		
	}


}
