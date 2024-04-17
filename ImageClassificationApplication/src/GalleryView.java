
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
	
	JFrame galleryWindow;
	JPanel galleryPanel;
	JPanel searchUploadPanel;
	JButton searchButton;
	JButton uploadButton;
	JButton imageButton;

	
	JLabel searchUploadLabel;

	
	public GalleryView()
	{
		// Create the Gallery window. This window is where all the other elements will be added.
		galleryWindow = new JFrame("Gallery");
		galleryWindow.setSize(400, 400);
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
		searchUploadPanel = new JPanel();

		
		searchUploadLabel = new JLabel("Search/Upload");

		
		searchUploadPanel.add(searchUploadLabel);

		galleryWindow.add(searchUploadPanel, BorderLayout.WEST);

		
		
		
		galleryWindow.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GalleryView();
	}
}
