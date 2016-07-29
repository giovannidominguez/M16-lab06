package edu.ucsb.cs56.drawings.sunimal.advanced;

import java.awt.Shape; 
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class RocketWithBooster extends Rocket implements Shape {

	/**
	 * Constructor for objects of class RocketWithBooster
	 */
	public RocketWithBooster(double x, double y, double width, double height) {
		// construct the basic Rocket
		super(x, y, width, height);

		// get the GeneralPath that we are going to append stuff to
		GeneralPath gp = this.get();

		Line2D.Double left = new Line2D.Double(x, y+height*0.5, x - width*0.5, y+height*0.75);
		Line2D.Double right = new Line2D.Double(x+width*0.5, y+height*0.5, x + width, y+height*0.75);
		Line2D.Double bot = new Line2D.Double(x-width*0.5, y+height*0.75, x + width, y+height*0.75);

		
		// Look up the meaning of the second parameter of append
		// (Hint--is a method of "GeneralPath")

		GeneralPath wholeHouse = this.get();
		wholeHouse.append(left, false);
		wholeHouse.append(right, false);
		wholeHouse.append(bot, false);
	}
}
