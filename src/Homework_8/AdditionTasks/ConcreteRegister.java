package Homework_8.AdditionTasks;
import Homework_8.Document;

public class ConcreteRegister extends Register{
	@Override
	public void provideDocumentInfo(int documentIndex) {
		if (documentIndex >= 0 && documentIndex < index) {
			System.out.println(documents[documentIndex].getInfo());
		} else {
			System.out.println("Документ не найден!");
		}
	}
}
