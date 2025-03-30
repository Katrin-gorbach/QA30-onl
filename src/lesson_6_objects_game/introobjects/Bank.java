package lesson_6_objects_game.introobjects;


//не называем классы объектами
//называем их ЭКЗЕМПЛЯРАМИ (instance)
public class Bank {
	//Поля класса - переменная уровня класса, доступная всем внутренностям этого же класса
	//на уровне класса компилятор самостоятельно здаст значения всем базовым базовым типам и том числе String
	public String bankName; // null
	String bankAddress;
	public long creditCardMoney;
	int staffAmount; // 0
	long creditsGiven; // 0L

	public void withdrawMoneyFromAccount(long value){
		if(value > creditCardMoney){
			System.out.println("You don't have enough money. Your balance is " + creditCardMoney);
		} else{
			creditCardMoney -= value;
			System.out.println("You have withdraw this amount of money: " + value +
					" . Your balance is : " + creditCardMoney  );
		}

	}

	public void getBankInfo(){
		System.out.println("Bank name is: " + bankName);
		System.out.println("Bank address is : " + bankAddress);
		System.out.println("Bank has the following amount of money: " + creditCardMoney);
	}




}
