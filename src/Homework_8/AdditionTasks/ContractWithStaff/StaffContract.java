package Homework_8.AdditionTasks.ContractWithStaff;

import Homework_8.Document;

import java.util.Date;

public class StaffContract implements Document {
	private int documentNumber;
	private Date documentDate;
	private Date endDate;
	private String employeeName;

	public StaffContract() {}

	public StaffContract(int documentNumber, Date documentDate, Date endDate, String employeeName) {
		this.documentNumber = documentNumber;
		this.documentDate = documentDate;
		this.endDate = endDate;
		this.employeeName = employeeName;
	}

	@Override
	public String getInfo() {
		return "Контракт с сотрудником:\nНомер: " + documentNumber + "\nДата: " + documentDate +
				"\nДата окончания: " + endDate + "\nИмя сотрудника: " + employeeName;
	}
}
