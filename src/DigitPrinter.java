/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class DigitPrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DigitExtractor myExtractor = new DigitExtractor(16384);
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
	}

}
