package Homework_7;

import Homework_7.Mobile.Phone;

public class MyMain {

	public static void main(String[] args){

	Phone mobileFirst = new Phone("+ 123-345-345", "AS-45", 45);
	Phone mobileSecond = new Phone("+ 234-456-456", "DD-678");
	Phone mobileThird = new Phone();
		System.out.println("Info for first phone: number is " + mobileFirst.getNumber() +
				" , model is " + mobileFirst.getModel() + " , weight is " + mobileFirst.getWeight());

		System.out.println("Info for second phone: number is " + mobileSecond.getNumber() +
				" , model is " + mobileSecond.getModel() + " , weight is " + mobileSecond.getWeight());

		System.out.println("Info for third phone: number is " + mobileThird.getNumber() +
				" , model is " + mobileThird.getModel() + " , weight is " + mobileThird.getWeight());

		System.out.println("**************************************************************************");


	mobileFirst.receiveCall("Olga");
	mobileSecond.receiveCall("Dima");
	mobileThird.receiveCall("Liya");

	System.out.println("**************************************************************************");

	mobileFirst.receiveCall("Olga", mobileFirst.getNumber());

	System.out.println("**************************************************************************");

	mobileFirst.sendMessage(mobileFirst.getNumber(), mobileSecond.getNumber(), mobileThird.getNumber());

	}

}
