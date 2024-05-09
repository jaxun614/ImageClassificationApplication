import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GalleryView extends JFrame 
{
	Image image;
	ImageInformation info;
	// 
	JFrame mainWindow;
	JPanel searchUploadPanel;
	JPanel imagePanel;
	JPanel infoPanel;
	JTextField descriptionField;
	JButton search;
	JButton upload;
	
	// Constructor for the GUI
	public GalleryView()
	{
		final int SIZE = 400;
		
		// Initialize a new JFrame with the title Gallery
		mainWindow = new JFrame("Gallery");
		mainWindow.setSize(SIZE, SIZE);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Initialize the Panel for images
		imagePanel = new JPanel();
		imagePanel.setLayout(new GridLayout(3,3));
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				// TODO: set the background of the button to the image
				// TODO: connect the image information to the
				
				String coords = i+", "+j;
				JButton button = new JButton();
				button.setText(coords);
				imagePanel.add(button);

			}
		}
		
		
		
		// Initialized the panel for Searching and Uploading
		searchUploadPanel = new JPanel();
		searchUploadPanel.setLayout(new BoxLayout(searchUploadPanel, BoxLayout.Y_AXIS));
		
		// Initialize the panel for information
		infoPanel = new JPanel();
		infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
		descriptionField = new JTextField("Description");
		infoPanel.add(descriptionField);
		
		
		// Initialize the search and upload buttons
		search = new JButton("search");
		upload = new JButton("upload");
		
		searchUploadPanel.add(search);
		searchUploadPanel.add(upload);
		
		// Configure the layout of the components
		mainWindow.setLayout(new BorderLayout());
		mainWindow.add(searchUploadPanel, BorderLayout.WEST);
		mainWindow.add(imagePanel, BorderLayout.CENTER);
		mainWindow.add(infoPanel, BorderLayout.EAST);
		
		
		
		mainWindow.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> tags = new ArrayList<String>();
		
		
		ImageInformation info = new ImageInformation("This is an image", true, tags);
		
		info.addTag("food");
		info.addTag("sports");
		
		Image image = new Image("jackson", "2024", info);
		String timeAdded = image.getTimeAdded();
		String name = image.getImgName();
		
		
		image.setImgInformation(info);
		
		//String description = image.getImgInformation().getDescription();
		
		System.out.println("Img name: "+name+", Time added:"+timeAdded+", Description: "+image.getImgInformation().getDescription()+", Is Favorate: "+image.getImgInformation().getIsFavorate()+", Tags"+image.getImgInformation().getTags());
		//System.out.println(timeAdded);
		//System.out.println(description);
		


		
		new GalleryView();

	}

}
