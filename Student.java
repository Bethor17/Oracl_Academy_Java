package com.example.domain;
public class Student 
{
public static void main(String[] args) {
// TODO Auto-generated method stub
	
	}
		private int  studentId;
		private String name;
		private int ssn;
		private double gpa;
		public final int SCHCODE = 34958;
		public Student(){
		
	public String toString() 
	{
	String s1 = ""; 
	s1 =  "Student Id: " +
	getStudentId() + "Student Name: " + getName() + 
	"Student SSN: " + getSSN() + "Student GPA: " + getGPA(); 
	return s1; 
	}

					
	}
							
				
	public int getStudentId(){
	return studentId;
	}
	public void setStudentId1(int StudentId){
	this.studentId = StudentId;
	}
		
			public String getname(){
			return name;
			}
			public void setname(String nombre){
			this.name = nombre;
			}
		
	public int getssn(){
	return studentId;
	}
	public void setssn(int StudentId){
	this.ssn = StudentId;
	}

	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}		
}
		


