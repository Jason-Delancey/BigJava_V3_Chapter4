import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class ElapsedTimePrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String input1 = "";
		String input2 = "";
		
		input1 = JOptionPane.showInputDialog("Please enter the first time in digits only (Enter Q to quit): ");
		if(input1.equalsIgnoreCase("q"))
			System.out.println("Program terminated.");
		else
		{
			input2 = JOptionPane.showInputDialog("Please enter the second time in digits only (Enter Q to quit): ");
			if(input1.equalsIgnoreCase("q"))
				System.out.println("Program terminated.");
		}
		
		double time1 = Double.parseDouble(input1);
		double time2 = Double.parseDouble(input2);
		
		TimeInterval test = new TimeInterval(time1, time2);
		System.out.println(test.getHours() + " hours " + test.getMinutes() + " minutes.");

	}

}
