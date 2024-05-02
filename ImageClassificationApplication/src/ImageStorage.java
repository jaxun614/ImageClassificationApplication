//import java.util.ArrayList;
//import java.util.List;
//
//public class ImageStorage 
//{
//	private List<Image> images;
//	
//	public ImageStorage()
//	{
//		this.images = new ArrayList<>();
//	}
//	
//	public void uploadImage(Image image)
//	{
//		images.add(image);
//	}
//	
//	public List<Image> getAllImages()
//	{
//		return images;
//	}
//	
//	public List<Image> getImagesByUser(User user)
//	{
//		List<Image> userImages = new ArrayList<>();
//		for(Image image : images)
//		{
//			if(image.getUploader().equals(user))
//			{
//				userImages.add(image);
//			}
//		}
//		return userImages;
//	}
//	
//	public void deleteImage(Image image)
//	{
//		images.remove(image);
//	}
//
//}

import java.util.ArrayList;
import java.util.List;

public class ImageStorage {
    private List<Image> images;

    public ImageStorage() {
        this.images = new ArrayList<>();
    }

    public void uploadImage(Image image) {
        images.add(image);
    }

    public List<Image> getAllImages() {
        return images;
    }

    // Methods for managing image metadata and deletion can be added here
}

