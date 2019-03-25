package by.epam.javatraining.glazunov.task04.model.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.javatraining.glazunov.task04.model.entity.Component;
import by.epam.javatraining.glazunov.task04.model.entity.CompositeText;
import by.epam.javatraining.glazunov.task04.model.entity.TextType;

public class SentenceParser implements TextInfoParser {
	private static final String REGEX_SENTENCE = "";// "[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)";
	private TextInfoParser leafParser = new LeafParser();

	public Component parse(String text) {
		Component sentances = new CompositeText(TextType.SENTENCE);

		Pattern patern = Pattern.compile(REGEX_SENTENCE);
		Matcher sentanceMatcher = patern.matcher(text);

		while (sentanceMatcher.find()) {
			String sentance = sentanceMatcher.group();
			sentances.addComponent(leafParser.parse(sentance));
		}

		return sentances;
	}

}
