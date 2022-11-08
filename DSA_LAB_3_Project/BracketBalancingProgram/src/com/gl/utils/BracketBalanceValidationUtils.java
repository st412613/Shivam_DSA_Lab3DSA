package com.gl.utils;

import java.util.HashSet;
import java.util.Set;

import com.gl.model.BracketPair;

public class BracketBalanceValidationUtils {

	public static Set<BracketPair> bracketPairSet = new HashSet<>();
	
	static {
		
		BracketPair one = new BracketPair('(', ')');
		BracketPair two = new BracketPair('[', ']');
		BracketPair three = new BracketPair('{', '}');
		
		
		bracketPairSet.add(one);
		bracketPairSet.add(two);
		bracketPairSet.add(three);
		

		
	}

	public static BracketPair getBracketPair(Character closeBracketChar) {

		for (BracketPair aBracketPair : bracketPairSet) {

			if (aBracketPair.getCloseChar().equals(closeBracketChar)) {

				return aBracketPair;
			}
		}
		return null;
	}

	public static Set<Character> getOpenBrackets() {

		Set<Character> results = new HashSet<>();

		for (BracketPair aBracketPair : bracketPairSet) {

			results.add(aBracketPair.getOpenChar());

		}
		return results;

	}

	public static Set<Character> getCloseBrackets() {

		Set<Character> results = new HashSet<>();

		for (BracketPair aBracketPair : bracketPairSet) {
			results.add(aBracketPair.getCloseChar());
		}
		return results;

	}

}
