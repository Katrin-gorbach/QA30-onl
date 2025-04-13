package Homework_9;

public class NumberContainsVerification extends RuntimeException {
	public NumberContainsVerification() {
		super("Document Number doesn't contain 'abc'");
	}
}
