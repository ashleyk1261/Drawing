import java.awt.Color;
import java.io.IOException;


public class DrawingInit {
  static public void main(String args[]) throws Exception {
    try {
      int width = 200, height = 200;
      String fileName = "C:\\Users\\Billy Kleinhomer\\Pictures\\Drawn By Java\\Scan";
      int repeat = 1;
      double fillPercentage = 20;

      // TYPE_INT_ARGB specifies the image format: 8-bit RGBA packed
      // into integer pixels
      for(int i = 0; i < repeat; i ++){ 
	      randomPixels.create(fileName, width, height, fillPercentage, Color.green, Color.blue);
	      //coordinatedDraw.singlePixel(fileName, width, height, 1, 1, Color.green, Color.red);
	      //randomPixels.create(fileName, width, height, 20, Color.DARK_GRAY, Color.red);
	      //randomPixels.create2Tone(fileName, width, height, 20, Color.YELLOW, Color.GREEN, Color.red.darker());
      }
      
      //pixelReader.read(fileName, 0);
      
    } catch (IOException ie) {
      ie.printStackTrace();
      System.out.println("Error caught.");
    }
  }
}
