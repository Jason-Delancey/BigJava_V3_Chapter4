/**
 * 
 */

/**
 * @author CloudStrife
 * constructs a balloon, adds 100 cm3 of air, tests the three accessor methods, 
 * adds another 100 cm3 of air, and tests the accessor methods again.
 */
public class BalloonTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Balloon temp = new Balloon();
		temp.addAir(100);
		System.out.println("Radius: " + temp.getRadius());
		System.out.println("Surface Area: " + temp.getSurfaceArea());
		System.out.println("Volume: " + temp.getVolume());
	}

}
