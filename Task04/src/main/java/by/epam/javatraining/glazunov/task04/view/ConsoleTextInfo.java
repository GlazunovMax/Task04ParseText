package by.epam.javatraining.glazunov.task04.view;

public class ConsoleTextInfo implements TextInfo {

	@Override
	public void print(Object msg) {
		System.out.println(msg);
	}
}
