package com.kod.exception.customExceptionHandling;

public class underAgeException extends Exception{
	public String getMessage(String name) {
		return name+" is under age user to get married";
	}
}
