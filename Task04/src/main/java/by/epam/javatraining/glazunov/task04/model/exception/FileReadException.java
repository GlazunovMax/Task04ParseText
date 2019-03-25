package by.epam.javatraining.glazunov.task04.model.exception;

import java.io.IOException;

public class FileReadException extends Exception {

	public FileReadException() {
		super();
	}
	
	public FileReadException(String message, Exception e) {
		super(message, e);
	}

	public FileReadException(String message) {
		super(message);
	}

	public FileReadException(Exception e) {
		super(e);
	}

	
}
