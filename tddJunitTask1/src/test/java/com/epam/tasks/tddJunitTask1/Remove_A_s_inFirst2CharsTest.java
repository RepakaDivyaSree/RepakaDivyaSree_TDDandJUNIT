package com.epam.tasks.tddJunitTask1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove_A_s_inFirst2CharsTest {
	/*
	 * TODO
	 * 1. AA=>
	 * 2. AABD=>BD
	 * 3. ABFGHAAAADF=>BFGHAAAADF
	 * 4. ""=>""
	 * 5. BBAA=>BBAA
	 * 6. A=>
	 * 7. BACD=> BCD
	 * 8. BC=>BC
	 */
	Remove_A_s_inFirst2Chars removeAs;
	@BeforeEach
	void createObject()
	{
		removeAs=new Remove_A_s_inFirst2Chars();
	}
	@Test
	void test2As() {
		assertEquals("",removeAs.removeFirstA_s("AA"));
	}
	@Test
	void test2AsWithChars() {
		assertEquals("BD",removeAs.removeFirstA_s("AABD"));
	}
	@Test
	void test1AWithChars() {
		assertEquals("BFGHAAAADF",removeAs.removeFirstA_s("ABFGHAAAADF"));
	}
	
	@Test
	void testnull() {
		assertEquals(" ",removeAs.removeFirstA_s(" "));
	}
	
	@Test
	void testNoAs() {
		assertEquals("BBAA",removeAs.removeFirstA_s("BBAA"));
	}
	@Test
	void test1A() {
		assertEquals("",removeAs.removeFirstA_s("A"));
	}
	
	@Test
	void test2ndA() {
		assertEquals("BCD",removeAs.removeFirstA_s("BACD"));
	}
	@Test
	void testNoA() {
		assertEquals("BC",removeAs.removeFirstA_s("BC"));
	}

}
