package by.epam.javatraining.glazunov.task04.model.entity;

import java.util.List;

public class PunctuationMark extends TextLeaf {

	public PunctuationMark(String textLeaf) {
		super(textLeaf);
	}

	@Override
	public TextType getTextType() {
		return TextType.PUNCTUATION_MARK;
	}

	public void addComponent(Component component) {
		throw new UnsupportedOperationException();
	}

	public void removeComponent(Component component) {
		throw new UnsupportedOperationException();
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
		return "PunctuationMark = " + super.toString();
	}

}
