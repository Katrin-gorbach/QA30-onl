package lesson_8_abstract_interfaces_composition.inher;

//наследование - это отношение ЯВЛЯЕТСЯ
//волк является животным

public class Animal {
	private String animalName;
	private String animalType;
	private String animalColor;
	private double animalWeight;
	private String animalSex;
	private int animalAge;


	public Animal(String animalName, String animalType, String animalColor, double animalWeight, String animalSex, int animalAge) {
		this.animalName = animalName;
		this.animalType = animalType;
		this.animalColor = animalColor;
		this.animalWeight = animalWeight;
		this.animalSex = animalSex;
		this.animalAge = animalAge;
	}

	public void run(){
		System.out.println("RUN");
	}

	public void voice(){
		System.out.println("Voice");
	}

	@Override
	public String toString(){
		return "Animal:" + "\n" +
				"\tName= " + animalName + "\n" +
				"\tType= " + animalType + "\n" +
				"\tColor= " + animalColor + "\n" +
				"\tWeight= " + animalWeight + "\n" +
				"\tSex= " + animalSex + "\n" +
				"\tAge= " + animalAge + "\n";

	}
	}

