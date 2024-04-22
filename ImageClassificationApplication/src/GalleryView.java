
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// This class is responsible for displaying the GUI
public class GalleryView extends JFrame
{
	int galleryPanelDimeintion = 6;
	int frameSize = 600;
	
	JFrame galleryWindow;
	JPanel galleryPanel;
	JPanel utilityPanel;
	JPanel searchUploadPanel;
	JPanel informationPanel;
	JButton searchButton;
	JButton uploadButton;
	JButton imageButton;
	

	JLabel informationLabel;
	JLabel utilityLabel;

	
	public GalleryView()
	{
		// Create the Gallery window. This window is where all the other elements will be added.
		galleryWindow = new JFrame("Gallery");
		galleryWindow.setSize(frameSize, frameSize);
		galleryWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		galleryWindow.setLayout(new BorderLayout());
		
		
		// Create the gallery panel. This panel will hold the images in the gallery
		galleryPanel = new JPanel();
		galleryPanel.setLayout(new GridLayout(galleryPanelDimeintion, galleryPanelDimeintion)); // The gallery has a grid layout
		galleryWindow.add(galleryPanel, BorderLayout.CENTER); // The images will be displayed in the center of the application
		// Adds the image buttons to the gallery panel
		for(int i = 0; i < galleryPanelDimeintion; i++)
		{
			for(int j = 0; j < galleryPanelDimeintion; j++)
			{
				String stringIndex = i + ", " + j; // get the string representation of the index
				imageButton = new JButton(); // create a new button
				imageButton.setText(stringIndex); // set the text to the buttons index
				galleryPanel.add(imageButton); // add the button to the panel
			}
		}
		
		// Create the panel to hold the searching and uploading features
		utilityPanel = new JPanel(); // Utility panel to store the searching and uploading features
		utilityLabel = new JLabel("Utility"); // label for the new panel
		utilityPanel.setLayout(new BoxLayout(utilityPanel, BoxLayout.Y_AXIS)); // setting the layout of the panel
		utilityPanel.add(utilityLabel); // adding the label to the panel
		
		searchUploadPanel = new JPanel();
		searchUploadPanel.setLayout(new BoxLayout(searchUploadPanel, BoxLayout.X_AXIS));
		searchButton = new JButton("Search");
		uploadButton = new JButton("Upload");
		searchUploadPanel.add(searchButton);
		searchUploadPanel.add(uploadButton);
		
		utilityPanel.add(searchUploadPanel);
		
		
		
		galleryWindow.add(utilityPanel, BorderLayout.WEST);
		
		// Create the Information panel
		informationPanel = new JPanel();
		informationLabel = new JLabel("Information");
		informationPanel.add(informationLabel);
		
		galleryWindow.add(informationPanel, BorderLayout.EAST);		
		
		galleryWindow.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GalleryView();
	}

	public String getWindowName()
	{
		String windowName = galleryWindow.getTitle();
		return windowName;
	}
}
