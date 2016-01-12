/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class Balloon
{
	private double radius, diameter;
	
	public Balloon()
	{
		radius = 0;
		diameter = 0;
	}
	
	/**
	 * Adds the given amount of air.
	 * @param amount the amount of air to add.
	 */
	public void addAir(double amount)
	{
		diameter += amount;
		radius = diameter / 2.0;
	}
	
	/**
	 * Returns the volume of the Balloon.
	 * @return the volume of the Balloon
	 */
	public double getVolume()
	{
		return (4 / 3.0) * Math.PI * radius * radius;
	}
	
	/**
	 * Returns the surface area of the Balloon.
	 * @return the surface area of the Balloon
	 */
	public double getSurfaceArea()
	{
		return 4 * Math.PI * radius * radius;
	}
	
	/**
	 * Returns the radius of the Balloon.
	 * @return the radius of the Balloon
	 */
	double getRadius()
	{
		return radius;
	}
}
