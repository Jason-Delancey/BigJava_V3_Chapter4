/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class IceCreamCone
{
	private double height, radius;
	
	/**
	 * Constructs a new IceCreamCone
	 * @param aHeight the given height of the IceCreamCone
	 * @param aRadius the given radius of the IceCreamCone
	 */
	public IceCreamCone(double aHeight, double aRadius)
	{
		height = aHeight;
		radius = aRadius;
	}
	
	/**
	 * Returns the surface area of the IceCreamCone.
	 * @return the surface area of the IceCreamCone
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = Math.PI * radius * Math.sqrt((height*height) + (radius*radius));
		return surfaceArea;
	}
	
	/**
	 * Returns the volume of the IceCreamCone.
	 * @return the volume of the IceCreamCone
	 */
	public double getVolume()
	{
		double volume = Math.PI * (radius * radius) * (height / 3.0);
		return volume;
	}
}
