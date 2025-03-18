package Homework_5;

import java.util.Scanner;

public class MultiArrays {
	public static void main(String[] args){
		getThreeDimensionalArray();
		System.out.println("******************");
		createChess();
	}

	public static int [][][] createThreeDimensionalArray(){
		int [][][] cube = new int [][][] {
				{
						{1, 2, 3},
						{5, 6}
				},
				{
						{10, 0, 456}
				}
		};
		return cube;
	}

	public static void getThreeDimensionalArray(){
		//Создать трехмерный массив из целых чисел.
		//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
		// Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.


		int[][][] mas = createThreeDimensionalArray();
		System.out.println("Set value to increase the array");
		int num = input().nextInt();

		for (int outer = 0; outer < mas.length; outer++ )
			for (int inner = 0; inner < mas[outer].length; inner++) {
				for (int deep = 0; deep < mas[outer][inner].length; deep++){
					System.out.print(mas[outer][inner][deep]*num + " ");
				}
				System.out.println();
			}

	}

	public static void createChess(){
		//Шахматная доска
		//Создать программу для раскраски шахматной доски с помощью цикла.
		//Создать двумерный массив String'ов 8х8.  С помощью циклов задать элементам
		//циклам значения B(Black) или W(White).

		//задаём шахматную доску двумерным массивом
		String [][] chessBoard = new String[8][8];
		for (int i = 0; i< chessBoard.length; i++) {
			for (int j = 0; j < chessBoard[i].length; j++) {
				if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
				else chessBoard[i][j] = "B";
				System.out.print(chessBoard[i][j] + "\t");
			}
			System.out.print( "\n");

		}
	}

	public static Scanner input(){
		return new Scanner(System.in);
	}
}
