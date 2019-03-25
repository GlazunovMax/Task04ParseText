package by.epam.javatraining.glazunov.task04.model.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.javatraining.glazunov.task04.model.entity.Component;
import by.epam.javatraining.glazunov.task04.model.entity.TextType;

public class GetScentence {
	public static List<String> get(Component text) {
		List<String> listScentence = new ArrayList<>();

		for (int paragraph = 0; paragraph < text.size(); paragraph++) {

			if (text.getChild(paragraph).getTextType().equals(TextType.PARAGRAPH)) {

				for (Component scentence : text.getChild(paragraph).getChildComponent()) {
					listScentence.add(scentence.toString());
				}

			}

		}
		return listScentence;
	}

}
