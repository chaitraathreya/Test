package com.test.sample;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import Sample.test.fibonacci;

class Animal{
	
	void eat(){
		TestCustomException1 t = new TestCustomException1();
		System.out.println(t.protected_var);
		System.out.println("animal is eating...");
	}

	void walk(){
		System.out.println("All animals walk");
	}
}

class Dog extends Animal{
	Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	void eat(){System.out.println("dog is eating...");}

	void bark(){
		System.out.println("dog barks");
	}

	public static void main(String args[]){
		fibonacci f = new fibonacci();
		Animal a=new Dog();
		a.eat();
		a.walk();
		//learn abt generics
		//ArrayList<E>


		String s=new String("karthik");                
		s.concat("reddy");                            
		System.out.println(s); 
		
		StringBuffer sb=new StringBuffer("karthik");
		sb.append("reddy");
		System.out.println(sb);
		
		Hashtable<String, String> h = new Hashtable<String, String>();
	  // k, v -> example for generics 
		//HashMap<K, V>

	}
}
