package by.epam.javatraining.glazunov.task04.model.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.javatraining.glazunov.task04.model.entity.Component;
import by.epam.javatraining.glazunov.task04.model.entity.CompositeText;
import by.epam.javatraining.glazunov.task04.model.entity.PunctuationMark;
import by.epam.javatraining.glazunov.task04.model.entity.TextType;
import by.epam.javatraining.glazunov.task04.model.entity.Word;

public class LeafParser implements TextInfoParser {

	private static final String REGEX_WORD = "\\w+";
	private static final String REGEX_PUNCTUATION_MARK = "\\p{Punct}+(\\p{Blank}+|$)";

	public Component parse(String text) {
		Component textLeafs = new CompositeText(TextType.TEXT_LEAF);

		Pattern wordpatern = Pattern.compile(REGEX_WORD);
		Matcher wordMatcher = wordpatern.matcher(text);

		Pattern punctuationMarkpatern = Pattern.compile(REGEX_PUNCTUATION_MARK);
		Matcher punctuationMarkMatcher = punctuationMarkpatern.matcher(text);

		if (wordMatcher.find()) {
			String word = wordMatcher.group();
			textLeafs.addComponent(new Word(word));
		}

		if (punctuationMarkMatcher.find()) {
			String punctuationMark = punctuationMarkMatcher.group();
			textLeafs.addComponent(new PunctuationMark(punctuationMark));
		}

		return textLeafs;
	}

}
