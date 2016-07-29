package edu.ucsb.cs56.drawings.ijh.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D; 

/**
   A Planner
      
   @author Issac Holguin
   @version for CS56, W16, UCSB
   
*/
public class Planner extends Rectangle implements Shape
{
    /**
     * Constructor for objects of class Planner
     */
    public Planner(double x, double y, double width, double height)
    {
	// construct the basic Planner
	super(x,y,width,height);


	// Creates Vertical lines
	GeneralPath gp = this.get();

	double spaceBetweenVerticalLines = width / 5;

	Line2D.Double line1 = new Line2D.Double(x+spaceBetweenVerticalLines, 
											y,
											x+spaceBetweenVerticalLines, 
											y+height);
	Line2D.Double line2 = new Line2D.Double(x+(spaceBetweenVerticalLines*2),
											y,
											x+(spaceBetweenVerticalLines*2),
											y+height);
	Line2D.Double line3 = new Line2D.Double(x+(spaceBetweenVerticalLines*3),
											y,
											x+(spaceBetweenVerticalLines*3),
											y+height);
	Line2D.Double line4 = new Line2D.Double(x+(spaceBetweenVerticalLines*4),
											y,
											x+(spaceBetweenVerticalLines*4),
											y+height);

	// Creates Horizontal Lines

	double headerSpace = height / 5;
	double spaceBetweenHorizontalLines = height / 10;

	Line2D.Double line5 = new Line2D.Double(x,
											y+headerSpace,
											x+width,
											y+headerSpace);

	Line2D.Double line6 = new Line2D.Double(x,
											y+spaceBetweenHorizontalLines*3,
											x+width,
											y+spaceBetweenHorizontalLines*3);
	Line2D.Double line7 = new Line2D.Double(x,
											y+spaceBetweenHorizontalLines*4,
											x+width,
											y+spaceBetweenHorizontalLines*4);
	Line2D.Double line8 = new Line2D.Double(x,
											y+spaceBetweenHorizontalLines*5,
											x+width,
											y+spaceBetweenHorizontalLines*5);
	Line2D.Double line9 = new Line2D.Double(x,
											y+spaceBetweenHorizontalLines*6,
											x+width,
											y+spaceBetweenHorizontalLines*6);
	Line2D.Double line10 = new Line2D.Double(x,
											y+spaceBetweenHorizontalLines*7,
											x+width,
											y+spaceBetweenHorizontalLines*7);
	Line2D.Double line11 = new Line2D.Double(x,
											y+spaceBetweenHorizontalLines*8,
											x+width,
											y+spaceBetweenHorizontalLines*8);
	Line2D.Double line12 = new Line2D.Double(x,
											y+spaceBetweenHorizontalLines*9,
											x+width,
											y+spaceBetweenHorizontalLines*9);

	double widthBorder = width / 30;
	double heightBorder = height / 15;

	Rectangle2D.Double border = new Rectangle2D.Double(x - widthBorder,
													y - heightBorder,
													width + widthBorder*2, 
													height + heightBorder*2);


	
	GeneralPath wholePlanner = this.get();
	wholePlanner.append(line1, false);
	wholePlanner.append(line2, false);
	wholePlanner.append(line3, false);
	wholePlanner.append(line4, false);
	wholePlanner.append(line5, false);
	wholePlanner.append(line6, false);
	wholePlanner.append(line7, false);
	wholePlanner.append(line8, false);
	wholePlanner.append(line9, false);
	wholePlanner.append(line10, false);
	wholePlanner.append(line11, false);
	wholePlanner.append(line12, false);
	wholePlanner.append(border, false);

    }    
}