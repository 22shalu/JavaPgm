/*Write a method that solves the following problem:
Accept as input:
•	list: a singly-linked list
Find the 5th element from the end of the list. Do not iterate the list more than once.  Assume the list size cannot be known without traversing the list.
Support your answer with a suite of unit tests.*/


package com.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindNthElement {

	public static void main(String[] args) {

		List<String> inputListStr = new ArrayList<String>(); 
		java.util.LinkedList<String> outputList = new java.util.LinkedList<String>();
		System.out.println("Enter atleast five comma separated values");
		Scanner Scan1 = new Scanner(System.in);
		inputListStr = Arrays.asList(Scan1.next().split(","));
		outputList.addAll(inputListStr);
		nthElement(outputList);
		Scan1.close();

	}

	public static String nthElement(java.util.LinkedList<String> outputList){

		int counter=0;
		String errorMsg="";
		String fifthValue;
		for(String list : outputList){
			counter++;
		}	
		if(counter<5)
		{
			errorMsg="Atleast 5 elemets are required to perform the operation" ; 
			System.out.println("Atleast 5 elemets are required to perform the operation");  
			return errorMsg;
		}
		else
		{	   
			fifthValue=outputList.get(counter-5);
			System.out.println("5th element is "+fifthValue);
			return fifthValue;
		}
	}		



}
