/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class SodaCan
{
	private double height, radius;
	
	/**
	 * Constructs a SodaCan with a given height and diameter.
	 * @param aHeight the height of the SodaCan
	 * @param aDiameter the diameter of the SodaCan
	 */
	public SodaCan(double aHeight, double aDiameter)
	{
		height = aHeight;
		radius = aDiameter / 2.0;
	}
	
	/**
	 * Returns the volume of the SodaCan.
	 * @return the volume of the SodaCan
	 */
	public double getVolume()
	{
		return Math.PI * radius * radius * height;
	}
	
	/**
	 * Returns the surface area of the SodaCan.
	 * @return the surface area of the SodaCan
	 */
	public double getSurfaceArea()
	{
		return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
	}
}
