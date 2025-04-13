package Homework_8.AdditionTasks;

import Homework_8.AdditionTasks.ContractOfGoods.GoodsContract;
import Homework_8.AdditionTasks.ContractWithStaff.StaffContract;
import Homework_8.AdditionTasks.FinancialInvoice.Invoice;


import java.util.Date;

public class MyMain {
	public static void main(String[] args){
		ConcreteRegister concreteRegister = new ConcreteRegister();

		GoodsContract supplyContract = new GoodsContract(1, "Овощи", 100, new Date());
		StaffContract employeeContract = new StaffContract(2, new Date(), new Date(), "Иван Иванов");
		Invoice financialInvoice = new Invoice(5000.0, new Date(), 3, "D001");

		concreteRegister.saveDocument(supplyContract);
		concreteRegister.saveDocument(employeeContract);
		concreteRegister.saveDocument(financialInvoice);

		concreteRegister.provideDocumentInfo(0);
		System.out.println("**********************************");
		concreteRegister.provideDocumentInfo(1);
		System.out.println("**********************************");
		concreteRegister.provideDocumentInfo(2);


	}



}
