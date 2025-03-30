package lesson_7_oop_tictactoe.staff;

//наследовать можно лишь классы
//унаследовать можно только один класс. нет множественного наследования
public class Lifter extends Staff{

	//конструктор
	public Lifter(String name, String surname, String position, int age, int mobileNumber) {
		//super передает все параметры в супер класс. должно быть первым словом
		//нельзя чтобы что то до супер вызывалось
		super(name, surname, position, age, mobileNumber);
		System.out.println("Lifters were created");
	}
}
