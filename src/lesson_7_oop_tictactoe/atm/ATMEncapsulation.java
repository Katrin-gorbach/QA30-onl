package lesson_7_oop_tictactoe.atm;

public class ATMEncapsulation {

	//поля класса должны быть закрыты (privte) - первый принцип ооп (инкапсуляция)
	// с полями класса нужны работать через методы гетеры / сетеры

	//МОДИФИКАТОРЫ ДОСТУПА
	//public - доступно абсолютно всем и везде
	//private - доступно только членам класса (только внутри класса)
	//protected - пакет + наследование
	//package-private - если не указать модификатор, доступа в рамках пакета. вне пакета нельзя будет получить доступ
	private String atmCompany;
	private String atmUser;
	private String atmCardHolderName;
	private long atmCardHolderNumber;
	private long atmCardHolderDebitAccount;


	//Если создали класс без КОНСТРУКТОРА
	// программа во время компиляции создает ДЕФОЛТНЫЙ КОНСТРУКТОР БЕЗ ПАРМАТРОВ
	//Constructor: public + class name
	public ATMEncapsulation(){

	}

	public ATMEncapsulation(String name, String user, String holderName, long holderNumber, long debitAccount ){
		atmCompany = name;
		atmUser = user;
		atmCardHolderName = holderName;
		atmCardHolderDebitAccount = debitAccount;
		atmCardHolderNumber = holderNumber;

	}

	//Для работы с полями объекта используется специальны методы
	// для взятия данных геторы, для создания сеторы
	//мы не создаем гетеры для тех переменных данных которые не должны быть обработаны

	//гетеры для считывания закрытой переменной atmCardHolderNumber
	public long getAtmCardHolderNumber(){
		return atmCardHolderNumber;
	}

	public void setAtmCardHolderDebitAccount(long value){

	}

	//перегрузка методов (Method overload)
	// несколько методов с одинаковыми именами, но с разными типами передаваемых данных
	// или же кол-во передаваемых данных отличается
	public String getATMFullInformation(String name){
		return name;
	}

	public String getATMFullInformation() {
		return "ATM Company Name : " + atmCompany + "\nATM User : " + atmUser +
				"\nATM card Holder : " + atmCardHolderName + "\nATM card Number : " + atmCardHolderNumber +
				"\nATM card holder debit account : " + atmCardHolderDebitAccount;
	}

	public long getAtmCardHolderDebitAccount() {
		return atmCardHolderDebitAccount;
	}
}
