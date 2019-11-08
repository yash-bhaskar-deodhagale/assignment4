package com.yash.org.assignment.six;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

import com.yash.org.assignment.exception.InvalidInputException;

public class FrequentWordFinder {

	public String findFrequentWord(String input, String[] bannedWord) {
		if(input==null || input.isEmpty()){
			throw new InvalidInputException("Invalid input");
		}
		input = input.replaceAll("[!,.-]", "");
		String[] splitArray = input.split(" ");
		Map<String, Integer> map = new HashMap<>();

		Stream.of(splitArray).forEach(word -> {
			word = word.toLowerCase();
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		});
		if(bannedWord.length>0){
		Stream.of(bannedWord).forEach(word -> {
			word=word.toLowerCase();
				map.remove(word);
		});
		}
		String mostFrequent = map.entrySet().stream()
				.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
		return mostFrequent;
	}

}
