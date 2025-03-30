package Homework_4;

import java.util.Scanner;

public class Homework_together {
	public  static void main(String[] args){
		checkNumberInArray();

	}

	public static void checkNumberInArray(){
		//Создать одномерный массив
		//Заполнить его определенными числами
		//Использовать класс Сканнер и попросить у пользователя ввести любое число
		//Проверить есть ли это число в массиве и уже вывести массив без этого числа
		//Создать новый массив

		int[] initialValues = new int[5];

		for (int index = 0; index < initialValues.length; index ++) {
			System.out.print("ENter " + initialValues.length + " values in array. " +
					"initialValues [ " + (index + 1) + " ]:");
			initialValues[index] = input().nextInt();
		}

		// отсировать массив по возрастанию
		// использовать вложенный класс Arrays  бинарный поиск (работает только в сортированных массивах)

		System.out.print("Enter an integer number to guess whether such value exist in exists array ");
		int value = input().nextInt();
		int counter = 0;

		for (int index = 0; index < initialValues.length; index ++){
			if (initialValues[index] == value){
				counter++;
			}
		}

		if (counter == 0){
			System.out.println( "You didn't guess");
			showIntArray(initialValues);
		} else  {
			if (counter < initialValues.length){
			int[] newArray = new int[initialValues.length - counter];

			for (int index = 0, newIndex = 0; index < initialValues.length; index ++){
				if (initialValues[index] !=value){
					newArray[newIndex] = initialValues [index];
					newIndex++;
				}
			}
			showIntArray(newArray);

		}
			else {
				System.out.println( "All values were deleted from array");
			}
		}

	}

	public static void showIntArray(int[] initialValue){
		System.out.print("The array contains following values: ");
		for(int value : initialValue){
			System.out.print(value + " ");
		}
	}

	public static Scanner input(){
		return new Scanner(System.in);
	}
}
