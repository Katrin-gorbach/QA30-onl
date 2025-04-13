package Homework_9;

import Homework_9.Document;

public abstract class Register {

	//protected - доступен внутри пакета и для наследников класса
	protected Document[] documents = new Document[10];
	protected int index = 0;

	public void saveDocument(Document document) {
		if (index < documents.length) {
			documents[index] = document;
			index++;
		} else {
			System.out.println("Регистр заполнен!");
		}
	}

	// Абстрактный метод для предоставления информации о документе
	public abstract void provideDocumentInfo(int documentIndex);


}
