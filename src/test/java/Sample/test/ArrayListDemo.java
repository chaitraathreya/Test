package Sample.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String args[]) {

		   // create an empty array list1 with an initial capacity
		   ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
			
		   // use add() method to add elements in the list
		   arrlist.add(12);
		   arrlist.add(20);
		   arrlist.add(45);
		   
		   arrlist.add(1, 22);
		   System.out.println("print: "+arrlist);
		   
		   Collections.swap(arrlist, 0, 2);
		   
		   System.out.println("swap: "+arrlist);

		   // let us print all the elements available in list1
		   System.out.println("Printing list1:");
		   for (Integer number : arrlist) {
		   System.out.println("Number = " + number);
		   }

		   // create an empty array list2 with an initial capacity
		   ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);
			
		   // use add() method to add elements in list2
		   arrlist2.add(20);
		   arrlist2.add(30);
		   arrlist2.add(31);
		   arrlist2.add(35);

		   // let us print all the elements available in list2
		   System.out.println("Printing list2:");
		   for (Integer number : arrlist2) {
		   System.out.println("Number = " + number);
		   }

		   // inserting all elements, list2 will get printed after list1
		   arrlist.addAll(arrlist2);
			
		   System.out.println("Printing all the elements");
		   // let us print all the elements available in list1
		   for (Integer number : arrlist) {
		   System.out.println("Number = " + number);
		   }
		   }
}
