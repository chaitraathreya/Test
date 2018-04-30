package com.test.sample;

class Animal1 {
	String name;

	public Animal1(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class Swap {

	public static void main(String args[]) {
		Animal1 a1 = new Animal1("Lion");
		Animal1 a2 = new Animal1("Crocodile");
		
		System.out.println("Address a1: "+a1.hashCode()+", Address a2: "+a2.hashCode());

		System.out.println("Before Swap:- a1:" + a1 + "; a2:" + a2);
		swap1(a1, a2);
		System.out.println("After Swap:- a1:" + a1 + "; a2:" + a2);
		
		/*Animal1 a = new Animal1("Lion");

		System.out.println("Before Modify: " + a);
		modify(a);
		System.out.println("After Modify: " + a);*/
	}

	public static void swap(Animal1 animal1, Animal1 animal2) {
		Animal1 temp = new Animal1("");
		System.out.println("Address of temp: "+temp.hashCode());
		temp = animal1;
		System.out.println("Address of temp: "+temp.hashCode());
		animal1 = animal2;
		System.out.println("Address of animal1: "+animal1.hashCode());
		animal2 = temp;
		System.out.println("Address of animal2: "+animal2.hashCode());
	}
	
	public static void swap1(Animal1 animal1, Animal1 animal2) {
		Animal1 temp = new Animal1("");
		System.out.println("Address of temp: "+temp.hashCode());
		temp.name = animal1.name;
		System.out.println("Address of temp: "+temp.hashCode());
		animal1.name = animal2.name;
		System.out.println("Address of animal1: "+animal1.hashCode());
		animal2.name = temp.name;
		System.out.println("Address of animal2: "+animal2.hashCode());
	}
	
	public static void modify(Animal1 animal) {
		animal.setName("Tiger");
	}
	
}
