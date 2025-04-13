package Homework_7.Mobile;

public class Phone {
	private String number;
	private String model;
	private int weight;

	public int getWeight() {
		return weight;
	}

	public String getNumber() {
		return number;
	}

	public String getModel() {
		return model;
	}

	public Phone(String number, String model, int weight){
		this(number,model); // Вызов конструктора с двумя параметрами
		this.weight = weight;
	}

	public Phone(String number, String model){
		this.number = number;
		this.model = model;
	}

	public Phone(){
	}

	public void receiveCall (String name){
		System.out.println("Звонит " + name + ". " + number );
	}

	public void receiveCall (String name, String number){
		System.out.println("Звонит в снова " + name + ". " + number );
	}


	public void sendMessage(String... phoneNumbers) {
		System.out.println("Сообщение будет отправлено на следующие номера:");
		for (String phoneNumber : phoneNumbers) {
			System.out.println(phoneNumber);
		}
	}

}