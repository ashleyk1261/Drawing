import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;

public class pixelReader {

	public static void read(String toRead, int num){
		try {
            //read image file
            File file1 = new File(toRead + num + ".png");
            BufferedImage image1 = ImageIO.read(file1);

            //write file
            FileWriter fstream = new FileWriter("C:\\Users\\Billy Kleinhomer\\Pictures\\Drawn By Java\\readLog.txt");
            BufferedWriter out = new BufferedWriter(fstream);

            //color object
            //Color cyan = new Color(0, 255, 255);
            System.out.println("X:" + image1.getWidth() + ", " + " Y:" + image1.getHeight());
            
            out.write("**********************************************************");
            out.newLine();
            out.newLine();
            out.write("Read file: " + toRead + num + ".png");
            out.newLine();
            out.newLine();
            out.write("**********************************************************");
            out.newLine();
            out.newLine();

            //find cyan pixels
            for (int y = 0; y < image1.getHeight(); y++) {
                for (int x = 0; x < image1.getWidth(); x++) {

                  int c = image1.getRGB(x,y);
                  Color color = new Color(c);
                  //System.out.println(color);
                  //int  red = (c & 0x0000FFFF) >> 16;
                  //int  green = (c & 0x0000FFFF) >> 8;
                  //int  blue = c & 0x0000FFFF;

                  //if (cyan.equals(image1.getRGB(x, y)){

                  //if (color.getRed() < 255 && color.getGreen() > 0 && color.getBlue() > 0) {
                  //     out.write("CyanPixel found at=" + x + "," + y);
                  //     out.newLine();

                  // }
                  if((color.getRed() + color.getGreen() + color.getBlue()) != 0){
                	  out.write("At x:" + x + " y:" + y + " Color is: " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue());
                	  out.newLine();
                  }
                }
                out.newLine();
                out.write("**********************************************************");
                if(y != (image1.getHeight() - 1)){
                	out.newLine();
                	out.newLine();
                }
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}


