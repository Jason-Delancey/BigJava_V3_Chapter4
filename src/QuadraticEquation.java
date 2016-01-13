/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class QuadraticEquation
{
	private double a,b,c;
	
	/**
	 * Receives the coefficients a, b, c of the quadratic equation ax2 + bx + c = 0
	 * @param A
	 * @param B
	 * @param C
	 */
	public QuadraticEquation(double A, double B,  double C)
	{
		a = A;
		b = B;
		c = C;
	}
	
	/**
	 * Returns the first solution using the quadratic equation.
	 * @return the first solution using quadratic equation
	 */
	public double getSolution1()
	{
		double solution = 0;
		solution = (-b + Math.sqrt((b * b) - 4 * a * c))/2 * a;
		
		return solution;
	}
	
	/**
	 * Returns the second solution using the quadratic equation.
	 * @return the second solution using quadratic equation
	 */
	public double getSolution2()
	{
		double solution = 0;
		solution = (-b - Math.sqrt((b * b) - 4 * a * c))/2 * a;
		
		return solution;
	}
}
