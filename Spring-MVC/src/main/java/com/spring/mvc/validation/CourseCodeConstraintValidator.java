package com.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext ConstraintValidatorContext) {
		boolean result;
			if(theCode!=null) result=theCode.startsWith(coursePrefix);	
			else result=true;
		return result;
	}

}
