package Sample.test;

import java.util.TreeSet;

public class TreesetEx {
	
	 public static void main(String a[])
	 
	 {
	  
	        String[] strArr = {"one","two","three","four","four","five"};
	  
	        TreeSet<String> unique = new TreeSet<String>();
	  
	        for(String str:strArr){
	  
	            if(!unique.add(str)){
	  
	             System.out.println("Duplicate Entry is: "+str);
	  
	            }
	  
	        }
	        
	        int[] nos = {1,2,3,4,4};
	        TreeSet<Integer> numbers = new TreeSet<Integer>();
	        
	        for(int i=0;i<nos.length;i++){
	        	if(!numbers.add(nos[i])){
	        		System.out.println(nos[i]);
	        	}
	        }
	  
	    }

}
