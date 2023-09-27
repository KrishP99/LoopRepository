import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WhileLoops extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		// Graphics2D g2 = (Graphics2D) g;
		// g2.setStroke(new BasicStroke(5));
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g.drawRect(10, 10, 750, 550);
		
		//2) Draw a horizontal line to bisect the Rectangle
		//3) Draw a vertical line to bisect the shape again
		int HorizontalX1 = 10;
		int HorizontalY1 = 280;
		int HorizontalX2 = 760;
		// Note: HorizontalX1 stays the same 
		int VerticalX1 = 380;
		int VerticalY1 = 10;
		int VerticalY2 = 560;
		// Note: Vertical Y1 stays the same
		
		// Draw concentric rectangles using lines, halving the lengths of the lines each time
		// Note: this only works until a certain value cuz integer division results in inaccuracy
		for (int i = 0; i < 4; i++) {
			g.drawLine(HorizontalX1, HorizontalY1, HorizontalX2, HorizontalY1);
			g.drawLine(VerticalX1, VerticalY1, VerticalX1, VerticalY2);
			HorizontalY1 /= 2;
			HorizontalX2 /= 2;
			
			VerticalX1 /= 2;
			VerticalY2 /=2;
		}		
		// Draw triangular thing in 2nd quadrant
		int x1 = 400, y1 = 20;
		int x2 = 740, y2 = 20;
		for(int i = 0; i < 20; i++) {
			g.drawLine(x1, y1, x2, y2);
			y2 += 10;
		}
		// Draw slashes in 3rd quadrant
		int xSlash1 = 20, ySlash1 = 300;
		int xSlash2 = 360;
		// Y-Coordinates are same
		for (int i = 0; i < 20; i++) {
			g.drawLine(xSlash1, ySlash1, xSlash2, ySlash1);
			ySlash1 += 10;
		}
		// Draw concentric-ish circles 
		int xCircle = 20, yCircle = 20;
		int radius = 250;
		for (int i = 0; i < 15; i++) {
			g.drawOval(xCircle, yCircle, radius, radius);
			radius -= 20;
			xCircle += 10;
			yCircle +=10;
		}
		// Draw concentric squares
		int xRect = 400, yRect = 20;
		int sideLength = 25;
		for (int i = 0; i < 4; i++) {
			g.drawRect(xRect, yRect, sideLength, sideLength);
			xRect += sideLength/2;
			yRect += sideLength/2;
			sideLength *= 2;
		}
	
		String sumString = "";
		int sum = 0;
		// Add numbers from 2 - 32
		for(int i = 2; i <= 10; i++) {
			if (i != 10) {
				sumString += i + " + ";
				sum += i;
			} else {
				sumString += 10;
				sum += 10;
			}
		}
		g.drawString(sumString + " = " + sum, 400, 260);
		// draw random Circles
		int randomRadius;
		int randomX;
		int randomY;
		for(int i = 0; i < 40; i++) {
			randomRadius = (int)(Math.random() * 51) + 50;
			randomX = (int)(Math.random()*290) + 380;
			randomY = (int)(Math.random() * 190) + 280;
			g.drawOval(randomX, randomY, randomRadius, randomRadius);
		}
		// write out random factorial from 5 - 10
		int randomNum = (int)(Math.random()*6) + 5;
		String factString ="";
		int product = 1;
		for(int i = randomNum; i>0; i--) {
			if (i != 1) {
				factString += i + " * ";
				product *= i;
			} else {
				factString += i + " = ";
			}
		}
		factString += product;
		g.drawString(factString, 20, 400);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		WhileLoops m = new WhileLoops();
	}
	
	public WhileLoops() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
