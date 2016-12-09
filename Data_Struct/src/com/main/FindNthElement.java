package com.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




/*Write a method that solves the following problem:
Accept as input:
•	list: a singly-linked list
Find the 5th element from the end of the list. Do not iterate the list more than once.  Assume the list size cannot be known without traversing the list.
Support your answer with a suite of unit tests.*/



public class FindNthElement {

	public static void main(String[] args) {

		List<String> inputListStr = new ArrayList<String>();
		java.util.LinkedList<String> outputList = new java.util.LinkedList<String>();
		System.out.println("Enter comma separated input");
		Scanner Scan1 = new Scanner(System.in);
		inputListStr = Arrays.asList(Scan1.next().split(","));
		outputList.addAll(inputListStr);
		nthElement(outputList);
		Scan1.close();
	}

	public static String nthElement(java.util.LinkedList<String> outputList){

		int counter=0;
		String Error_Msg="";
		String Fifth_Value;
		for(String list : outputList){
			counter++;
		}	
		if(counter<5)
		{
			Error_Msg="Atleast 5 elemets are required to perform the operation" ; 
			System.out.println("Atleast 5 elemets are required to perform the operation");  
			return Error_Msg;
		}
		else
		{	   
			Fifth_Value=outputList.get(counter-5);
			System.out.println("5th element is "+outputList.get(counter-5));
			return Fifth_Value;
		}
	}		



}
