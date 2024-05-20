import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	ImageStorage storage;
	// 
	JFrame mainWindow;
	JPanel functionPanel;
	
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
				
				
				String coords = i+", "+j;
				ImageButton imageButton = new ImageButton(image);
				imageButton.addActionListener(new ImageButtonListener(this, imageButton));
				imageButton.setText("");
				imagePanel.add(imageButton);

			}
		}
		
		
		
		// Initialized the panel for Searching and Uploading
		functionPanel = new JPanel();
		functionPanel.setLayout(new BoxLayout(functionPanel, BoxLayout.Y_AXIS));
		// Initialize the search and upload buttons
		search = new JButton("search");
		upload = new JButton("upload");
		upload.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("file uploaded");
			}
		});
		
		// Initialize the panel for information
		infoPanel = new JPanel();
		infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
		descriptionField = new JTextField("Description");
		infoPanel.add(descriptionField);
		
		

		
		functionPanel.add(search);
		functionPanel.add(upload);
		
		// Configure the layout of the components
		mainWindow.setLayout(new BorderLayout());
		mainWindow.add(functionPanel, BorderLayout.WEST);
		mainWindow.add(imagePanel, BorderLayout.CENTER);
		mainWindow.add(infoPanel, BorderLayout.EAST);
		
		
		
		mainWindow.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> tags = new ArrayList<String>();
		
		
		ImageInformation info = new ImageInformation("This is an image", true, tags);
		
		info.addTag("food");
		info.addTag("sports");
		info.setDescription("this is a new image");
		
		Image image = new Image("jackson", "2024", info);
		String timeAdded = image.getTimeAdded();
		String name = image.getImgName();
		
		
		image.setImgInformation(info);
		
		
		//String description = image.getImgInformation().getDescription();
		
		System.out.println("Img name: "+name+", Time added:"+timeAdded+", Description: "+image.getImgInformation().getDescription()+", Is Favorate: "+image.getImgInformation().getIsFavorate()+", Tags"+image.getImgInformation().getTags());
		//System.out.println(timeAdded);
		//System.out.println(description);
		
		ImageStorage storage = new ImageStorage(name, image);
		

		
		new GalleryView();

	}

	public void updateUI(GalleryView view)
	{
		
		descriptionField.setText(image.getImgInformation().getDescription());
		
	}

}
