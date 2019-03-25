package by.epam.javatraining.glazunov.task04.model.logic;

import java.util.List;

import by.epam.javatraining.glazunov.task04.model.entity.Component;


public class ChangeWord {

	public List<String> changeFirstToLastWord(Component text) {
		
		List<String> listScentence = GetScentence.get(text);

		for (String string : listScentence) {
			StringBuilder builder = new StringBuilder();
			
			String[] words = string.split(" ");

			String firstWord = words[0];
			String lastWord = words[words.length - 1];

			words[0] = lastWord;
			words[words.length - 1] = firstWord;

			for (int i = 0; i < words.length; i++) {
				builder.append(words[i]).append(" ");
			}

			listScentence.add(builder.toString());
		}
		return listScentence;
	}
}
