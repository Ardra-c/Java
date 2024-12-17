package com.kod.exception.customExceptionHandling;

public class OverAgeException extends Exception{
	public String getMessage(String name) {
		return name+" Age limit is exceeded Invalid user to get married";
	}
}
