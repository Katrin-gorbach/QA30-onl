package Homework_4.AdditionalTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayAdditional {
	public static void main(String[] args){
		generateRandomArray();
		System.out.println("***************************");
		replaceArray();
		System.out.println("***************************");
		sortNames();
		System.out.println("\n" + "*****************************");
		BubbleSort();
	}

	public static void generateRandomArray(){
		//Создайте массив из n случайных целых чисел и выведите его на экран.
		//Размер массива пусть задается с консоли и размер массива может быть
		//больше 5 и меньше или равно 10
		//Если n не удовлетворяет условию - выведите сообщение об этом.
		//Если пользователь ввёл не подходящее число, то программа должна
		//просить пользователя повторить ввод.
		//Создайте второй массив только из чётных элементов первого массива,
		//если они там есть, и вывести его на экран.

		int size;
		do{
			System.out.println("Set size of Array");
			size = input().nextInt();

			if (!(size>5 && size<=10)) System.out.println("Size should be (5;10]");

		} while (!(size>5 && size<=10));

		int [] array = new int [size];
		Random random = new Random();

		for (int i = 0; i < size; i++){
			array[i] = random.nextInt(100); // генерация псевдо рандомных значений. случайное число от 0 до 99
			System.out.print(array[i] + "\t");
		}

		// считаем сколько четных элементов в массиве
		int count = 0;
		for (int num : array) {
			if (num % 2 == 0) count++;
		}
		System.out.println( );

		//создаем новый массив только с четными значениями
		int[] newArray = new int[count];
		int index = 0;
		for (int num : array){
			if ( num % 2 == 0){
				newArray[index++] = num;
			}
		}
		System.out.println("New array is " + Arrays.toString(newArray));
	}

	public static void replaceArray(){
		//Создайте массив и заполните массив.
		//Выведите массив на экран в строку.
		//Замените каждый элемент с нечётным индексом на ноль.
		//Снова выведете массив на экран на отдельной строке.

		String[] array = new String[] {"Kate", "Dima", "Liya", "Toma"};
		System.out.println("Old array is " + Arrays.toString(array));
		for(int i = 1; i< array.length; i+=2){
			array[i] = "0";
		}
		System.out.println("New array is " + Arrays.toString(array));

	}

	public static void sortNames(){
		//Создайте массив строк. Заполните его произвольными именами людей.
		//Отсортируйте массив.
		//Результат выведите на консоль.

		String[] array = new String[]{"Kate", "Dima", "Liya", "Toma", "Olga", "Maks"};
		System.out.println("Old array");
		for (String name : array) {
			System.out.print(name + " ");
		}

		// встроенный метод Arrays.sort().
		// Этот метод принимает массив в качестве аргумента и сортирует его по возрастанию.
		Arrays.sort(array);

		System.out.println( "\n" + "Sorted array");
		for (String name : array) {
			System.out.print(name + " ");
		}
	}

	public static void BubbleSort() {
		// Реализуйте алгоритм сортировки пузырьком.
		int[] numbers = {3, 5, 1, 4, 2};

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[j + 1] = temp;
					}
				}
			}

			for (int number : numbers) {
				System.out.print(number + " ");
			}
		}



	public static Scanner input(){
		return new Scanner(System.in);
	}
}
