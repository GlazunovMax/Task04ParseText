package by.epam.javatraining.glazunov.task04.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Component {

	private List<Component> listSentences;// protected

	public Paragraph() {
		listSentences = new ArrayList<Component>();
	}

	public void addComponent(Component component) {
		listSentences.add(component);

	}

	public void removeComponent(Component component) {
		listSentences.add(component);

	}

	public List<Component> getChildComponent() {
		return listSentences;
	}

	@Override
	public TextType getTextType() {
		return TextType.PARAGRAPH;
	}

	@Override
	public Component getChild(int index) {
		return listSentences.get(index);
	}

	@Override
	public int size() {
		return listSentences.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listSentences == null) ? 0 : listSentences.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paragraph other = (Paragraph) obj;
		if (listSentences == null) {
			if (other.listSentences != null)
				return false;
		} else if (!listSentences.equals(other.listSentences))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Paragraph - ");

		for (Component sentence : listSentences) {
			builder.append(sentence).append("\n");
		}

		return builder.toString();
	}

}