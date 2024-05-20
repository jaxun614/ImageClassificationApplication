package imageClassificationApp;
import java.net.URL;
import java.util.Scanner;

public class Image 
{
	String imgName;
	// TODO: will read the dateTime like the file I/O module 
	private String timeAdded;
	ImageInformation information; // Image HAS-A ImageInformation
	

	// Constructor for an image that has no data, only timeAdded
	public Image(String timeAdded)
	{
		this.timeAdded = timeAdded;
	}
	
	// Parameterized constructor
	// The image has a name, timeAdded, information
	public Image(String imgName, String timeAdded, ImageInformation information)
	{
		this.imgName = imgName;
		this.timeAdded = timeAdded;
		this.information = information;
	}
	
	// get the name of the image
	public String getImgName()
	{
		return this.imgName;
	}
	
	// set the name of the image
	public void setImgName(String newImgName)
	{
		this.imgName = newImgName;
	}
	
	// get the time the image was added
	public String getTimeAdded()
	{
		return this.timeAdded;
	}
	
	// get the information form the image
	public ImageInformation getImgInformation()
	{
		return this.information;
	}
	
	public void setImgInformation(ImageInformation imgInfo)
	{
		this.information = imgInfo;
	}
}