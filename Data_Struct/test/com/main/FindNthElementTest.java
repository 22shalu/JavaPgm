package com.main;
import org.junit.Test;
import junit.framework.Assert;

public class FindNthElementTest {

	@Test
	public void test_1() {
		java.util.LinkedList<String>  testDataList = new   java.util.LinkedList<String>();
		
		testDataList.add("1");
		testDataList.add("2");
		testDataList.add("3");
		testDataList.add("4");
		testDataList.add("5");
		testDataList.add("6");
		testDataList.add("7");

		System.out.println("Test 1 output :-"); 
		String actual=FindNthElement.nthElement(testDataList);
		Assert.assertEquals(testDataList.get(2), actual);

	}

	@Test
	public void test_2() {
		java.util.LinkedList<String>  testDataList = new   java.util.LinkedList<String>();
	
		testDataList.add("0");
		testDataList.add("0");
		testDataList.add("0");
		testDataList.add("0");
		testDataList.add("0");
		testDataList.add("0");
		testDataList.add("0");

		System.out.println("Test 2 output :-"); 
		String actual=FindNthElement.nthElement(testDataList);
		Assert.assertEquals(testDataList.get(1), actual);

	}
	@Test
	public void test_3() {
		java.util.LinkedList<String>  testDataList = new   java.util.LinkedList<String>();
		
		testDataList.add("T");
		testDataList.add("E");
		testDataList.add("S");
		testDataList.add("T");
		testDataList.add("1");
		testDataList.add("2");
		testDataList.add("3");

		System.out.println("Test 3 output :-"); 
		String actual=FindNthElement.nthElement(testDataList);
		Assert.assertEquals(testDataList.get(2), actual);

	}
	@Test
	public void test_4() {
		java.util.LinkedList<String>  testDataList = new   java.util.LinkedList<String>();

		testDataList.add("T");
		testDataList.add("E");
		testDataList.add("S");
		testDataList.add("T");

		System.out.println("Test 4 output :-"); 
		String actual=FindNthElement.nthElement(testDataList);
		Assert.assertEquals("Atleast 5 elemets are required to perform the operation", actual);

	}

	@Test
	public void test_5() {
		java.util.LinkedList<String>  testDataList = new   java.util.LinkedList<String>();
	
		testDataList.add("T");
		testDataList.add("E");
		testDataList.add("S");
		testDataList.add("T");
		testDataList.add("1");

		System.out.println("Test 5 output :-"); 
		String actual=FindNthElement.nthElement(testDataList);
		Assert.assertEquals(testDataList.get(0), actual);

	}

}
