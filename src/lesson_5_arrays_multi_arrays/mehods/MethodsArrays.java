package lesson_5_arrays_multi_arrays.mehods;

import java.util.Scanner;

public class MethodsArrays {
	public static void main(String[] args){
		//setNames();
		//getData();
		//passObject();
		//keyWordFinal();
		//passArray(12, new String[]{"Kate", "Dima"}, "Liya");
		//setTwoArraysOneAddress();

		//char[] letters = setLetters();
		//readCharArray(letters);

		//передаются переменные одного типа и потом преобразуются в массив
		// это не объявление массива
		getVarArgs("Kate" , "Rita", "Max");

	}

	// когда не знаешь размер создаваемого массива String... names
	public static void getVarArgs(String... names){
		//var-arg   ---- (String... names) -
		// нельзя использовать в начале или середине переменных, например (int... val, double name)
		// or  (char c, int... val, double name) - тк компилятор не сможет определить массив
		// переменные неопределенной длины
		//возможность передать в метод любое кол-во переменных, кк массива одного типа
		readArray(names);


	}

	//метод возвращает массив
	//возвращаемое значение не входит в сигнатуру
	// сигнатура - имя метода и передаваемые ему переменные
	public static char[] setLetters(){

		return new char[]{'g', 'r', 'w'};
	}

	// читает значения из массива  {'g', 'r', 'w'}
	public static void readCharArray(char[] letters){
		for(char let : letters)
			System.out.println(let);
	}

	//возврат массива
	public static void setTwoArraysOneAddress(){
		char[] letters = new char[] {'A', 'B', 'C'};
		char[] aliasLetters = letters;

		for (char letter : letters){
			System.out.println(letter);
		}

		System.out.println("*********");

		for (char letter : aliasLetters){
			System.out.println(letter);
		}

		letters[0] = '#';
		letters[1] = '!';
		System.out.println("*********");
		for(char letter : letters){
			System.out.println(letter);
		}

		System.out.println("*********");
		for(char letter : aliasLetters){
			System.out.println(letter);
		}

	}


	public static void passArray(int number, String[] numbers, String name){

	}

	public static void setNames(){
		// объяви анонимный экземпляр класса сканнер
		// анонимный экземпляр класса - это объект у которого нету имени
		//те он одноразова создается, выполняется и удаляется
		//к нему нельзя обратиться снова
		//int size = new Scanner(System.in).nextInt();

		String[] names = new String[getArrayLength()];

		for (int index = 0; index <names.length; index ++){

			System.out.println("Set names for array: ");
			String name = new Scanner(System.in).nextLine();
			names[index] = name;
		}
		readArray(names);


	}

	public static int getArrayLength(){

		do{
			int size;
			System.out.println("Set size of array");
			if ((size = new Scanner(System.in).nextInt()) > 0 ) return size;
		} while (true);

	}

	//передача по ссылке. передает ссылку на name в массиве
	public static void readArray(String[] names){
		System.out.println("The names are : ");
		for (String name : names) {
			System.out.printf("%s. \n", name);
		}
	}

	// передача по значение(только примитивные данные) - данные копируются
	public static void getData(){
		int num = 5;
		System.out.println(num);
		updateData(num);
		System.out.println(num);

	}

	public static void updateData(int num){
		num = 10;

	}

	//ADDRESS
	//он передает адресс но создает копию и если что-то произойдет (утечка данных) то оригинал не пострадает
	// final - для переменной значит что ее нельзя изменить, она константа
	// final для объекта / массива - нельзя изменить адрес
	public static void passObject(int nums[]){
		for (int el : nums){
			System.out.println(el);
			el = 11;
		}
	}

	public static void keyWordFinal(){
		 final int num = 10;

		 int[] nums2 = new int[]{1, 2, 3};
		 final int[] nums2Copy = nums2;

		int[] nums2CopyCopy = new int[]{6,9,10};
		// будет ошибка если
		///nums2Copy = nums2CopyCopy;

		 System.out.println(nums2 [0]);
		System.out.println(nums2Copy [0]);
	}
}
