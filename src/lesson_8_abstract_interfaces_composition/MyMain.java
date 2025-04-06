package lesson_8_abstract_interfaces_composition;

import lesson_8_abstract_interfaces_composition.inher.Animal;
import lesson_8_abstract_interfaces_composition.inher.Lion;
import lesson_8_abstract_interfaces_composition.inher.Turtle;
import lesson_8_abstract_interfaces_composition.inher.Wolf;

public class MyMain {
	public static void main(String[] args){
		//
		//createAnimal();

	}
	public static void createAnimalIncheritance(){
		Animal lion = new Lion("Jon", "Lion",
				"Yellow", 102.5, "Male", 3);

		Animal wolf = new Wolf("Jan", "Wolf",
				"Grey", 10.5, "Female", 1);

		Animal turtle = new Turtle("Tort", "Turtle", "Green",
				45.4, "Female",59 );
	}


	/* неправильное реализация
	public static void createAnimal(){
		Animal lion = new Animal("Jon", "Lion",
				"Yellow", 102.5, "Male", 3);

		Animal wolf = new Animal("Jan", "Wolf",
				"Grey", 10.5, "Female", 1);

		System.out.println(lion); // lion == lion.toString() -> но если он не переопределен, то вернет адрес
		System.out.println(wolf);
	} */

}
