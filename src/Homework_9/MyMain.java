package Homework_9;

import Homework_9.ContractOfGoods.GoodsContract;
import Homework_9.ContractWithStaff.StaffContract;
import Homework_9.FinancialInvoice.Invoice;
import Homework_9.Document;
import java.util.Date;

public class MyMain {

	public static void main(String[] args){
		ConcreteRegister concreteRegister = new ConcreteRegister();

		GoodsContract supplyContract = new GoodsContract("55511a2b", "Овощи",
				100, new Date());
		StaffContract employeeContract = new StaffContract("5553abc", new Date(), new Date(),
				"Иван Иванов");
		Invoice financialInvoice = new Invoice(5000.0, new Date(), "abc1a2b",
				"D001");
		Invoice financialInvoiceNext = new Invoice(5000.0, new Date(), "5553abc1a2b",
				"D001");

		concreteRegister.saveDocument(supplyContract);
		concreteRegister.saveDocument(employeeContract);
		concreteRegister.saveDocument(financialInvoice);
		concreteRegister.saveDocument(financialInvoiceNext);

		concreteRegister.provideDocumentInfo(0);
		System.out.println("**********************************");
		concreteRegister.provideDocumentInfo(1);
		System.out.println("**********************************");
		concreteRegister.provideDocumentInfo(2);
		System.out.println("**********************************");
		concreteRegister.provideDocumentInfo(3);
		System.out.println("**********************************");

		validateTryCatch(supplyContract.getDocumentNumber());
		validateTryCatch(employeeContract.getDocumentNumber());
		validateTryCatch(financialInvoice.getDocumentNumber());
		validateTryCatch(financialInvoiceNext.getDocumentNumber());

	}

	public static void validateTryCatch(String documentNumber){
		try {
			checkNumber(documentNumber);
		}
		catch (NumberContainsVerification | NumberFinishVerification | NumberStartVerification e) {
			System.out.println(documentNumber + " \t Произошло исключение: " + e.getMessage());
		}

	}


// Метод для проверки числа, который выбрасывает CustomException
public static void checkNumber(String documentNumber) throws NumberContainsVerification, NumberFinishVerification,
		NumberStartVerification {
	if (!(documentNumber.contains("abc"))) {
		throw new NumberContainsVerification(); // Генерация исключения
	} if (!documentNumber.startsWith("555")) {
		throw new NumberStartVerification(); // Генерация исключения
	}
	if (!documentNumber.endsWith("1a2b")){
		throw new NumberFinishVerification();
	}
	else {
		System.out.println(documentNumber + " \t Number starts with '555' contains 'abc' and has '1a2b' in the end");
	}
}

}
