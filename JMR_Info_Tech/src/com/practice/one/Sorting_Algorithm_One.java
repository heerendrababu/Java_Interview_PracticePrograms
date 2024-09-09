package com.practice.one;

public class Sorting_Algorithm_One {

	public static void main(String[] args) 
	{
       int arr[] = {9,4,3,2,6,5,9,3,223,2,3,4,3,2,2,3};
       
       for(int i = 0;i<=arr.length-1;i++)
       {
    	   for(int j=i+1;j<=arr.length-1;j++)
    	   {
    		   if(arr[i]>arr[j])
    		   {
    			   int temp = arr[i];
    			   arr[i] = arr[j];
    			   arr[j] = temp;
    		   }
    	   }
    	   System.out.print(arr[i]+",");
       }
	}
}

//The code you provided implements the Bubble Sort algorithm. 
//In this algorithm, adjacent elements are compared and swapped if they are in the wrong order. 
//This process is repeated until the entire array is sorted.
//The name "Bubble Sort" comes from the way smaller elements "bubble" to the top of the array during each iteration.
