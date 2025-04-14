package Homework_10;

import java.util.Scanner;

import static Homework_10.DocumentNumber.*;

public class MyMain {
	public static void main(String[] args){

		String x = String.valueOf(checkInputNumber());
		String y = checkInputSymbol();
		String newString = x + x + x + x + "-" + y + y + y + "-" + x + x + x + x + "-" + y + y + y +
				"-" + x + y + x + y ;
		System.out.println("Original Document Number is : " + newString);
		getFourNumbers(newString);
		replaceSymbols(newString);

		getOnlySymbols(newString);
		//getOnlySymbolsEasy(y);

		checkContainsSymbols(newString);
		checkStartNumber(newString);
		checkEndNumber(newString);


	}

	public static Scanner inputData(){
		return new Scanner(System.in);
	}

	public static int checkInputNumber(){
		int x;
		do{
			System.out.println("Enter x value, where x - positive integer:  ");
			x = inputData().nextInt();
		}
				while (!(x < 10 && x > 0));
				return x;

	}

	public static String checkInputSymbol(){
		String y;
		do{
			System.out.println("Enter y value, where y - letter:  ");
			y = inputData().nextLine();
		}
		while (!(y.length() == 1 && Character.isLetter(y.charAt(0))));
		return y;

	}
}
