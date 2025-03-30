package lesson_7_oop_tictactoe;

import java.util.Random;
import java.util.Scanner;

public class GameTicTacToe {

	//Added constructor
	public GameTicTacToe(){
		startGame();
	}


		public void startGame() {
			getInitialMSG();

			while (true) {
				if ((input().nextLine()).equalsIgnoreCase("y")) {
					char[][] table = initializeTable();
					getRules();
					System.out.println("****************************");
					System.out.println("Let's decide who makes the first move");

					int randomNumber = random().nextInt(0,101);
					//как опрделить когда х, когда о --- сделать нам!!
					if(randomNumber<=50) {
						//User, AI - тот кто делает первый шаг будет х, второй игрок о
						// создать реализацию игрока  !!!!!!
						// игрок создает значение по ряду 1-3 по столбцам 1-3
						//учесть что индексация идет с 0
						//постоянные шаги  до тех пор
						//создать счетчик который поможет отслеживать процесс
						// победа возможна только лишь после пятого шага
						// на 9 шаге игра закончится в любом случае

						//после пятого шага проверять таблице, (массив)

						//каждая формула должна быть распределена по методам
						// проверить не выиграл ли игрок по столбцам (00, 10 20)
						// по строкам 00 01 02 -- только х или у(двйной цикл)

					}

				} else {
					System.out.println("Bye!");
				}
				return;
			}
		}

		//как работать с ИИ
	public void makeAIMove(){
		//выбрать случайные числа от 0 до 2 и попытаться вложить туда значение
		// значение х/о зависит от того кто первый ходил
		//если ячейка занята продолжать рандомно искать
		// когда найдено поставить туда значение

	}

	public void makeUserMove(){
		//input via scanner
		//user enters value row 1-3
		//user enters value column 1-3
		//you must adjust it to indexes
		//1,3 = [0][2]
		//check wether [0][2] is empty
		//if it's PUT a VALUE
		//if it's busy - ask to re enter

	}

	public void checkRows(){
		char[][] letters = new char[][]{
				{'*', '0', 'X'},
				{'0', '0', '*'},
				{'X', 'X', 'X'}
		};

		int userCounter = 0;
		int aiContr = 0;

		for(int row = 0; row < 3; row++){
			for (int col = 0; col < 3; col ++){
				//if user = x
				// if ai = 0
				if (letters[row][col] == 'X'){
					userCounter++;
			} else if (letters[row][col] == '0'){
					aiContr++;
				}
				}
			if (userCounter == 3 || aiContr == 3){
				System.out.println("SOMEONE WON!!");
				break;
			}
			userCounter = 0;
			aiContr = 0;
		}
	}

	public void checkColumns(){
		// проверка по столбцам
	}

	public void checkAxes(){
		//проверка по диагоналям
	}

		public void getRules(){
		System.out.println("You decided to play the game");
		System.out.println("You have table 3*3 and you will play with AI");
		System.out.println("x-rows, y - columns. The first column in the first low equals 1,1");
		}

		public void getInitialMSG(){
			System.out.println("************");
			System.out.println("Welcome");
			System.out.println("Wold you like to play Game?");
			System.out.println("************");
		}

		public char[][] initializeTable(){
			return new char[][]{
					{'*', '*', '*'},
					{'*', '*', '*'},
					{'*', '*', '*'}
			};
		}

		public void readTable (char[][] table){
			for(char[] outer : table){
				for (char inner : outer) {
					System.out.print(inner + "\t");
				}
				System.out.println();
			}

		}

		public Scanner input(){

			return new Scanner(System.in);
		}

		public Random random(){
			return new Random();
		}
	}
