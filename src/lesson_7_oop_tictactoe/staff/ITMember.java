package lesson_7_oop_tictactoe.staff;

public class ITMember extends Staff{
	public ITMember(String name, String surname, String position, int age, int mobileNumber) {
		super(name, surname, position, age, mobileNumber);
		System.out.println("ITs were created");
	}

	//полиморфизм - способность дочерних объектов переопрделять поведение методов,
	// которые они получили от родительского класса
	// Этот объект получил автоматом получил метод от родителя getFullInformation
	//чтобы поменять метод для текущего экземпляра класса необходимо
	@Override
	public String getFullInformation(){
		return "IT has own getFullInformation";
	}

@Override
public void speakStaff(){
	System.out.println("ITs say something ");
}


	public void sayHello(){
		//только для айти
	}
}
