package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class ReaganFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdDraw.setPenColor(Color.pink);
		StdDraw.setPenRadius(0.05);
		StdDraw.filledRectangle(0.0, 0.0, 1.0, 1.0);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.2, 0.2, 0.4);
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.line(0.6, 0.6, 0.2, 0.5);
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.line(0.1, 0.1, 1.0, 1.0);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledEllipse(0.7, 0.3, 0.2, 0.4);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.circle(0.9, 0.3, 0.4);
		
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.square(0.0, 1.0 , 0.5);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.line(0.0, 0.0, 1.0, 1.0);

	}

}
