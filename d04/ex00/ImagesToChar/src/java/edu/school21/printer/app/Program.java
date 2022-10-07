package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;
import java.io.IOException;

class Program {

    public static void main(String[] args)  throws IOException {
		if (args.length != 3) {
			System.out.println("Usage: <white pixel> <black pixel> <path to image>");
			System.exit(-1);
		}
		char white = args[0].charAt(0);
		char black = args[1].charAt(0);
		String pathImg = args[2];

		int[][] arrImg = Logic.BMPImage(pathImg, white, black);
		for (int x = 0; x < arrImg.length; x++){
			for(int y = 0; y < arrImg[x].length; y++){
				System.out.print((char)arrImg[y][x]);
			}
			System.out.print("\n");
		}
    }
}