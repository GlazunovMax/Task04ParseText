package by.epam.javatraining.glazunov.task04.model.entity;

public abstract class TextLeaf implements Component {
	private String textLeaf;

	public TextLeaf(String textLeaf) {
		this.textLeaf = textLeaf;
	}

	@Override
	public TextType getTextType() {
		return TextType.TEXT_LEAF;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((textLeaf == null) ? 0 : textLeaf.hashCode());
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
		TextLeaf other = (TextLeaf) obj;
		if (textLeaf == null) {
			if (other.textLeaf != null)
				return false;
		} else if (!textLeaf.equals(other.textLeaf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TextLeaf[Word or Punctuation] = " + textLeaf;
	}
}
