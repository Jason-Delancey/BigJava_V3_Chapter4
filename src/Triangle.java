import java.awt.geom.Point2D;

/**
 * 
 */

/**
 * @author CloudStrife A triangle is defined by the x- and y- coordinates of its
 *         three corner points.
 */
public class Triangle
{
	private Point2D.Double[] listOfPoints;
	private double sideA, sideB, sideC, angleA, angleB, angleC;

	public Triangle(Point2D.Double[] points)
	{
		listOfPoints = points;
		sideA = 0;
		sideB = 0;
		sideC = 0;
		angleA = 0;
		angleB = 0;
		angleC = 0;
		computeSides();
		computeAngles();
	}

	/**
	 * Compute the sides of the triangle using the coordinates given.
	 */
	private void computeSides()
	{
		Point2D.Double point1 = listOfPoints[0];
		Point2D.Double point2 = listOfPoints[1];
		Point2D.Double point3 = listOfPoints[2];

		/** Distance formula used to compute the sides of the triangle */
		double x2 = point2.getX();
		double x1 = point1.getX();
		double y2 = point2.getY();
		double y1 = point1.getY();
		sideA = Math.sqrt(((x2 - x1) * (x2 - x1)) - ((y2 - y1) * (y2 - y1)));
		
		x2 = point3.getX();
		x1 = point2.getX();
		y2 = point3.getY();
		y1 = point2.getY();
		sideB = Math.sqrt(((x2 - x1) * (x2 - x1)) - ((y2 - y1) * (y2 - y1)));
		
		x2 = point1.getX();
		x1 = point3.getX();
		y2 = point1.getY();
		y1 = point3.getY();
		sideC = Math.sqrt(((x2 - x1) * (x2 - x1)) - ((y2 - y1) * (y2 - y1)));
	}

	/**
	 * Computes the angles of the triangle using Law of Cosines.
	 */
	private void computeAngles()
	{
		angleA = Math.toDegrees(Math
				.acos(((sideA * sideA) - (sideB * sideB) - (sideC * sideC))
						/ (-2 * sideB * sideC)));
		angleB = Math.toDegrees(Math
				.acos(((sideB * sideB) - (sideA * sideA) - (sideC * sideC))
						/ (-2 * sideA * sideC)));

		angleC = Math.toDegrees(Math
				.acos(((sideC * sideC) - (sideA * sideA) - (sideB * sideB))
						/ (-2 * sideA * sideB)));
	}

	/**
	 * Returns the first side of the triangle.
	 * 
	 * @return the first side of the triangle
	 */
	public double getsideA()
	{
		return sideA;
	}

	/**
	 * Returns the second side of the triangle.
	 * 
	 * @return the second side of the triangle
	 */
	public double getsideB()
	{
		return sideB;
	}

	/**
	 * Returns the third side of the triangle.
	 * 
	 * @return the third side of the triangle
	 */
	public double getsideC()
	{
		return sideC;
	}

	/**
	 * Returns the first angle of the triangle.
	 * 
	 * @return the first angle of the triangle
	 */
	public double getAngleA()
	{
		return angleA;
	}

	/**
	 * Returns the second angle of the triangle.
	 * 
	 * @return the second angle of the triangle
	 */
	public double getAngleB()
	{
		return angleB;
	}

	/**
	 * Returns the third angle of the triangle.
	 * 
	 * @return the third angle of the triangle
	 */
	public double getAngleC()
	{
		return angleC;
	}

	/**
	 * Returns the perimeter of the triangle.
	 * 
	 * @return the perimeter of the triangle
	 */
	public double getPerimeter()
	{
		double perimeter = sideA + sideB + sideC;
		return perimeter;
	}

	/**
	 * Returns the area of the triangle using Heron's Formula.
	 * 
	 * @return the area of the triangle
	 */
	public double getArea()
	{
		double area = 0;
		double s = getPerimeter() * 0.5;
		area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}
}
