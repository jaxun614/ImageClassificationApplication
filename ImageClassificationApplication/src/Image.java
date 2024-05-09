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

	
	

//	public static String readDateTime(String string) 
//	{
//		final int DATETIMELENGTH = 32;	// Standard length of a time stamp
//		String dateTime = ""; // to hold the date/time
//		String content = ""; // to hold the data from the website
//		Scanner sc = null; // Initialize a scanner
//		
//		// code that might cause an exception
//		try 
//		{
//			URL url = new URL("http://worldtimeapi.org/api/ip"); // create a URL
//			sc = new Scanner(url.openStream()); // scanner for the web site
//			// loop over the data while there is still more lines of data
//			while(sc.hasNext())
//			{
//				// add the data to the string holding it
//				content += sc.nextLine();
//			}
//			// get the index where the time stamp starts
//			int dateIndex = content.indexOf("202", 0);
//			// assign the substring, the time stamp, to its own string
//			dateTime = content.substring(dateIndex, DATETIMELENGTH + dateIndex);
//		}
//		// catch general exceptions
//		catch(Exception e)
//		{
//			System.out.println("");
//		}
//		// Operation that needs to execute during the program
//		finally
//		{
//			// close the scanner
//			if(sc != null)
//			{
//				sc.close();
//			}
//		}
//		// return the formated time stamp
//		return dateTime;
//	}
}