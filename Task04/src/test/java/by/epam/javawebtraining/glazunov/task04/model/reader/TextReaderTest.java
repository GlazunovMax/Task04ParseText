package by.epam.javawebtraining.glazunov.task04.model.reader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import by.epam.javatraining.glazunov.task04.model.exception.FileReadException;
import by.epam.javatraining.glazunov.task04.model.reader.TextReader;


public class TextReaderTest {
	
	private File file;
	
	@Rule
	public final TemporaryFolder folder = new TemporaryFolder();
	
	@Before
	public void create() {
		try {
			file = folder.newFile("file.txt");
		} catch (IOException e) {
			fail();
		}
	}
	
	@Test
	public final void testReadFile() {
		List<String> text = Arrays.asList("First text", "Second text");
		String actual = null;
		
		try {
			Files.write(Paths.get(file.getPath()), text, StandardCharsets.UTF_8);
			actual = TextReader.readFile(file.getPath());
		} catch (IOException | FileReadException e) {
			fail();
		}
		String expected = "First text\nSecond text\n";

		assertEquals(expected, actual);

	}

}
