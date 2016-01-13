/**
 * 
 */

/**
 * @author CloudStrife
 * A program that reads two times in military format (0900, 1730) and 
 * prints the number of hours and minutes between the two times.
 */
public class TimeInterval
{
	private double time1,time2;
	
	/**
	 * Constructs a TimeInterval
	 * @param aTime1 military time 1 given
	 * @param aTime2 military time 2 given
	 */
	public TimeInterval(double aTime1, double aTime2)
	{
		time1 = aTime1;
		time2 = aTime2; 
	}
	
	/**
	 * Returns the number of hours in the Interval.
	 * @return the number of hours in the Interval
	 */
	public int getHours()
	{
		double interval = 0;
		double hours = 0;
		if(time1 <= time2)
		{
			interval = Math.abs(time1 - time2);
			hours = 0;
			for(int i = 0; (i * 100.0) < interval; i++)
			{
				hours = i;
			}
		}
		else
		{
			interval = (2400 - time1) + time2;
			hours = 0;
			for(int i = 0; (i * 100.0) < interval; i++)
			{
				hours = i;
			}
		}
		
		return (int)hours;
	}
	
	/**
	 * Returns the number of minutes in the Interval.
	 * @return the number of minutes in the Interval
	 */
	public int getMinutes()
	{
		double interval = 0;
		double hours = 0;
		if(time1 <= time2)
		{
			interval = Math.abs(time1 - time2);
			hours = 0;
			for(int i = 0; (i * 100.0) < interval; i++)
			{
				hours = i;
			}
		}
		else
		{
			interval = (2400 - time1) + time2;
			hours = 0;
			for(int i = 0; (i * 100.0) < interval; i++)
			{
				hours = i;
			}
		}
		double minutes = interval - (hours * 100);
		
		return (int)minutes;
	}
}
