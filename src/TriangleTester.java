import java.awt.geom.Point2D;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class TriangleTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Point2D.Double[] points = new Point2D.Double[3];
		Point2D.Double aPoint;
		
		boolean hasPoints = false;
		int iterator = 0;
		while(!hasPoints)
		{	
			String xCoordinate = JOptionPane.showInputDialog("Please enter the x coordinate for a point (Q to quit): ");
			if(xCoordinate.equalsIgnoreCase("q"))
				break;
			String yCoordinate = JOptionPane.showInputDialog("Please enter the y coordinate for a point (Q to quit): ");
			if(yCoordinate.equalsIgnoreCase("q"))
				break;
			
			aPoint = new Point2D.Double(Double.parseDouble(xCoordinate), Double.parseDouble(yCoordinate));
			points[iterator] = aPoint;
			iterator++;
			
			if(iterator == (points.length))
				hasPoints = true;
		}
		
	}
	
}
