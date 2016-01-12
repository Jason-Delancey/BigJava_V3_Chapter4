/**
 * 
 */

/**
 * @author CloudStrife
 *Prompts the user for two numbers.
 */
public class Pair
{
	private double firstNum, secondNum;
	
	/**
	 * Constructs a pair.
	 * @param aFirst the first value of the pair
	 * @param aSecond the second value of the pair
	 */
	public Pair(double aFirst, double aSecond) 
	{
		firstNum = aFirst;
		secondNum = aSecond;
	}
	
	/**
	 * Computes the sum of the values of this pair.
	 * @return the sum of the first and second values
	 */
	public double getSum() 
	{
		double sum = firstNum + secondNum;
		return sum;
	} 
	
	/**
	 * Computes the difference of the values of this pair.
	 * @return the difference of the first and second values
	 */
	public double getDifference() 
	{
		double difference = firstNum - secondNum;
		return difference;
	} 
	
	/**
	 * Computes the product of the values of this pair.
	 * @return the product of the first and second values
	 */
	public double getProduct() 
	{
		double product = firstNum * secondNum;
		return product;
	} 
	
	/**
	 * Computes the average of the values of this pair.
	 * @return the average of the first and second values
	 */
	public double getAverage() 
	{
		double average = (firstNum + secondNum) / 2.0;
		return average;
	} 
	
	/**
	 * Computes the distance of the values of this pair.
	 * @return the distance of the first and second values
	 */
	public double getDistance() 
	{
		double distance = firstNum - secondNum;
		if(distance < 0)
			distance *= -1;
		return distance;
	} 
	
	/**
	 * Computes the max of the values of this pair.
	 * @return the max of the first and second values
	 */
	public double getMax() 
	{
		double max;
		if(firstNum > secondNum)
			max = firstNum;
		else if(firstNum < secondNum)
			max = secondNum;
		else
			max = firstNum;
		
		return max;
	} 
	
	/**
	 * Computes the min of the values of this pair.
	 * @return the min of the first and second values
	 */
	public double getMin() 
	{
		double min;
		if(firstNum < secondNum)
			min = firstNum;
		else if(firstNum > secondNum)
			min = secondNum;
		else
			min = firstNum;
		
		return min;
	} 
}
