package Homework_6.Bank;

import java.util.Scanner;

public class CreditCard {
	private long atmNumberAccount;
	private long atmCurrentSum;


	//Constructor
	public CreditCard(long atmNumberAccount, long atmCurrentSum){
		this.atmCurrentSum = atmCurrentSum;
		this.atmNumberAccount = atmNumberAccount;
	}

	public long withdrawMoneyFromAccount(){
		System.out.println(atmNumberAccount + " has following balance: " + atmCurrentSum + " PLN ");
		System.out.println("Do you want to withdraw any cash ?" );
		System.out.println("Click 'y' - YES, 'n' - NO " );
		String answer = input().nextLine();
		if( answer.equalsIgnoreCase("n")){
			System.out.println("BYE!" );
		} else if (answer.equalsIgnoreCase("y")) {
			System.out.println("Enter the amount you want to withdraw " );
			long value = input().nextLong();
			if(value > atmCurrentSum){
				System.out.println("You don't have enough money. Your balance is " + atmCurrentSum + " PLN");
			} else{
				atmCurrentSum -= value;
				System.out.println("You withdrew " + value + " PLN " +
						" . Your balance is : " + atmCurrentSum + " PLN");
			}
		} else {
			System.out.println("You click incorrect value. Run program again" );
		}

		return atmCurrentSum;
	}

	public long putMoneyToAccount(){
		System.out.println(atmNumberAccount + " has following balance: " + atmCurrentSum + " PLN ");
		System.out.println("Do you want to put any cash ?" );
		System.out.println("Click 'y' - YES, 'n' - NO " );
		String answer = input().nextLine();
		if( answer.equalsIgnoreCase("n")){
			System.out.println("BYE!" );
		} else if (answer.equalsIgnoreCase("y")) {
			System.out.println("Enter the amount you want to put " );
			long value = input().nextLong();
				atmCurrentSum += value;
				System.out.println("You put " + value + " PLN " +
						" . Your balance is : " + atmCurrentSum + " PLN");
		} else {
			System.out.println("You click incorrect value. Run program again" );
		}
		return atmCurrentSum;
	}

	public void getBankInformation(){
		System.out.println(atmNumberAccount + " has the following amount of money: " + atmCurrentSum);
	}

	public Scanner input(){
		return new Scanner(System.in);
	}
}
