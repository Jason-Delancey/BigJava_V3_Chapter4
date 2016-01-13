/**
 * 
 */

/**
 * @author CloudStrife
 * Reads in an integer and breaks it into a sequence of individual digits in reverse order.
 */
public class DigitExtractor
{
	private String aInteger;
	private int nextDigit;
	/**
	 * Construct a DigitExtractor.
	 * @param anInteger the integer to break up into digits
	 */
	public DigitExtractor(int anInteger)
	{
		aInteger = Integer.toString(anInteger);
		nextDigit = aInteger.length() - 1;
	}

	/**
	 * Returns the next digit to be extracted.
	 * @return the next digit
	 */
	public int nextDigit()
	{
		int digit = nextDigit;
		nextDigit--;
		return Integer.parseInt(aInteger.charAt(digit) + "");
	}
}
