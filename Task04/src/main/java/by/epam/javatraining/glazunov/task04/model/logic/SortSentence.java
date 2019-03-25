package by.epam.javatraining.glazunov.task04.model.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.javatraining.glazunov.task04.model.entity.Component;


public class SortSentence {

	public List<String> sortByLenghtScentence(Component text) {
		List<String> listScentence = GetScentence.get(text);
		
		// Sort by Ascending - по возрастанию
		Collections.sort(listScentence, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		return listScentence;

	}

}
