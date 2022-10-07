package edu.school21.printer.logic;

import java.io.FileInputStream;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Logic {
	private static BufferedImage img;
    public static int[][] BMPImage(String pathImg, char white, char black) throws IOException {
		try {
			img = ImageIO.read(new FileInputStream(pathImg));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.err.println("Error: bad file/ Use a bmp-file.");
        }
	   int arrImage[][] = new int[img.getWidth()][img.getHeight()];

	   for (int x = 0; x < img.getWidth(); x++)
	   {
		   for (int y = 0; y < img.getHeight(); y++){
			   int color = img.getRGB(x, y);
			   if (color == Color.BLACK.getRGB()){
				   arrImage[x][y] = black;
			   }else if (color == Color.WHITE.getRGB()){
				   arrImage[x][y] = white;
			   }
		   }
	   }
	   return arrImage;
    }
}
