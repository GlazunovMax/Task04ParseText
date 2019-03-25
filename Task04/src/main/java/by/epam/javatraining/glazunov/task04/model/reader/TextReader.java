package by.epam.javatraining.glazunov.task04.model.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;

import by.epam.javatraining.glazunov.task04.model.exception.FileReadException;

public class TextReader {
	private final static Logger LOGGER = Logger.getRootLogger();

	public static String readFile(String fileName) throws FileReadException {

		BufferedReader reader = null;
		StringBuilder builder = new StringBuilder();

		try {
			reader = new BufferedReader(new FileReader(fileName));

			String text = "";

			while ((text = reader.readLine()) != null) {
				builder.append(text).append("\n");
			}
		} catch (FileNotFoundException e) {
			LOGGER.error("Initialization file is not exists");
		} catch (IOException e) {
			throw new FileReadException("Error reading file", e);
		}

		return builder.toString();
	}

}
