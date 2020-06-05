package com.epam.ttdjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemovalOfATest {

	/*Remove 'A' if it is present in first 2 characters of the string.
	 *if 'A' is present after 2 characters, it should not be removed. 
	 * 1. ABCD => BCD  -> A in 1st Position
	 * 2. BACD => BCD  -> A in 2nd Position
	 * 3. AACD => CD   -> A in first two Position
	 * 4. BBAA => BBAA -> No A's in first two Position
	 * 5. AABAA => BAA -> Many A's in String
	 * */
	
	RemoveAInString removeAInString; 
	
	@BeforeEach
	void setUp() {
		removeAInString = new RemoveAInString();
	}
	
	@Test
	void aIn1stPosition() {
		assertEquals("BCD", removeAInString.removeA("ABCD"));
		assertEquals("", removeAInString.removeA("A"));
		assertEquals("Z", removeAInString.removeA("AZ"));
	}
	
	@Test
	void aIn2ndPosition() {
		assertEquals("BCD", removeAInString.removeA("BACD"));
		assertEquals("C", removeAInString.removeA("CA"));
		assertEquals("CAA", removeAInString.removeA("CAAA"));
	}
	
	@Test
	void aInFirstTwoPosition() {
		assertEquals("CD", removeAInString.removeA("AACD"));
		assertEquals("", removeAInString.removeA("AA"));
	}
	
	@Test
	void noAInFirstTwoPosition() {
		assertEquals("BBAA", removeAInString.removeA("BBAA"));
		assertEquals("CC", removeAInString.removeA("CC"));
	}
	 
	@Test
	void manyAInString() {
		assertEquals("BAA", removeAInString.removeA("AABAA"));
		assertEquals("AAA", removeAInString.removeA("AAAAA"));
	}
	
	@Test
	void emptyString() {
		assertEquals("", removeAInString.removeA(""));
	}
	
}
