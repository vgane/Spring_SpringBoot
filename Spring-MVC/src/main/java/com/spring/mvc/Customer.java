package com.spring.mvc;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.mvc.validation.CourseCode;

public class Customer 
{
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String firstName;
		
		
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0,message="must be greater than or equal to zero")
	@Max(value=10,message="must be greater than or equal to zero")
	private Integer freePasses;
	
	@Pattern(regexp="[a-zA-Z0-9]{5}",message="enter 5 chars/digits")
		private String postalCode; 
	
	
	@CourseCode(value="TOPS",message="must start with TOPS")
	private String courseCode;
	
	public Integer getFreePasses() {
		return freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}



	
		public String getFirstName() {
	return firstName;
		}
	
		public void setFirstName(String firstName) {
	this.firstName = firstName;
		}
	
		public String getLastName() {
			return lastName;
		}
	
		
	public void setLastName(String lastName) {
			this.lastName = lastName;
		}

	
}








