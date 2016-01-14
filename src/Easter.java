import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author CloudStrife
 * Compute the date of Easter Sunday.
 */
public class Easter
{
	private GregorianCalendar calendar;
	private int year,month,day;
	
	/**
	 * Constructs an Easter
	 */
	public Easter()
	{
		calendar = new GregorianCalendar();
		year = calendar.get(Calendar.YEAR);
		doIt();
	}
	
	/**
	 * Constructs an Easter given a year
	 * @param aYear the year given
	 */
	public Easter(int aYear)
	{
		year = aYear;
		doIt();
	}
	
	/**
	 * Computes the month and day for this year's 
	 * Easter Sunday
	 */
	private void doIt()
	{
		int a,b,c,d,e,g,h,j,k,m,r,n,p;
		a = year % 19;
		b = year / 100;
		c = year % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;
		month = n;
		day = p;
	}
	
	/**
	 * Returns the numerical representation of the month.
	 * @return the numerical representation of the month
	 */
	public int getEasterSundayMonth()
	{
		return month;
	}
	
	/**
	 * Returns the numerical representation of the day.
	 * @return the numerical representation of the day
	 */
	public int getEasterSundayDay()
	{
		return day;
	}
	
	/**
	 * Returns the name of the month.
	 * @return the name of the month
	 */
	public String getEasterSundayMonthByName()
	{
		Month aMonth = new Month(month);
		
		return aMonth.getName();
	}
	
}
