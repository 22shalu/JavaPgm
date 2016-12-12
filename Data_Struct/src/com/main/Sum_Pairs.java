/*
Write a method that solves the following problem:
Accept as input:
�	list: an unordered list of integers containing no duplicates
�	target: an integer
Find the set of pairs of integers that exist in list that sum to target. Assume that for two numbers x and y, the pair (x, y) is equivalent to the pair (y, x). 
Support your answer with a suite of unit tests.
*/


package com.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Sum_Pairs {


	public static void main(String[] args) {


		List<String> userInputListStr = new ArrayList<String>();
		ArrayList<Integer> userInputList = new ArrayList<Integer>();
		Scanner Scan1 = null;
		int userInputTarget=0;		
		int errorCode=0;

		System.out.print("Enter comma separated integer values containing no duplicates :- ");
		Scan1 = new Scanner(System.in);
		userInputListStr = Arrays.asList(Scan1.next().split(","));

		userInputTarget=userInputsList(userInputListStr, userInputList);
		if(userInputTarget != 999)
		{
			errorCode = chkDuplicates(userInputList);
			if(errorCode!=999)
			{
				System.out.print("Enter a target integer value :- ");
				Scan1 = new Scanner(System.in);    	
				userInputTarget = userInputsTarget(Scan1);
				//Scan1.close();
				if(userInputTarget != 999)
					findPairs(userInputList,userInputTarget);	

			}
		}

	}

	//Captures the values keyed in by user in String array UserInputListStr and parses into integer format and saves in Integer array UserInputList. 
	//In case of wrong data keyed in by user, UserInputTarget is set to 999. 
	//Pgm exits if UserInputTarget is 999 else prompts the user to key in the target value 
	public static int userInputsList(List<String> userInputListStr, ArrayList<Integer> userInputList){

		int userInputTarget = 0;

		try{

			for(String value : userInputListStr){
				userInputList.add(Integer.parseInt(value));
			}
			if(userInputList.size()<2)
			{
				System.out.println("Atleast two values are required to proceed");
				userInputTarget=999;
			}
		}catch (Exception e ) {
			System.out.println("User entered an unexpected data type. Only Integers are allowed. Please try again");    
			userInputTarget=999;    	  
		}
		return userInputTarget;

	} 
	
// Scans the target value keyed in by the user and saves in integer format in UserInputTarget. In case of wrong input, UserInputTarget is set to 999
	public static int userInputsTarget(Scanner Scan1){
		
		int userInputTarget = 0;

		try{
			userInputTarget = Scan1.nextInt();  

		}catch (Exception e ) {		   
			System.out.println("User entered an unexpected data type. Only Integers are allowed. Please try again");
			userInputTarget=999;  	 
		}
		return userInputTarget;	   

	} 


	public static int chkDuplicates(ArrayList<Integer> userInputList){
		int errorCode=0;
		Set<Integer> userInputSet = new HashSet<Integer>(userInputList);		
		if (userInputSet.size()<userInputList.size()){	 
			errorCode=999;
			System.out.println("User input contains duplicates. Please try again without duplicates");
			return errorCode;
		}

		return 0;

	}

	// in the if clause userInputList.get(i)!=userInputList.get(j) is used so that the test returns right output even if the target value is 0
	public static int findPairs(List<Integer> userInputList, int userInputTarget){
		int count = 0;
		TreeMap<String, String> pairMap = new TreeMap<String, String>();
		int X = 0;
		for(int i=0; i < userInputList.size();i++){
			for(int j=X; j < userInputList.size();j++){			    	
				if((userInputList.get(i) + userInputList.get(j) == userInputTarget)&&userInputList.get(i)!=userInputList.get(j)){
					count++;
					pairMap.put("Pair "+count, "("+userInputList.get(i)+","+userInputList.get(j)+")");
					
				}
			}
			X++;
		}
		System.out.println("No of pairs summing to the target values are : "+count);
		if(count!=0)
		System.out.println("Pairs summing to the target values are : "+ pairMap);
		return count;
	} 
}
	


			   
	





