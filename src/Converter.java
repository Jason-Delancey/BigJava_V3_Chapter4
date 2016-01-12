/**
 * 
 */

/**
 * @author CloudStrife
 * Converts given meters into miles, feet, and inches.
 */
public class Converter
{
	private double numOfMeters;
	private final double METER_TO_INCHES;
	private final double METER_TO_FEET;
	private final double METER_TO_MILES;
	
	/**
	 * Constructs a converter with a given number of meters.
	 * @param meters the number of meters to convert
	 */
	public Converter(double meters) 
	{
		numOfMeters = meters;
		METER_TO_FEET = 3.28084;
		METER_TO_INCHES = 39.3701;
		METER_TO_MILES = 0.000621371;
	}
	
	/**
	 * Returns the number of inches.
	 * @return the number of inches
	 */
	public double getInches()
	{
		return numOfMeters * METER_TO_INCHES;
	}
	
	/**
	 * Returns the number of feet.
	 * @return the number of feet
	 */
	public double getFeet()
	{
		return numOfMeters * METER_TO_FEET;
	}
	
	/**
	 * Returns the number of miles.
	 * @return the number of miles
	 */
	public double getMiles()
	{
		return numOfMeters * METER_TO_MILES;
	}
}
