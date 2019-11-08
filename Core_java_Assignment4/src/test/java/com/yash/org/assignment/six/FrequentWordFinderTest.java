package com.yash.org.assignment.six;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.org.assignment.exception.InvalidInputException;

public class FrequentWordFinderTest {
	
	@Rule
	public ExpectedException expect=ExpectedException.none();
	
	@Test
	public void shouldReturnMostFreqentlyUsedWordGiveAInput(){
		String input="Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] bannedWord={"hit"};
		FrequentWordFinder frequentWordFinder=new FrequentWordFinder();
		String actualResult=frequentWordFinder.findFrequentWord(input,bannedWord);
		String expectedResult="ball";
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void shouldReturnMostFreqentlyUsedWordGiveAInputAndBannedWordIsEmpty(){
		String input="Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] bannedWord={};
		FrequentWordFinder frequentWordFinder=new FrequentWordFinder();
		String actualResult=frequentWordFinder.findFrequentWord(input,bannedWord);
		String expectedResult="hit";
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void shouldThrowExceptionIfGivenInputIsNull(){
		String input=null;
		String[] bannedWord={"hit"};
		expect.expect(InvalidInputException.class);
		expect.expectMessage("Invalid input");
		FrequentWordFinder frequentWordFinder=new FrequentWordFinder();
		frequentWordFinder.findFrequentWord(input,bannedWord);
	}
	
	@Test
	public void shouldThrowExceptionIfGivenInputIsEmpty(){
		String input="";
		String[] bannedWord={"hit"};
		expect.expect(InvalidInputException.class);
		expect.expectMessage("Invalid input");
		FrequentWordFinder frequentWordFinder=new FrequentWordFinder();
		frequentWordFinder.findFrequentWord(input,bannedWord);
	}

}
