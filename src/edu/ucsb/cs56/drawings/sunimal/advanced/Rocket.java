package edu.ucsb.cs56.drawings.sunimal.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A vector drawing of a rocket that implements the Shape interface, and so
 * can be drawn, as well as rotated, scaled, etc.
 * 
 * @author sunimal E
 * @version for CS56, W16, UCSB
 * 
 */
public class Rocket extends GeneralPathWrapper implements Shape {
	/**
	 * Constructor
	 * 
	 * @param x
	 *            x coord of lower left corner of upper left of the body
	 * @param y
	 *            y coord of lower left corner of upper left of the body
	 * @param width
	 *            width of the rocket
	 * @param height
	 *            of Rocket (including the body and top)
	 */
	public Rocket(double x, double y, double width, double height) {

		// Rather than having to scale at the end, we can just
		// draw things the right way to begin with, using the
		// x, y, width and height. If you haven't already
		// hard coded a particular drawing, this may be an easier
		// way.

		
		// draw a rectangle for the body
		double rocketBodyHeight=height*0.5;
		double rocketBodyWidth=width*0.5;
		
		Rectangle2D.Double rocketBody = new Rectangle2D.Double(x, y, rocketBodyWidth,rocketBodyHeight);
		
		//draw the triangle for the the tip
		
		Line2D.Double leftSide = new Line2D.Double(x-width*0.25, y, x + width*0.25, y-height*0.5);
		Line2D.Double rightSide = new Line2D.Double(x+width*0.75, y, x + width*0.25, y-height*0.5);
		Line2D.Double base = new Line2D.Double(x-width*0.25, y, x + width*0.75, y);
		// put the whole rocket together

		GeneralPath wholeRocket = this.get();
		wholeRocket.append(rocketBody, false);
		wholeRocket.append(leftSide, false);
		wholeRocket.append(rightSide, false);
		wholeRocket.append(base, false);
		
	}	
}
