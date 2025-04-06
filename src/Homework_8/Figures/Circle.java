package Homework_8.Figures;

public class Circle extends Figure {
	private final double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double calculateSquare(){
		//S = π * R * R
		return (Math.PI * Math.pow(this.r, 2)) ;  //Math pow() calculate powers of numbers using a base and an exponent.

	}

	@Override
	public double calculationPerimeter(){
		//C = 2 * π * r
		return (2 * Math.PI * this.r ) ;
	}
}


