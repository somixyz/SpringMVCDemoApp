package com.springmvcdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	// Adding custom business logic
	// theCode => HTML Form Data entered by the user,
	// theConstraintValidatorContext => you can place additional error message here
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

		// validation logic
		boolean result;
		if (theCode != null) {
			result = theCode.startsWith(coursePrefix);
		} else {
			result = true;
		}
		return result;
	}

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		coursePrefix = constraintAnnotation.value();
	}
}
