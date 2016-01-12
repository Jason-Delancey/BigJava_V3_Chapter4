

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class DataSetTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DataSet test = new DataSet();
		test.addValue(5);
		test.addValue(12);
		test.addValue(32);
		test.addValue(17);
		
		System.out.println(test.getSum());
		System.out.println("Expected result: 66");
		
		System.out.println(test.getAverage());
		System.out.println("Expected result: 16.5");
		
		System.out.println(test.getLargest());
		System.out.println("Expected result: 32");
		
		System.out.println(test.getSmallest());
		System.out.println("Expected result: 5");
	}

}
