package by.epam.javatraining.glazunov.task04.model.logic;

import by.epam.javatraining.glazunov.task04.model.entity.Component;

public class AssembleText {
	private static final char TABULATION_CHAR = '\t';

	public String assembleText(Component text) {
		StringBuilder builder = new StringBuilder();

		for (int paragraph = 0; paragraph < text.size(); paragraph++) {
			builder.append(TABULATION_CHAR);
			for (Component sentence : text.getChild(paragraph).getChildComponent()) {
				for (Component leafs : sentence.getChildComponent()) {
					builder.append(leafs);
				}
				builder.append(' ');
			}
			builder.append('\n');
		}

		return builder.toString();
	}

}
