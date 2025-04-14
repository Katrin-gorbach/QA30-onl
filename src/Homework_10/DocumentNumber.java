package Homework_10;

public class DocumentNumber {

	public static void getFourNumbers(String str){
		// Вывести два первых блока по 4 цифры
		String firstTwoBlocks = str.substring(0, 4) + "-" + str.substring(9, 13);
		System.out.println("Two first blocks : " + firstTwoBlocks);

	}

	public static void replaceSymbols(String str){
		// Заменить блоки из трех букв на ***
		String maskedDocument = str.replaceAll("[A-Z]{3}".toLowerCase(), "***");
		System.out.println("Replaced Document Number : " + maskedDocument);

	}

	public static void getOnlySymbolsEasy(String y){

		StringBuilder sb = new StringBuilder();
		System.out.print("Letters:");
		System.out.println(sb.append(y).append(y).append(y).append("/").append(y).append(y).append(y)
				.append("/").append(y).append("/").append(y).toString().toUpperCase());

	}


	public static void getOnlySymbols(String str){
		// Использование StringBuilder для извлечения букв и их форматирования
		StringBuilder sb = new StringBuilder();
		sb.append("Letters:"); // Добавляем начальный текст

		// Извлекаем буквы из строки и форматируем
		// Убираем цифры и "-" и приводим к верхнему регистру
		//replaceAll("\\d|-", ""): Ищет либо цифры (\\d), либо дефисы (-) в строке.
		// \\d:  Это специальное регулярное выражение, которое означает "любая цифра".
		//	Эквивалентно [0-9], то есть символам от 0 до 9.
		String lettersOnly = str.replaceAll("\\d|-", "").toUpperCase();


		//Удобен для построения строки благодаря возможности многократно добавлять части через append().
		//Каждая часть букв добавляется отдельно с использованием substring().
		sb.append(lettersOnly.substring(0, 3)).append("/"); // Первый блок yyy начиная с символа на индексе
		// 0 (включительно) и заканчивая индексом 3 (не включительно).
		sb.append(lettersOnly.substring(3, 6)).append("/"); // Второй блок yyy
		sb.append(lettersOnly.substring(6, 7)).append("/"); // Третий блок y
		sb.append(lettersOnly.substring(7, 8));            // Четвертый блок y

		// Вывод результата
		System.out.println(sb.toString());
	}

	public static void checkContainsSymbols(String str){
		if(str.toLowerCase().contains("abc")){
			System.out.println("Document Number contains 'abs' ");
		} else {
			System.out.println("Document Number doesn't contain 'abs' ");
		}
	}


	public static void checkStartNumber(String str){
		if(str.startsWith("555")){
			System.out.println("Document Number starts with '555' ");
		} else {
			System.out.println("Document Number doesn't start with '555' ");
		}
	}

	public static void checkEndNumber(String str){
		if(str.endsWith("1a2b")){
			System.out.println("Document Number ends with '1a2b' ");
		} else {
			System.out.println("Document Number doesn't end with '1a2b' ");
		}
	}




}
