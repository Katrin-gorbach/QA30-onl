package lesson_8_abstract_interfaces_composition.inher;

public class Lion extends Animal{
	public Lion(String animalName, String animalType, String animalColor, double animalWeight, String animalSex, int animalAge) {
		super(animalName, animalType, animalColor, animalWeight, animalSex, animalAge);
	}

	@Override
	public void run() {
		super.run();
	}

	@Override
	public void voice() {
		super.voice();
	}
}
