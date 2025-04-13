package Homework_9;

public class NumberFinishVerification extends RuntimeException {
	public NumberFinishVerification() {
		super("Document Number doesn't finish with '1a2b'");
	}
}
