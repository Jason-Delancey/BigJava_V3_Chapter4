/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
                        This program tests the Easter class.
 */
public class EasterTester
{
	public static void main(String[] args)
	{
		Easter myEaster = new Easter(2001);
		System.out.println("Month: " +
				myEaster.getEasterSundayMonth());
		System.out.println("Expected: 4\n");
		
		System.out.println("Day: " + myEaster.getEasterSundayDay());
		System.out.println("Expected: 15\n");
		
		System.out.println("Name of Month: " + myEaster.getEasterSundayMonthByName());
		System.out.println("Expected: April");
	} 
	
}
