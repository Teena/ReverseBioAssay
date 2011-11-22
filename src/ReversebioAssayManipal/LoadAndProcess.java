package ReversebioAssayManipal;

import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.*;

public class LoadAndProcess
{
	
private BufferedImage image1;
public int iHeight, iWidth;

	public LoadAndProcess()
	{
		
	}
	
	private BufferedImage ReadImageFromLoc()throws IOException
	{
		image1 = ImageIO.read(new File("/home/teena/DIP/ReverseBioAssay/arrayPic.JPG"));
		return image1;
	}
	
	public void ImageSizeAndHeight()
	{
		try
		{
			BufferedImage imageSize = ReadImageFromLoc();
			iHeight = imageSize.getHeight(null);
			iWidth = imageSize.getWidth(null);
		}
		catch(IOException e)
		{
			System.out.println("ImageSizeAnd Height function error");
		}
	}
	
	
	public static void main(String args[])throws IOException
	{
		LoadAndProcess lpObj = new LoadAndProcess();
		lpObj.ImageSizeAndHeight();
	}
}