package imageClassificationApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageButtonListener implements ActionListener 
{
	GalleryView view;
	ImageButton img;
	
	
	public ImageButtonListener(GalleryView view, ImageButton imgButton)
	{
		this.view = view;
		this.img = imgButton;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
//		view.image.getImgInformation().getDescription()
		try
		{
			System.out.println("clicked");
			view.descriptionField.setText("just clicked");
			view.updateUI(view);
		}
		// catches general exeptions
		catch(Exception exception)
		{
			
		}
		
	}
}
