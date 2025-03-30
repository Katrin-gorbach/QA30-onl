package lesson_7_oop_tictactoe;

import lesson_7_oop_tictactoe.atm.ATM;
import lesson_7_oop_tictactoe.atm.ATMEncapsulation;
import lesson_7_oop_tictactoe.staff.ITMember;
import lesson_7_oop_tictactoe.staff.Lifter;
import lesson_7_oop_tictactoe.staff.Staff;

public class MyMain {
	public static void main(String[] args){
		//playTicTacToe();  // or just    new GameTicTacToe();  without playTicTacToe() method
		//createATMUser();
		createStaff();
	}

	//JAVA все находится под супер классом Объект, следовательно все созданные нами и не только классы
	//находятся под ними и считаются ДОЧЕРНИМИ, они могут перенимать у этого супер класса его данные и действия

	//ООП во всех языках программирования особенно в Джава имеет 3 фундаментальных принципа:
	//1. Инкапсуляция - скрытие данных от разных объектов в зависимости от надобности
	//2. Наследование - выстраивается структура между объектами,
	// когда один объект является доп реализацией от другого и наследует от родителя его качества
	//3. Полиморфизм - один интерфейс, множественное реализация, те когда написан один метод, но то ,
	// что он будет делать зависит от вас - переопределение метода



	public static void createATMUser(){
		ATM archilATM = new ATM("PKO", "Liya", "Liya Horbach",
				1234_5678_9012_3456L, 123);
		System.out.println(archilATM.getATMFullInformation());

		System.out.println("*****************************************************");

		ATM kateATM = new ATM();
		System.out.println(kateATM.getATMFullInformation());

		System.out.println("*****************************************************");

		ATMEncapsulation encATM = new ATMEncapsulation();
		encATM.setAtmCardHolderDebitAccount(1788);

		System.out.println(encATM.getAtmCardHolderDebitAccount());
	}

	public static void createStaff (){
		//Staff teachStaff = new Staff("A", "S", "Lecturer", 36, 454545545);
		//System.out.println(teachStaff.getFullInformation());

		Staff [] teachMeStaff = new Staff[] {

				new ITMember("Arch", "S", "Dev", 36, 123232),
				new Lifter("Ivan", "Durak", "NA" , 34, 55245),
				new Staff("Jenya", "Onegina", "Cleaner", 41, 212323)
		};
		for (Staff member : teachMeStaff){
			System.out.println(member.getFullInformation());
			member.speakStaff();
		}

		Staff tms = new ITMember("A", "S" , "Q", 33, 4552);
		System.out.println(tms);

	}

	public static void playTicTacToe(){
		new GameTicTacToe();
	}
}
