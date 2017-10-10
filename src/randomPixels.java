import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

public class randomPixels {
	
	public static void create(String fileName, int width, int height, double fillPercent, Color border, Color pixels) throws IOException{
		  BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
	      Graphics2D ig2 = bi.createGraphics();
	
	      //Use this section to write text to the image.
	      //**********************************************************************************
	      //Font font = new Font("TimesRoman", Font.BOLD, 20);
	      //ig2.setFont(font);
	      //String message = "www.java2s.com!";
	      //FontMetrics fontMetrics = ig2.getFontMetrics();
	      //int stringWidth = fontMetrics.stringWidth(message);
	      //int stringHeight = fontMetrics.getAscent();
	      //ig2.drawString(message, (width - stringWidth) / 2, height / 2 + stringHeight / 4);
	      //**********************************************************************************
	      ig2.setPaint(border);
	      
	      //border
	      ig2.drawRect(0, 0, width - 1, height - 1);
	      int heightRand = 0;
	      int widthRand = 0;
	      int num = 0;
	      boolean doesExist = true;
	      
	      //width * height divided by fillPercent = how many dots are made.
	      
	      FileWriter fstream = new FileWriter("C:\\Users\\Billy Kleinhomer\\Pictures\\Drawn By Java\\realLog.txt");
          BufferedWriter out = new BufferedWriter(fstream);
	      
	      //draw pixels
	      ig2.setPaint(pixels);
	      for(int i = 0; i < (width * height)/fillPercent; i ++){
	    	  widthRand = ThreadLocalRandom.current().nextInt(1, (width - 2) + 1);
	    	  heightRand = ThreadLocalRandom.current().nextInt(1, (height - 2) + 1);
	    	  out.write("Pixel written to: X:" + widthRand + " Y:" + heightRand);
	    	  out.newLine();
	    	  //ig2.drawRect(widthRand, heightRand, 1, 1);
	    	  bi.setRGB(widthRand, heightRand, pixels.getRGB());
	      }
	      
	      //draw a single pixel
	      //ig2.drawRect(x, y, (1), (1));
	      
	      while(doesExist == true){
	    	  File tempName = new File(fileName + num + ".png");
	    	  if(tempName.exists() == false){
	    		  doesExist = false;
	    		  ImageIO.write(bi, "PNG", new File(fileName + num + ".png"));
	    		  pixelReader.read(fileName, num);
	    	  }
	    	  num ++;
	      }
	      //ImageIO.write(bi, "JPEG", new File("C:\\Users\\maybe\\Pictures\\Drawn By Java\\testImage1.jpg"));
	      //ImageIO.write(bi, "gif", new File("C:\\Users\\maybe\\Pictures\\Drawn By Java\\testImage1.gif"));
	      //ImageIO.write(bi, "BMP", new File("C:\\Users\\maybe\\Pictures\\Drawn By Java\\testImage1.bmp"));
	      out.close();
	}
	
	public static void create2Tone(String fileName, int width, int height, int fillPercent, Color border, Color pixels, Color pixels2) throws IOException{
		  BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
	      Graphics2D ig2 = bi.createGraphics();
	
	      //Use this section to write text to the image.
	      //**********************************************************************************
	      //Font font = new Font("TimesRoman", Font.BOLD, 20);
	      //ig2.setFont(font);
	      //String message = "www.java2s.com!";
	      //FontMetrics fontMetrics = ig2.getFontMetrics();
	      //int stringWidth = fontMetrics.stringWidth(message);
	      //int stringHeight = fontMetrics.getAscent();
	      //ig2.drawString(message, (width - stringWidth) / 2, height / 2 + stringHeight / 4);
	      //**********************************************************************************
	      ig2.setPaint(border);
	      
	      //border
	      ig2.drawRect(0, 0, width - 1, height - 1);
	      int heightRand = 0;
	      int widthRand = 0;
	      int num = 0;
	      boolean doesExist = true;
	      //String fileName = "C:\\Users\\maybe\\Google Drive\\Images\\Drawn By Java\\Scan";
	      
	      //width * height divided by fillPercent = how many dots are made.
	      
	      //draw pixels
	      ig2.setPaint(pixels);
	      for(int i = 0; i < (width * height)/fillPercent; i ++){
	    	  widthRand = ThreadLocalRandom.current().nextInt(1, (width - 3) + 1);
	    	  heightRand = ThreadLocalRandom.current().nextInt(1, (height - 3) + 1);
	    	  ig2.drawRect(widthRand, heightRand, 1, 1);
	      }
	      
	      ig2.setPaint(pixels2);
	      for(int i = 0; i < (width * height)/fillPercent; i ++){
	    	  widthRand = ThreadLocalRandom.current().nextInt(1, (width - 3) + 1);
	    	  heightRand = ThreadLocalRandom.current().nextInt(1, (height - 3) + 1);
	    	  ig2.drawRect(widthRand, heightRand, 1, 1);
	      }
	      
	      //draw a single pixel
	      //ig2.drawRect(x, y, (1), (1));
	      
	      while(doesExist == true){
	    	  File tempName = new File(fileName + num + ".png");
	    	  if(tempName.exists() == false){
	    		  doesExist = false;
	    		  ImageIO.write(bi, "PNG", new File(fileName + num + ".png"));
	    	  }
	    	  num ++;
	      }
	      //ImageIO.write(bi, "JPEG", new File("C:\\Users\\maybe\\Pictures\\Drawn By Java\\testImage1.jpg"));
	      //ImageIO.write(bi, "gif", new File("C:\\Users\\maybe\\Pictures\\Drawn By Java\\testImage1.gif"));
	      //ImageIO.write(bi, "BMP", new File("C:\\Users\\maybe\\Pictures\\Drawn By Java\\testImage1.bmp"));
	}

}
