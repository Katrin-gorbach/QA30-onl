package lesson_6_objects_game;

import lesson_6_objects_game.introobjects.Bank;

public class MyMain {
	public static void main(String[] args){
withdrawMoneyFromMyBankAccount();

	}

	public static void withdrawMoneyFromMyBankAccount(){
		//любой объект создается через ключевое слово new
		//которое создает под него пространство
		//и не имеют ничего общего
		Bank bog = new Bank();
		bog.bankName = "Bank of G";
		bog.creditCardMoney = 986;
		bog.getBankInfo();

		System.out.println("Withdraw some money");
		bog.withdrawMoneyFromAccount(900);
		bog.withdrawMoneyFromAccount(199);
	}

	public static void createBasicClassInstance(){
		//Когда создается объект, мы создаем экземпляр класса
		//iBank является экземпляром класса Bank (iBank экземпляр тк один из classa Bank )
		Bank iBank = new Bank();

		iBank.getBankInfo();
		System.out.println("Bank name " );

		Bank gBank = new Bank();

	}
}
