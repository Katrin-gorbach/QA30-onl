package Homework_8.Figures;

public class Triangle extends Figure{

	private final double a, b, c;

	public Triangle(double a, double b, double c){

		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double calculateSquare(){
		//корень из  p∙(p−a)∙(p−b)∙(p−c) -- Формула Герона
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c)); //Math.sqrt() --квадратный корень из числа

}
    @Override
	public double calculationPerimeter(){
		//P = a + b + c
		return this.a + this.b + this.c;
}



}
