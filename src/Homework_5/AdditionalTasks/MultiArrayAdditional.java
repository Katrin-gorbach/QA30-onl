package Homework_5.AdditionalTasks;

import java.util.Arrays;

public class MultiArrayAdditional {
	public static void main(String[] args){
		increaseArray();
		System.out.println("************************************** " );
		getSumArray();
		System.out.println("************************************** " );
		showDiagonals();
		System.out.println("************************************** " );
		sortArray();
		System.out.println("************************************** " );
		BubbleSort();

	}


	public static void increaseArray()
	{
		//Умножение двух матриц
		//Создайте два массива целых чисел размером 3х3 (две матрицы).
		//Напишите программу для умножения двух матриц.
		//Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
		//Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
		//Ожидаемый результат: 1 2 3 1 1 1 0 0 0

		//https://habr.com/ru/companies/yandex_praktikum/articles/723510/
		int[][] A = {
				{1, 0, 0},
				{0, 1, 0},
				{0, 0, 0}
		};

		int[][] B = {
				{1, 2, 3},
				{1, 1, 1},
				{0, 0, 0}
		};

		int[][] C = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					C[i][j] += A[i][k] * B[k][j]; //числа строки первой матрицы перемножаются на соответствующие числа
					// столбца второй матрицы и получившиеся произведения складываются
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void getSumArray(){
		//Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

		int[][] B = {
				{1, 2, 3},
				{1, 1, 1},
				{0, 100, 0}
		};
		int sum = 0;

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {

					sum += B[i][j];
			}

	}
		System.out.println("Sum elements in array is: " + sum);
	}

	public static void showDiagonals() {
		//Создайте двумерный массив. Выведите на консоль диагонали массива.

		int[][] A = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		//first main diagonal
		System.out.print("Main diagonal is ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i == j) {
					System.out.print(A[i][j] + " ");
				}
			}
		}

		//second diagonal
		System.out.print("\n" + "Second diagonal is ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i][A.length-1 - i] + " ");
		}
		System.out.println();
	}

	public static void sortArray(){
		//Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.

		int[][] B = {
				{2, 3, 1},
				{1, -1, 1},
				{0, 100, 0}
		};

		System.out.print(Arrays.deepToString(B)); // Arrays.deepToString() method comes under the Arrays class in Java.
		// It is used to return a string representation of the “deep contents” of a specified array.
		// It handles multidimensional arrays by including the contents of nested arrays.
		System.out.println();
		for(int[] i : B ){
			Arrays.sort(i);
			for (int j : i) {

				System.out.print(" " + j + " | ");}
				System.out.println();

		}
	}

	public static void BubbleSort() {
		// Реализуйте алгоритм сортировки пузырьком.
		int[][] B = {
				{2, 3, 1},
				{1, -11, -100},
				{0, 100, 50}
		};
		boolean flag = false;
		int temp;

		System.out.println("Sorted multi array");

		while (!flag){
			flag = true;
		for(int outer = 0; outer < B.length ; outer ++) {
				for (int inner = 0; inner < B[outer].length -1; inner ++){
					if( B[outer][inner] > B[outer][inner+1] ) {
						temp = B[outer][inner];
						B[outer][inner] = B[outer][inner + 1];
						B[outer][inner+1] = temp;
						flag = false;
					}

				}
			}
		}

		for ( int[] i : B){
			for (int j : i){
				System.out.print( j );
				System.out.print( " " );
			}
			System.out.println();
		}
	}
}



