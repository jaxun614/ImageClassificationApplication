
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// This class is responsible for displaying the GUI
public class Gallary extends JFrame
{
	JFrame gallaryWindow;
	JPanel gallaryPanel;
	JPanel searchPanel;
	JPanel uploadPanel;
	
	JLabel searchLabel;
	JLabel uploadLabel;
	
	public Gallary()
	{
		gallaryWindow = new JFrame("Gallary");
		gallaryWindow.setSize(400, 400);
		gallaryWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gallaryWindow.setLayout(new BorderLayout());
		
		searchPanel = new JPanel();
		uploadPanel = new JPanel();
		
		searchLabel = new JLabel("Search");
		uploadLabel = new JLabel("Upload");
		
		searchPanel.add(searchLabel);
		uploadPanel.add(uploadLabel);
		
		gallaryWindow.add(searchPanel, BorderLayout.WEST);
		gallaryWindow.add(uploadPanel, BorderLayout.EAST);
		
		
		
		gallaryWindow.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Gallary();
	}
}
