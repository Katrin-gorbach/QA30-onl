package Homework_8.AdditionTasks.ContractOfGoods;

import Homework_8.Document;
import java.util.Date;

public class GoodsContract implements Document {
	private int documentNumber;
	private String productType;
	private int productQuantity;
	private Date documentDate; //Класс java.util.Date. Хранит дату в миллисекундах, “Unix-время”
	//При создании объекта Date с пустым конструктором — результатом будет
	//Текущая дата и время на момент создания объекта.
	//Date date = new Date();

	//конструктор без параметров
	public GoodsContract() {}

	//конструктор с параметрами
	public GoodsContract(int documentNumber, String productType, int productQuantity, Date documentDate) {
		this.documentNumber = documentNumber;
		this.productType = productType;
		this.productQuantity = productQuantity;
		this.documentDate = documentDate;
	}

	@Override
	public String getInfo() {
		return "Контракт на поставку товаров:\nНомер: " + documentNumber + "\nТип товаров: " + productType +
				"\nКоличество: " + productQuantity + "\nДата: " + documentDate;
	}
}

