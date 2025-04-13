package Homework_8.AdditionTasks.FinancialInvoice;

import Homework_8.Document;
import java.util.Date;

public class Invoice implements Document {
	private double totalAmount;
	private Date documentDate;
	private int documentNumber;
	private String departmentCode;

	public Invoice() {}

	public Invoice(double totalAmount, Date documentDate, int documentNumber, String departmentCode) {
		this.totalAmount = totalAmount;
		this.documentDate = documentDate;
		this.documentNumber = documentNumber;
		this.departmentCode = departmentCode;
	}

	@Override
	public String getInfo() {
		return "Финансовая накладная:\nИтоговая сумма: " + totalAmount + "\nДата: " + documentDate +
				"\nНомер: " + documentNumber + "\nКод департамента: " + departmentCode;
	}
}
