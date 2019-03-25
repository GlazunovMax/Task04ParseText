package by.epam.javatraining.glazunov.task04.model.logic;

import java.util.List;

import by.epam.javatraining.glazunov.task04.model.entity.Component;


public class ReverseScentence {
	
	public List<String> reverse(Component text){
		
		List<String> listScentence = GetScentence.get(text);
		
		for (String string : listScentence) {
			String[] words = new StringBuilder(string).reverse().toString().split(" ");
			
			StringBuilder newString = new StringBuilder();
			for (int i = words.length - 1; i >= 0; i--) {
				newString.append(words[i]).append(" ");
			}
			
			listScentence.add(newString.toString());
		}
		
		return listScentence;
	}

}
