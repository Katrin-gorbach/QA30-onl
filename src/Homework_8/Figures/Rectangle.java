package Homework_8.Figures;

public class Rectangle extends Figure{
	private final double a, b;

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	//S = a * b
 	//P = 2 * ( a + b )

	@Override
	public double calculateSquare(){
		//S = (a * b)
		return (this.a * this.b) ;

	}
	@Override
	public double calculationPerimeter(){
		//P = 2 * ( a + b )
		return (this.a + this.b ) * 2;
	}
}
