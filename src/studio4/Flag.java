package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.setPenRadius(0.05);
		StdDraw.filledRectangle(0.0, 0.0, 1.0, 1.0);
		
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.2, 0.2, 0.4);
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.line(0.6, 0.6, 0.2, 0.5);
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.line(0.1, 0.1, 1.0, 1.0);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.circle(0.1, 0.1, 0.3);
		
		
		
	}
}