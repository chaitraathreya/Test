package com.test.sample;

public class AssessmentAttributes {
	
	public String vendorName;
	public String quizName;
	String courseName = "";
	
	AssessmentAttributes(){
		
	}
	
	AssessmentAttributes(String courseName){
		this.courseName = courseName;
	}
	
	public void setVendorName(String vendorName){
		this.vendorName = vendorName;
	}
	
	public String getVendorName(){
		return vendorName;
	}
	
	public void setQuizName(String quizName){
		this.quizName = quizName;
	}
	
	public String getQuizName(){
		return quizName;
	}

}
