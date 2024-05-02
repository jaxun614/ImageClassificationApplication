import java.util.ArrayList;
import java.util.List;

public class Database 
{
	private List<Image> images;
	
	public Database()
	{
		this.images = new ArrayList<>();
	}
	
	public void addImage(Image image)
	{
		images.add(image);
	}
	
	public List<Image> getAllImages()
	{
		return images;
	}
	
	public List<Image> searchByKeyword(String keyword)
	{
		List<Image> results = new ArrayList<>();
		for(Image image : images)
		{
			if(image.getMetadata().containsValue(keyword))
			{
				results.add(image);
			}
		}
		return results;
	}
	
	public List<Image> searchBySimilarity(Image queryImage)
	{
		return new ArrayList<>();
	}
}
