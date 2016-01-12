import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class PairTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Double number1;
		String input1 = JOptionPane.showInputDialog("Please enter a number. Q to quit:");
		number1 = Double.parseDouble(input1);
		
		Double number2;
		String input2 = JOptionPane.showInputDialog("Please enter another number. Q to quit:");
		number2 = Double.parseDouble(input2);
		
		Pair test = new Pair(number1, number2);
		System.out.println(test.getSum());
		System.out.println(test.getDifference());
		System.out.println(test.getProduct());
		System.out.println(test.getAverage());
		System.out.println(test.getDistance());
		System.out.println(test.getMax());
		System.out.println(test.getMin());
	}

}
