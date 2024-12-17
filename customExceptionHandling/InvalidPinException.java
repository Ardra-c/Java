package com.kod.exception.customExceptionHandling;

public class InvalidPinException extends Exception{
		public String getMessage() {
			return "Invalid pin Please try again...";
			
		}
}
