package Sample2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Student{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
}  

class NameComparator implements Comparator<Object>{  
	public int compare(Object o1,Object o2){ 
				
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  

		return s1.name.compareTo(s2.name);  
	}  
}  

class AgeComparator implements Comparator<Object>{  
	public int compare(Object o1,Object o2){  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  

		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  
	}  
}  

public class ComparatorEx {

	public static void main(String args[]){  

		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  

		System.out.println("Sorting by Name...");  

		Collections.sort(al,new NameComparator());  
		Iterator<Student> itr=al.iterator();  
		while(itr.hasNext()){  
			Student st=(Student)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

		System.out.println("sorting by age...");  

		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
			Student st=(Student)itr2.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  


	}  

}
