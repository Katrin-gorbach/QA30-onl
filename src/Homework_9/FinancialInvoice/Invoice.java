package Homework_9.FinancialInvoice;

import Homework_9.Document;
import java.util.Date;

public class Invoice implements Document {
	private double totalAmount;
	private Date documentDate;
	private String documentNumber;
	private String departmentCode;

	public Invoice() {}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public Invoice(double totalAmount, Date documentDate, String documentNumber, String departmentCode) {
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
