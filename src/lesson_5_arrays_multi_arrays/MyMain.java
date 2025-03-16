package lesson_5_arrays_multi_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyMain {
	public static void main(String[] args){
		//declareCStyleArray();
		//compareArrays();
		//checkArrayEquality();
		//copyArray();
		doubleArray();


	}

	public static void doubleArray(){
		int[][] table = new int[][]{
				{1,2,3}, // [0][0], [0][1] , [0][2]
				{4,5,6,7} // [1][0] , [1][1], [1][2], [1][3]
		};
		getDoubleArray(table);
	}

	public static void getDoubleArray(int[][] table){
		for(int outer = 0; outer < table.length; outer++){ // идет по строкам
			for (int inner = 0; inner <table[outer].length; inner++) {// идет по столбцам

				System.out.print(table[outer][inner] + "\t");
			}
			System.out.println();
		}
	}

	//Array copy ARRAYS CLASS, SYSTEM
	public static void copyArray(){
		int[] nums = new int[]{1,-1,3};
		int[] newNums = new int[nums.length];
		int[]  newNums2 = new int[nums.length];


		System.arraycopy(nums,0, newNums,0, nums.length);

		for (int n : newNums){
			System.out.println(n);
		}
	}

	//Array Compare via method
	public static void checkArrayEquality(){
		int[] nums = new int[]{1,-1,3};
		int[] newNums = new int[]{1,-1,3};

		System.out.println(Arrays.equals(nums,newNums));
	}

	//Array Compare via method
	public static void compareArrays(){
		int[] nums = new int[]{1,-1,3};
		int[] newNums = new int[]{1,1,3};

		if(nums.length == newNums.length){
			for (int index = 0, counter = 0; index < nums.length; index++) {
				if (nums[index] == newNums[index]) counter++;
				if (counter == nums.length) {
						System.out.println("Equals");
					}
			}
		}

	}

	//Array Copy via method
	public static void copyArrays(){
		//System.arraycopy();
	}

	public static void declareCStyleArray(){
		// int number[] = {1,2,3,4};  -> C, C++ style
		int[] number = new int[]{1,2,4};

		for (int index=0; index<number.length; index++ ){
			System.out.printf("%d", number[index]);
		}


	}

}
