package com.test.sample;

public class FlexPathCourse {

/****Verify Pass By Reference and Pass By Value in Java****/

	public AssessmentAttributes setFlexpathAttributes(){
		AssessmentAttributes a = new AssessmentAttributes();
		set(a);
		System.out.println(a.quizName+" "+a.vendorName);
		return a;
	}
	
	private void set(AssessmentAttributes a1){
		a1.setQuizName("quiz 1");
		a1.setVendorName("vendor 1");
	}
	
	private void set1(AssessmentAttributes a1){
		a1.quizName = "quiz test";
		a1.vendorName = "vendor test";
	}
	
	public static void main(String[] args){
		FlexPathCourse fp = new FlexPathCourse();
			
		/*******************************************************************/
		AssessmentAttributes a = fp.setFlexpathAttributes();
		AssessmentAttributes a1 = a;
		System.out.println(a.quizName+" "+a.vendorName);
		System.out.println("a1: "+a1.quizName+" "+a1.vendorName);
	
		fp.set1(a);
		System.out.println(a.quizName+" "+a.vendorName);
		System.out.println("a1: "+a1.quizName+" "+a1.vendorName);
		a1.quizName = "Modified quiz";
		a1.vendorName = "Modified Vendor";
		
		System.out.println(a.quizName+" "+a.vendorName);
		System.out.println("a1: "+a1.quizName+" "+a1.vendorName);
		
		/*******************************************************************/
		AssessmentAttributes a_new = new AssessmentAttributes("Flexpath");
		a_new.setQuizName("Quiz_new");
		
		AssessmentAttributes a_new_2 = new AssessmentAttributes("Flexpath_2");
		a_new_2.setQuizName("Quiz_new_2");
			
		System.out.println("a_new: "+a_new.quizName+", a_new_2:"+a_new_2.quizName);
		
	     fp.swap(a_new, a_new_2);
		
		//a_new = a_new_2;
	     System.out.println("a_new: "+a_new.quizName+", a_new_2:"+a_new_2.quizName);
	}
	
	void swap(AssessmentAttributes a_new,AssessmentAttributes a_new_2 ){
		//a_new = a_new_2;
		a_new.quizName = a_new_2.quizName;
	}
}
