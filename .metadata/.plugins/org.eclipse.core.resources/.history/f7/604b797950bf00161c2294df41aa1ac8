package com.main;
import java.util.ArrayList;
import org.junit.Test;
import junit.framework.Assert;

public class Sum_PairsTest {


	@Test
	public void test_1() {	

		ArrayList<Integer> TestDataList_1 = new ArrayList<Integer>();
		int TestDataTarget_1=0;
		TestDataList_1.clear();
		TestDataList_1.add(0);
		TestDataList_1.add(1);
		TestDataList_1.add(2);
		TestDataList_1.add(3);
		TestDataList_1.add(4);
		TestDataList_1.add(5);


		int Actual_1=Sum_Pairs.findPairs(TestDataList_1,TestDataTarget_1);
		Assert.assertEquals("", 0, Actual_1);

	}

	@Test
	public void test_2() {	

		ArrayList<Integer> TestDataList_1 = new ArrayList<Integer>();
		int TestDataTarget_1=0;
		TestDataList_1.clear();
		TestDataList_1.add(-2);
		TestDataList_1.add(-1);
		TestDataList_1.add(0);
		TestDataList_1.add(1);
		TestDataList_1.add(2);
		TestDataList_1.add(3);


		int Actual_1=Sum_Pairs.findPairs(TestDataList_1,TestDataTarget_1);
		Assert.assertEquals("", 2, Actual_1);

	}

	@Test
	public void test_3() {	

		ArrayList<String> TestDataList_1 = new ArrayList<String>();
		ArrayList<Integer> UserInputList = new ArrayList<Integer>();
		TestDataList_1.clear();
		TestDataList_1.add("W");
		TestDataList_1.add("2");
		TestDataList_1.add("2");
		TestDataList_1.add("3");
		TestDataList_1.add("4");
		TestDataList_1.add("5");


		int Actual_1=Sum_Pairs.User_Inputs_List(TestDataList_1, UserInputList);
		Assert.assertEquals("", 999, Actual_1);

	}

	@Test
	public void test_4() {	

		ArrayList<String> TestDataList_1 = new ArrayList<String>();
		ArrayList<Integer> UserInputList = new ArrayList<Integer>();
		TestDataList_1.clear();
		TestDataList_1.add("1");
		TestDataList_1.add("2");
		TestDataList_1.add("2");
		TestDataList_1.add("3");
		TestDataList_1.add("4");
		TestDataList_1.add("5");


		Sum_Pairs.User_Inputs_List(TestDataList_1, UserInputList);
		int Actual_1=Sum_Pairs.chkDuplicates(UserInputList);
		Assert.assertEquals("", 999, Actual_1);

	}

	@Test
	public void test_5() {	

		ArrayList<String> TestDataList_1 = new ArrayList<String>();
		ArrayList<Integer> UserInputList = new ArrayList<Integer>();
		TestDataList_1.clear();
		TestDataList_1.add("1");


		int Actual_1=Sum_Pairs.User_Inputs_List(TestDataList_1, UserInputList);
		Assert.assertEquals("", 999, Actual_1);

	}
	@Test
	public void test_6() {	

		ArrayList<Integer> TestDataList_1 = new ArrayList<Integer>();

		int TestDataTarget_1=3;
		TestDataList_1.clear();
		TestDataList_1.add(1);
		TestDataList_1.add(2);
		TestDataList_1.add(3);
		TestDataList_1.add(4);
		TestDataList_1.add(5);


		int Actual_1=Sum_Pairs.findPairs(TestDataList_1,TestDataTarget_1);
		Assert.assertEquals("", 1, Actual_1);

	}


}
