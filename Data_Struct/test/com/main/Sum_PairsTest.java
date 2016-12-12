package com.main;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;
import junit.framework.Assert;

public class Sum_PairsTest {


	@Test
	public void test_1() {	

		ArrayList<Integer> testDataList = new ArrayList<Integer>();
		int testDataTarget=0;
		testDataList.clear();
		testDataList.add(0);
		testDataList.add(1);
		testDataList.add(2);
		testDataList.add(3);
		testDataList.add(4);
		testDataList.add(5);

		System.out.println("Test 1 output :-");  
		int Actual_1=Sum_Pairs.findPairs(testDataList,testDataTarget);
		Assert.assertEquals("Test 1 failed", 0, Actual_1);

	}
	//@Ignore
	@Test
	public void test_2() {	

		ArrayList<Integer> testDataList = new ArrayList<Integer>();
		int testDataTarget=0;
		testDataList.clear();
		testDataList.add(-2);
		testDataList.add(-1);
		testDataList.add(0);
		testDataList.add(1);
		testDataList.add(2);
		testDataList.add(3);

		System.out.println("Test 2 output :-");
		int Actual_1=Sum_Pairs.findPairs(testDataList,testDataTarget);
		Assert.assertEquals("Test 2 failed", 2, Actual_1);

	}
	//@Ignore
	@Test
	public void test_3() {	

		ArrayList<String> testDataList = new ArrayList<String>();
		ArrayList<Integer> userInputList = new ArrayList<Integer>();
		testDataList.clear();
		testDataList.add("W");
		testDataList.add("2");
		testDataList.add("2");
		testDataList.add("3");
		testDataList.add("4");
		testDataList.add("5");

		System.out.println("Test 3 output :-");
		int Actual_1=Sum_Pairs.userInputsList(testDataList, userInputList);
		Assert.assertEquals("Test 3 failed", 999, Actual_1);

	}
	//@Ignore
	@Test
	public void test_4() {	

		ArrayList<String> testDataList = new ArrayList<String>();
		ArrayList<Integer> userInputList = new ArrayList<Integer>();
		testDataList.clear();
		testDataList.add("1");
		testDataList.add("2");
		testDataList.add("2");
		testDataList.add("3");
		testDataList.add("4");
		testDataList.add("5");

		System.out.println("Test 4 output :-");
		Sum_Pairs.userInputsList(testDataList, userInputList);
		int Actual_1=Sum_Pairs.chkDuplicates(userInputList);
		Assert.assertEquals("Test 4 failed", 999, Actual_1);

	}
	//@Ignore
	@Test
	public void test_5() {	

		ArrayList<String> testDataList = new ArrayList<String>();
		ArrayList<Integer> userInputList = new ArrayList<Integer>();
		testDataList.clear();
		testDataList.add("1");

		System.out.println("Test 5 output :-");
		int Actual_1=Sum_Pairs.userInputsList(testDataList, userInputList);
		Assert.assertEquals("Test 5 failed", 999, Actual_1);

	}
	//@Ignore
	@Test
	public void test_6() {	

		ArrayList<Integer> testDataList = new ArrayList<Integer>();

		int testDataTarget=3;
		testDataList.clear();
		testDataList.add(1);
		testDataList.add(2);
		testDataList.add(3);
		testDataList.add(4);
		testDataList.add(5);

		System.out.println("Test 6 output :-");
		int Actual_1=Sum_Pairs.findPairs(testDataList,testDataTarget);
		Assert.assertEquals("Test 6 failed", 1, Actual_1);

	}

	@Test
	public void test_7() {	

		ArrayList<Integer> testDataList = new ArrayList<Integer>();

		int testDataTarget=10;
		testDataList.clear();
		testDataList.add(2);
		testDataList.add(3);
		testDataList.add(7);
		testDataList.add(6);
		testDataList.add(9);
		testDataList.add(4);

		System.out.println("Test 7 output :-");
		int Actual_1=Sum_Pairs.findPairs(testDataList,testDataTarget);
		Assert.assertEquals("Test 7 failed", 2, Actual_1);

	}

}
