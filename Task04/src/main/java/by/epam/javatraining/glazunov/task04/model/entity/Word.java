package by.epam.javatraining.glazunov.task04.model.entity;

import java.util.List;

public class Word extends TextLeaf {

	public Word(String textLeaf) {
		super(textLeaf);
	}

	public void addComponent(Component component) {
		throw new UnsupportedOperationException();

	}

	public void removeComponent(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public TextType getTextType() {
		return TextType.WORD;
	}

	@Override
	public List<Component> getChildComponent() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Component getChild(int index) {
		throw new UnsupportedOperationException();
	}

	
	
	@Override
	public String toString() {
		return "Word = " + super.toString();
	}

}
