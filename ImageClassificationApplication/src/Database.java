////import java.util.ArrayList;
////import java.util.List;
////
////public class Database 
////{
////	private List<Image> images;
////	
////	public Database()
////	{
////		this.images = new ArrayList<>();
////	}
////	
////	public void addImage(Image image)
////	{
////		images.add(image);
////	}
////	
////	public List<Image> getAllImages()
////	{
////		return images;
////	}
////	
////	public List<Image> searchByKeyword(String keyword)
////	{
////		List<Image> results = new ArrayList<>();
////		for(Image image : images)
////		{
////			if(image.getMetadata().containsValue(keyword))
////			{
////				results.add(image);
////			}
////		}
////		return results;
////	}
////	
////	public List<Image> searchBySimilarity(Image queryImage)
////	{
////		return new ArrayList<>();
////	}
////}
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Database {
//    private List<Image> images;
//
//    public Database() {
//        this.images = new ArrayList<>();
//    }
//
//    public void addImage(Image image) {
//        images.add(image);
//    }
//
//    public List<Image> getAllImages() {
//        return images;
//    }
//
//    public List<Image> searchByKeyword(String keyword) {
//        // Implement search by keyword logic
//        // This method can be more sophisticated depending on the requirements
//        List<Image> results = new ArrayList<>();
//        for (Image image : images) {
//            // Logic to check if the image metadata contains the keyword
//            // For simplicity, let's assume the metadata contains a description field
//            if (image.getMetadata().contains("description") && image.getMetadata().get("description").contains(keyword)) {
//                results.add(image);
//            }
//        }
//        return results;
//    }
//
//    public List<Image> searchBySimilarity(Image queryImage) {
//        // Implement search by similarity logic
//        // This method can be more sophisticated depending on the requirements
//        // For simplicity, return all images for now
//        return images;
//    }
//}
//
