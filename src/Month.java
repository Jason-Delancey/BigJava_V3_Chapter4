/**
 * 
 */

/**
 * @author CloudStrife
 * Transform numbers 1, 2, 3, ..., 12 into the corresponding 
 * month names January, February, March, . . ., December. 
 */
public class Month
{
	private int month;
	private String[] listOfMonths = new String[12];
	
	/**
	 * Constructs a Month given the it's numerical representation.
	 * @param aMonth the numerical representation of the month given
	 */
	public Month(int aMonth)
	{
		month = aMonth - 1;
		listOfMonths[0] = "January";
		listOfMonths[1] = "February";
		listOfMonths[2] = "March";
		listOfMonths[3] = "April";
		listOfMonths[4] = "May";
		listOfMonths[5] = "June";
		listOfMonths[6] = "July";
		listOfMonths[7] = "August";
		listOfMonths[8] = "September";
		listOfMonths[9] = "October";
		listOfMonths[10] = "November";
		listOfMonths[11] = "December";
	}
	
	/**
	 * Returns the month name.
	 * @return the name of the month
	 */
	public String getName()
	{
		return listOfMonths[month];
	}
}
