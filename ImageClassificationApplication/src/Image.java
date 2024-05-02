
// This class is responsible for the images
// It will create a new image object

import java.util.HashMap;
import java.util.Map;

public class Image 
{
	private String filePath;
	private Map<String, String> metadata;
	
	public Image(String filePath, Map<String, String> metadata)
	{
		this.filePath = filePath;
		this.metadata = metadata != null ? metadata: new HashMap<>();
	}
	
	// gets the file path of the image
	public String getFilePath()
	{
		return filePath;
	}
	
	// gets the metadata of the image
	public Map<String, String> getMetadata() 
	{
		return metadata;
	}
	
	public void setMetadata(String key, String value)
	{
		metadata.put(key,  value);
	}
	
	public void upload()
	{
		// TODO : code for uploading the image
	}

}
