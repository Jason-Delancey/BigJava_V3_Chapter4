/**
 * 
 */

/**
 * @author CloudStrife
 * A Square whose constructor receives the length of the sides.
 */
public class Square
{
	private double side;
	
	/**
	 * Constructs a Square with a given side.
	 * @param aSide a side of the Square
	 */
	public Square(double aSide)
	{
		side = aSide;
	}
	
	/**
	 * Returns the area of the Square.
	 * @return the area of the Square
	 */
	public double getArea()
	{
		return side * side;
	}
	
	/**
	 * Returns the perimeter of the Square.
	 * @return the perimeter of the Square
	 */
	public double getPerimeter()
	{
		return side * 4;
	}
	
	public double getDiagonalLength()
	{
		return Math.sqrt(2 * getArea());
	}
}
