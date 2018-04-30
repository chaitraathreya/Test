package Sample.test;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {
	
	 public static void main(String a[]){
         
	        LinkedList<String> list = new LinkedList<String>();
	        list.add("Java");
	        list.add("Cric");
	        list.add("Play");
	        list.add("Watch");
	        list.add("Glass");
	        Collections.reverse(list);
	        System.out.println("Results after reverse operation:");
	        for(String str: list){
	            System.out.println(str);
	        }
	        
	        LinkedList<String> list2 = new LinkedList<String>();
	        list2.add("Javac");
	        list2.add("Cric");
	        list2.add("Play");
	        list2.add("Watch");
	        list2.add("Glass");
	        Collections.reverse(list2);
	        System.out.println("Results after reverse operation:");
	        for(String str: list){
	            System.out.println(str);
	        }
	        
	        boolean coll =  Collections.disjoint(list, list2);
	        System.out.println(coll);
	    }

}
