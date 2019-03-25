package by.epam.javatraining.glazunov.task04.model.entity;

import java.util.List;

public class CodeBlock implements Component {
	private String codeBlock;

	public CodeBlock(String codeBlock) {
		this.codeBlock = codeBlock;
	}

	public String getCodeBlock() {
		return codeBlock;
	}

	public void setCodeBlock(String codeBlock) {
		this.codeBlock = codeBlock;
	}

	@Override
	public TextType getTextType() {
		return TextType.CODE_BLOCK;
	}

	@Override
	public void addComponent(Component component) {
		throw new UnsupportedOperationException();

	}

	@Override
	public void removeComponent(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Component> getChildComponent() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Component getChild(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		throw new UnsupportedOperationException();
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeBlock == null) ? 0 : codeBlock.hashCode());
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
		CodeBlock other = (CodeBlock) obj;
		if (codeBlock == null) {
			if (other.codeBlock != null)
				return false;
		} else if (!codeBlock.equals(other.codeBlock))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("CodeBlock - ");

		builder.append(codeBlock).append("\n");

		return builder.toString();
	}

}
