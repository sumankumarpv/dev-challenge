package com.db.awmd.challenge.exception;

public class DailyLimitExceededException extends RuntimeException{

	public DailyLimitExceededException(String message) {
        super(message);
    }
	
}
