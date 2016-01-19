import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
		while (!hasPoints)
		{
			String xCoordinate = JOptionPane
					.showInputDialog("Please enter the x coordinate for a point (Q to quit): ");
			if (xCoordinate.equalsIgnoreCase("q"))
				break;
			String yCoordinate = JOptionPane
					.showInputDialog("Please enter the y coordinate for a point (Q to quit): ");
			if (yCoordinate.equalsIgnoreCase("q"))
				break;

			aPoint = new Point2D.Double(Double.parseDouble(xCoordinate),
					Double.parseDouble(yCoordinate));
			points[iterator] = aPoint;
			iterator++;

			if (iterator == (points.length))
				hasPoints = true;
		}
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Triangle Properties");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Triangle test = new Triangle(points);
		String[] columnNames = {"SideA","SideB","SideC","AngleA","AngleB","AngleC","Perimeter","Area"};
		Object[][] data = {{test.getsideA(),test.getsideB(),test.getsideC(),test.getAngleA(),
			test.getAngleB(),test.getAngleC(),test.getPerimeter(),test.getArea()}};
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		
		frame.add(scrollPane);
		frame.setVisible(true);

	}

}
