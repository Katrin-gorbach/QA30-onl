package lesson_7_oop_tictactoe.staff;

public class Staff {
	private String name;
	private String surname;
	private String position;
	private int age;
	private int mobileNumber;

	//constructor
	public Staff(String name, String surname, String position, int age, int mobileNumber) {
		//this - адресс экземпляра класс. обратись к проперти уровень класс
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.surname = surname;
		this.position = position;
		this.age = age;

	}

	public String getFullInformation(){
		return "Name : " + name + ".\nSurname : " + surname + ".\nPosition : " + position + ".\nAge : " + age +
				".\nPhone number : " + mobileNumber + ".\naddress of this object instance: " + this + "\n";
	}

	@Override
	public String toString(){
		return "Name : " + this.name + ".\nSurname : " + this.surname + ".\nPosition : " + this.position +
				".\nAge : " + this.age + ".\nPhone number : " + this.mobileNumber ;
	}

	public void speakStaff(){
		System.out.println(this.position + " say something ");
	}
}
