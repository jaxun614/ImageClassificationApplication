import java.util.ArrayList;

public class ImageInformation
{
	String description;
	Boolean isFavorate;
	ArrayList<String> tags;
	
	// default constructor for the image information object
	public ImageInformation()
	{
		this.description = "Default text.";
		this.isFavorate = false;
		this.tags = null;
	}
	
	// Constructor to create image information 
	// object for when the user provides info
	public ImageInformation(String imageDescription, Boolean imageIsFavorate, ArrayList<String> imageTags)
	{
		this.description = imageDescription;
		this.isFavorate = imageIsFavorate;
		this.tags = imageTags;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String newDescription)
	{
		this.description = newDescription;
	}
	
	public Boolean getIsFavorate()
	{
		return this.isFavorate;
	}
	
	public void setIsFavorate(Boolean isFavorate)
	{
		this.isFavorate = isFavorate;
	}
	
	public ArrayList<String> getTags()
	{
		return this.tags;
	}
	
	public void addTag(String tagName)
	{
		tags.add(tagName);
	}
	
}




















