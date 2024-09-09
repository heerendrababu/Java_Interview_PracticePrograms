package com.practice.one;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfDigits {

	public static void main(String[] args) 
	{
	 
     int[] arr = {10,3,0,20,20,10,10,0};
     LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer,Integer>();
     for(int i=0;i<=arr.length-1;i++)
     {
    	 if(h.containsKey(arr[i])== true)
    	 {
    		 int val=h.get(arr[i]);
    		 h.put(arr[i], val+1);
    	 }
    	 else
    		 h.put(arr[i], 1);
     }
     System.out.println(h);
    
     for(Map.Entry<Integer, Integer> entry : h.entrySet())
     {
    	 int key = entry.getKey();
    	 int value = entry.getValue();
    	 
    	 System.out.println(key+": is occuring"+value +"times");
     }
     
	}

}
