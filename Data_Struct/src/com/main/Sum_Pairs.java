package com.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sum_Pairs {


	public static void main(String[] args) {

		List<String> UserInputListStr = new ArrayList<String>();
		ArrayList<Integer> UserInputList = new ArrayList<Integer>();		
		int UserInputTarget=0;
		Scanner Scan1 = null;
		int Error_Code=0;


		System.out.print("Enter comma separated input values :- ");
		Scan1 = new Scanner(System.in);
		UserInputListStr = Arrays.asList(Scan1.next().split(","));

		UserInputTarget=User_Inputs_List(UserInputListStr, UserInputList);
		if(UserInputTarget != 999)
		{
			Error_Code = chkDuplicates(UserInputList);
			if(Error_Code!=999)
			{
				System.out.print("Enter target value :- ");
				Scan1 = new Scanner(System.in);    	
				UserInputTarget = User_Inputs_Target(Scan1);
				Scan1.close();
				if(UserInputTarget != 999)
					findPairs(UserInputList,UserInputTarget);			
			}
		}

	}

	public static int User_Inputs_List(List<String> UserInputListStr, ArrayList<Integer> UserInputList){

		int UserInputTarget = 0;

		try{

			for(String value : UserInputListStr){
				UserInputList.add(Integer.parseInt(value));
			}
			if(UserInputList.size()<2)
			{
				System.out.println("Atleast two values are required to proceed");
				UserInputTarget=999;
			}
		}catch (Exception e ) {
			System.out.println("User entered an unexpected data type. Only Integers are allowed. Please try again");    
			UserInputTarget=999;    	  
		}
		return UserInputTarget;

	} 

	public static int User_Inputs_Target(Scanner Scan1){
		int UserInputTarget = 0;

		try{
			UserInputTarget = Scan1.nextInt();  

		}catch (Exception e ) {		   
			System.out.println("User entered an unexpected data type. Only Integers are allowed. Please try again");
			UserInputTarget=999;
		//	System.exit(0);   	 
		}
		return UserInputTarget;	   

	} 



	public static int chkDuplicates(ArrayList<Integer> UserInputList){
		int Error_Code=0;
		Set<Integer> UserInputSet = new HashSet<Integer>(UserInputList);		
		if (UserInputSet.size()<UserInputList.size()){	
			Error_Code=999;
			System.out.println("User input contains duplicates. Please try again without duplicates");
			return Error_Code;
		}

		return 0;

	}

	public static int findPairs(List<Integer> UserInputList, int UserInputTarget){
		int Count = 0;
		int X = 0;
		for(int i=0; i < UserInputList.size();i++){
			for(int j=X; j < UserInputList.size();j++){			    	
				if((UserInputList.get(i) + UserInputList.get(j) == UserInputTarget)&UserInputList.get(i)!=UserInputList.get(j)){
					Count++;
				}
			}
			X++;
		}
		System.out.println("No of pairs summing to the target values are : "+Count);
		return Count;
	} 
}
	


			   
	





