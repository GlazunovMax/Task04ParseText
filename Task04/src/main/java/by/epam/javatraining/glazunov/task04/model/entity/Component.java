package by.epam.javatraining.glazunov.task04.model.entity;

import java.util.List;

public interface Component {
	void addComponent(Component component);

	void removeComponent(Component component);

	List<Component> getChildComponent();

	int size();

	TextType getTextType();

	Component getChild(int index);
}
