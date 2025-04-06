package Homework_8.Figures;

public class MyMain {

	public static void main(String[] args){
		Figure[] figures = new Figure[]{
				new Triangle(23.1, 34.5, 4.5),
			new Circle(8.9),
			new Rectangle(34.8, 87.9),
			new Circle(5.0),
			new Rectangle(66.9, 9.78)
		};
		double sumPerimetr = 0;

		for (Figure f : figures){
			sumPerimetr += f.calculationPerimeter();
		}

		System.out.println("Sum of fifth figures from array is: " + sumPerimetr);

	}

}
