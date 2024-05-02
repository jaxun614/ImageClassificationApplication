
// This class is responsible for the images
// It will create a new image object

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//public class Image 
//{
//	private String filePath;
//	private Map<String, String> metadata;
//	
//	public Image(String filePath, Map<String, String> metadata)
//	{
//		this.filePath = filePath;
//		this.metadata = metadata != null ? metadata: new HashMap<>();
//	}
//	
//	// gets the file path of the image
//	public String getFilePath()
//	{
//		return filePath;
//	}
//	
//	// gets the metadata of the image
//	public Map<String, String> getMetadata() 
//	{
//		return metadata;
//	}
//	
//	public void setMetadata(String key, String value)
//	{
//		metadata.put(key,  value);
//	}
//	
//	public void upload()
//	{
//		// TODO : code for uploading the image
//	}
//
//}

public class Image {
    private String filePath;
    private User uploader;
	private Map<String, String> metadata;

    // Additional metadata fields as needed

    public Image(String filePath, User uploader, Map<String, String> metadata) {
        this.filePath = filePath;
        this.uploader = uploader;
		this.metadata = metadata != null ? metadata: new HashMap<>();

    }

    public String getFilePath() {
        return filePath;
    }

    public User getUploader() {
        return uploader;
    }

	public List<Image> getMetadata() {
		// TODO Auto-generated method stub
		return null;
	}

    // Methods for image manipulation (e.g., resize, crop) can be added here
    // Method for uploading the image can also be added
}

