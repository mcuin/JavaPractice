import java.awt.Point;
import java.awt.Polygon;


public class ConstructorPassing {
	
	public double computePayment(double loanAmount, double rate, double futureValue, int periods) {
		double interestRate = rate / 100.0;
		double partial = Math.pow((1 + interestRate), - periods);
		double denominator = (1 - partial) / interestRate;
		double answer = (-loanAmount / denominator) - ((futureValue * partial) / denominator);
		return answer;
	}
	
	public Polygon polygonFrom(Point[] corners) {
		return null;
	}
	
	public Polygon polygonFrom2(Point... corners) {
		int numberOfSides = corners.length;
		double squareOfSide1, lengthOfSide1;
		squareOfSide1 = (corners[1].x - corners[0].x) * (corners[1].x) + (corners[1].y - corners[0].y)
				* (corners[1].y - corners[0].y);
		lengthOfSide1 = Math.sqrt(squareOfSide1);
		
		return null;
	}
	
	public class Circle{
		private int x, y, radius;
		public void setOrigin(int x, int y){
			
		}
	}
	
	public static class PassPrimitiveByValue{
		

		public static void main(String[] args) {
			
			int x = 3;
			
			passMethod(x);
			
			System.out.println("After invoking passMethod, x = " + x);

		}
		
		public static void passMethod(int p) {
			p = 10;
		}
	}

}
