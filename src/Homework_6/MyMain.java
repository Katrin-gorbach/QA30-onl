package Homework_6;

import Homework_6.Bank.CreditCard;

public class MyMain {
	public static void main(String[] args){
		//три объекта класса CreditCard у которых заданы номер счета и начальная сумма
		CreditCard firstAccaunt = new CreditCard(1234_1234_1234_1234L, 456L);
		CreditCard secondAccaunt = new CreditCard(2345_4567_6785_0001L, 8673L);
		CreditCard thirdAccaunt = new CreditCard(5674_7854_6785_8001L, 5673L);

		firstAccaunt.putMoneyToAccount();
		System.out.println("********************************");
		secondAccaunt.putMoneyToAccount();
		//firstAccaunt.withdrawMoneyFromAccount();
		//System.out.println("********************************");
		//secondAccaunt.withdrawMoneyFromAccount();
		//System.out.println("********************************");
		thirdAccaunt.withdrawMoneyFromAccount();
		System.out.println("********************************");
		firstAccaunt.getBankInformation();
		System.out.println("********************************");
		secondAccaunt.getBankInformation();
		System.out.println("********************************");
		thirdAccaunt.getBankInformation();

	}
}
