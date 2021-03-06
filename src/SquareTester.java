/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
 * This program tests the Square class.
 */
public class SquareTester
{
	public static void main(String[] args)
	{
		Square mySquare = new Square(2);
		System.out.println("Area: " + mySquare.getArea());
		System.out.println("Expected: 4");
		System.out.println("Perimeter: " + mySquare.getPerimeter());
		System.out.println("Expected: 8");
		System.out.println("Diagonal length: "
				+ mySquare.getDiagonalLength());
		System.out.println("Expected: 2.828427125");
	}
}
