/**
 * 
 */

/**
 * @author CloudStrife
 * Computes the sum and average of a sequence of integers.
 */
public class DataSet
{
	private int[] list;
	private int largestYet, smallestYet;
	
	/**
	 * Constructs a new DataSet
	 */
	public DataSet()
	{
		list = new int[0];
		largestYet = 0;
		smallestYet = 0;
	}
	
	/**
	 * Adds an integer to the list of numbers.
	 * @param x the given number to add to the list of numbers
	 */
	public void addValue(int x)
	{
		int[] temp = new int[list.length + 1];
		for(int i = 0; i < list.length; i++)
		{
			temp[i] = list[i];
		}
		
		temp[list.length] = x;
		list = temp;
		/*for(int element: list)
			System.out.println(element);*/
	}
	
	/**
	 * Returns the sum of the list of numbers.
	 * @return the sum of the list of numbers
	 */
	public int getSum()
	{
		int sum = 0;
		for(int i = 0; i < list.length; i++)
		{
			sum += list[i];
		}
		return sum;
	}
	
	/**
	 * Returns the average of the list of numbers.
	 * @return the average of the list of numbers
	 */
	public double getAverage()
	{
		return ((getSum() * 1.0) / list.length);
	}
	
	/**
	 * Returns the largest number in the list.
	 * @return the largest number in the list
	 */
	public int getLargest()
	{
		for(int element: list)
		{
			if(element >= largestYet)
				largestYet = element;
		}
		return largestYet;
	}
	
	/**
	 * Returns the smallest number in the list.
	 * @return the smallest number in the list
	 */
	public int getSmallest()
	{
		smallestYet = list[0];
		for(int element: list)
		{
			if(element <= smallestYet)
				smallestYet = element;
		}
		return smallestYet;
	}
}
