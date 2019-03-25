package by.epam.javatraining.glazunov.task04.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Component {
	private List<Component> listLeaf;

	public Sentence() {
		listLeaf = new ArrayList<Component>();
	}

	public void addComponent(Component component) {
		listLeaf.add(component);

	}

	public void removeComponent(Component component) {
		listLeaf.add(component);
	}

	public List<Component> getChildComponent() {
		return listLeaf;
	}

	@Override
	public TextType getTextType() {
		return TextType.SENTENCE;
	}

	@Override
	public Component getChild(int index) {
		return listLeaf.get(index);
	}

	@Override
	public int size() {
		return listLeaf.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listLeaf == null) ? 0 : listLeaf.hashCode());
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
		Sentence other = (Sentence) obj;
		if (listLeaf == null) {
			if (other.listLeaf != null)
				return false;
		} else if (!listLeaf.equals(other.listLeaf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Sentences - ");

		for (Component component : listLeaf) {
			builder.append(component).append("\n");
		}

		return builder.toString();
	}

}
