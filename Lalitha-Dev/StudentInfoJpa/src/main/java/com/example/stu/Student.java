package com.example.stu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer studentId ;
	private  String studentName;
	private Integer studentMarks;
	
	
	
	  public Student() { 
		  super(); // TODO Auto-generated constructor stub 
		  } 
	  
	  public Student( Integer studentId)
	  {
		  this.studentId=studentId;
		  }
	  
	  public Student( String studentName, Integer studentMarks) 
	  { 
		  super();
	this.  studentName = studentName; 
	 this. studentMarks = studentMarks; 
	  }
	  
	  public String getStudentName()
	  {
		  return studentName; 
		  }
	  public void  setStudentName(String studentName) { 
		  studentName = studentName;
		  }
	  public Integer getStudentMarks() 
	  { 
		  return studentMarks;
		  }
	   public void setStudentMarks(Integer studentMarks) { 
		   studentMarks = studentMarks; 
	   }
	 
	
	
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks="
				+ studentMarks + "]";
	}



	
	
}
