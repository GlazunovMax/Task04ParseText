package by.epam.javatraining.glazunov.task04.model.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.javatraining.glazunov.task04.model.entity.CodeBlock;
import by.epam.javatraining.glazunov.task04.model.entity.Component;
import by.epam.javatraining.glazunov.task04.model.entity.CompositeText;
import by.epam.javatraining.glazunov.task04.model.entity.TextType;

public class ParagraphParser implements TextInfoParser {
	private static final String REGEX_PARAGRAPH = "^$";// "(\n|^).*?(?=\n|$)";
	private static final String REGEX_CODE = "";
	private TextInfoParser sentenceParser = new SentenceParser();

	public Component parse(String text) {
		Component paragraphs = new CompositeText(TextType.PARAGRAPH);

		Pattern paternParagraph = Pattern.compile(REGEX_PARAGRAPH);
		Matcher paragraphMatcher = paternParagraph.matcher(text);

		while (paragraphMatcher.find()) {
			String paragraph = paragraphMatcher.group();

			if (paragraph.matches(REGEX_CODE)) {
				paragraphs.addComponent(new CodeBlock(paragraph));
			} else {
				paragraphs.addComponent(sentenceParser.parse(paragraph.trim()));
			}
		}
		return paragraphs;
	}

}
