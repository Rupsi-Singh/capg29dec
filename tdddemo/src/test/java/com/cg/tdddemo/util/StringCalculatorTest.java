package com.cg.tdddemo.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	private StringCalculator stringCalculator;
	private static String ANY_SINGLE_NUMBER_AS_STRING = "300";
	private static int EXPECTED_SINGLE_NUMBER_AS_INTEGER = 300;

	@Before
	public void setup() {
		stringCalculator=new StringCalculator();
	}
	@Test
	public void testCalculate_GivenEmptyString_ShouldReturn0AsInteger() {
		int result = stringCalculator.calculate("");
		assertEquals(0, result);
	}
	
	@Test
	public void testCalculate_Given1AsString_ShouldReturn1AsInteger() {
		int result = stringCalculator.calculate(ANY_SINGLE_NUMBER_AS_STRING);
		assertEquals(EXPECTED_SINGLE_NUMBER_AS_INTEGER, result);
	}
	@Test
	public void testCalculate_Given1AND2AsStringSeparedByComma_ShouldReturn3AsInteger() {
		int result = stringCalculator.calculate("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void testCalculate_Given1AND2And3AsStringSeparedByComma_ShouldReturn6AsInteger() {
		int result = stringCalculator.calculate("1,2,3");
		assertEquals(6, result);
	}

}
