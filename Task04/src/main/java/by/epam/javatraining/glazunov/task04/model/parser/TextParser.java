package by.epam.javatraining.glazunov.task04.model.parser;

import by.epam.javatraining.glazunov.task04.model.entity.Component;

public class TextParser implements TextInfoParser{

	TextInfoParser paragraphParser = new ParagraphParser();
	
	//@Override
	public Component parse(String text) {
		return paragraphParser.parse(text);
	}

}
