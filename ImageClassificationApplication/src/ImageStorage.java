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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ImageStorage 
{
	
	public ImageStorage(String fileName, Image image) 
	{
		try
		{
			File imageStorage = new File(fileName);
			if(imageStorage.createNewFile())
			{
				System.out.println("File created: "+ imageStorage.getName());
			}
			else
			{
				System.out.println("File already exists");
			}
		} catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}
	
	public void uploadImage(String fileName, Image image)
	{
		PrintWriter printWriter = null;
		
		try 
		{
			printWriter = new PrintWriter(new FileWriter(new File(fileName), true));
			printWriter.println(image.getImgName());
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
		}
		finally
		{
			printWriter.close();
		}
	}
}


