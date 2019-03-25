package by.epam.javatraining.glazunov.task04.model.entity;

import java.util.ArrayList;
import java.util.List;

public class CompositeText implements Component {
	private List<Component> components = new ArrayList<Component>();	
	private TextType textType;
	
	public CompositeText() {
	}
	
	public CompositeText(TextType textType) {
		this.textType = textType;
	}

	public void addComponent(Component component) {
		components.add(component);
	}

	public void removeComponent(Component component) {
		components.remove(component);
	}
	
	@Override
	public TextType getTextType() {
		return textType;
	}
	
	@Override
	public List<Component> getChildComponent() {
		return components;
	}

	@Override
	public int size() {
		return components.size();
	}

	@Override
	public Component getChild(int index) {
		return components.get(index);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((components == null) ? 0 : components.hashCode());
		result = prime * result + ((textType == null) ? 0 : textType.hashCode());
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
		CompositeText other = (CompositeText) obj;
		if (components == null) {
			if (other.components != null)
				return false;
		} else if (!components.equals(other.components))
			return false;
		if (textType != other.textType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompositeText [components=" + components + ", textType=" + textType + "]";
	}

	
	
	

	

}
