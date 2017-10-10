import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class coordinatedDraw {

	public static void singlePixel(String fileName, int width, int height, int coord1, int coord2, Color border, Color pixel) throws IOException{
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
	      Graphics2D ig2 = bi.createGraphics();
	      
	      ig2.setPaint(border);
	      
	      ig2.drawRect(0, 0, width - 1, height - 1);
	      
	      boolean doesExist = true;
	      int num = 0;
          
          ig2.setPaint(pixel);
          //ig2.drawRect(coord1, coord2, 1, 1);
          bi.setRGB(coord1, coord2, pixel.getRGB());
          
          while(doesExist == true){
	    	  File tempName = new File(fileName + num + ".png");
	    	  if(tempName.exists() == false){
	    		  doesExist = false;
	    		  ImageIO.write(bi, "PNG", new File(fileName + num + ".png"));
	    		  pixelReader.read(fileName, num);
	    	  }
	    	  num ++;
	      }
          
	}
}
