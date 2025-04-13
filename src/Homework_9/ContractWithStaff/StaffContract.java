package Homework_9.ContractWithStaff;

import Homework_9.Document;
import java.util.Date;

public class StaffContract implements Document {
	private String documentNumber;
	private Date documentDate;
	private Date endDate;
	private String employeeName;

	public StaffContract() {}

	public StaffContract(String documentNumber, Date documentDate, Date endDate, String employeeName) {
		this.documentNumber = documentNumber;
		this.documentDate = documentDate;
		this.endDate = endDate;
		this.employeeName = employeeName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	@Override
	public String getInfo() {
		return "Контракт с сотрудником:\nНомер: " + documentNumber + "\nДата: " + documentDate +
				"\nДата окончания: " + endDate + "\nИмя сотрудника: " + employeeName;
	}
}
