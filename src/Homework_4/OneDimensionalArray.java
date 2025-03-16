package Homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {
	public static void main(String[] args) {
		getMSG();
		System.out.println("***************");
		createNewArray();
		System.out.println("***************");
		generateRandomArray();
		System.out.println("***************");
		createTwoArrays();

	}

	public static void getMSG() {
		//Создайте массив целых чисел. Напишете программу, которая выводит
		//сообщение о том, входит ли заданное число в массив или нет.
		//Пусть число для поиска задается с консоли (класс Scanner).
		int array[] = new int[]{1, 3, 4, 5};

		System.out.println("Guess value from array");
		int value = input().nextInt();

		if(checkValueInArray(array, value)){
			System.out.println(value + " belongs to the array. You are win");
		} else{
			System.out.println(" There is no such number. You've lost");}

	}

	public static boolean checkValueInArray(int[] array, int value) {
		for (int num : array) {
			if (num == value) {
				return true;
			}
		}
		return false;
	}

	public static void createNewArray(){
		//Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
		//Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
		//В результате должен быть новый массив без указанного числа.

		int array[] = new int[]{1, 3, 4, 5};

		System.out.println("Delete value from array");
		int value = input().nextInt();

		// считаем сколько элементов не совпало с value
		int count = 0;
		for (int num : array) {
			if (num != value) count++;
			}

		//создаем новый массив без value
		int[] newArray = new int[count];
		int index = 0;
		for (int num : array){
			if ( num != value){
				newArray[index++] = num;
			}
		}

		if(checkValueInArray(array, value)) {
		}
		else{
			System.out.println(" There is no such number.");}
		//Arrays.toString() returns a string with the content of the input array
		System.out.println("New array is " + Arrays.toString(newArray));

		}


	public static void generateRandomArray(){
		//Создайте и заполните массив случайным числами и
		// выведете максимальное, минимальное и среднее значение.
		//Для генерации случайного числа используйте метод Math.random().
		//Пусть будет возможность создавать массив произвольного размера.
		//Пусть размер массива вводится с консоли.
		System.out.println("Set size of array");
		int size = input().nextInt();  // задаем размер будущего массива

		double[] array = new double[size]; // Инициализация массива

		for (int i = 0; i < size; i++){
			array[i] = Math.random(); // генерация псевдо рандомных значений
			System.out.println(array[i]);
		}

		double avg;
		double sum = 0;

		double min = array[0]; // предполагаем что первое значение из массива мин
		double max = array[0]; // предполагаем что первое значение из массива макс

		for (double num : array){
			if (num < min){ min = num; }  //проходимся по массиву, текущее число меньше из массива заданного, то перез
			if (num > max){ max = num;}
			sum+=num; // высчитываем сумму

		}
		avg = (double) sum /size ;
		System.out.println("AVG is " + avg);
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);

	}


	public static void createTwoArrays(){
		//Создайте 2 массива из 5 чисел.
		//Выведите массивы на консоль в двух отдельных строках.
		//Посчитайте среднее арифметическое элементов каждого массива и
		//сообщите, для какого из массивов это значение оказалось больше (либо
		//сообщите, что их средние арифметические равны).

		int[] arrayFirst = new int[]{600,2,3,4,5};
		int[] arraySecond = new int[]{60,2,3,4,5};
		System.out.println("AVG for first Array is " + calculateAvg(arrayFirst));
		System.out.println("AVG for first Array is " + calculateAvg(arraySecond));

		if (calculateAvg(arrayFirst) > calculateAvg(arraySecond)){
			System.out.println("AVG of first Array > AVG of second Array");}
		else
			if (calculateAvg(arrayFirst) < calculateAvg(arraySecond)){
			System.out.println("AVG of first Array < AVG of second Array");}
			else {
			System.out.println("AVG of first Array = AVG of second Array"); }
		}


	public static int calculateAvg(int[] array){
		int avg;
		int sum = 0;

		for (int num : array){
			sum+=num; // высчитываем сумму
		}

		int size = array.length;
		avg = (int) sum /size;
		return avg;
	}

	public static Scanner input(){
		return new Scanner(System.in);
	}
}
