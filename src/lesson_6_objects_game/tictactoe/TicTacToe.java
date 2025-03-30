package lesson_6_objects_game.tictactoe;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		startGame();
	}


	public static void startGame() {
		getInitialMSG();

		while (true) {
			if ((input().nextLine()).equalsIgnoreCase("y")) {
				char[][] table = initializeTable();
				readTable(table);

			} else {
				System.out.println("Bye!");
			}
			return;
		}
	}

	public static void getInitialMSG(){
		System.out.println("************");
		System.out.println("Welcome");
		System.out.println("Wold you like to play Game?");
		System.out.println("************");
	}

	public static char[][] initializeTable(){
		return new char[][]{
				{'*', '*', '*'},
				{'*', '*', '*'},
				{'*', '*', '*'}
		};
	}

	public static void readTable (char[][] table){
		for(char[] outer : table){
			for (char inner : outer) {
				System.out.print(inner + "\t");
			}
			System.out.println();
		}

	}

	public static Scanner input(){

		return new Scanner(System.in);
	}
}
