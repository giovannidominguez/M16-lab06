package edu.ucsb.cs56.drawings.ijh.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class Rectangle extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Rectangle(double x, double y, double width, double height)
    {
        Rectangle2D.Double rect = new Rectangle2D.Double(x,y, width, height);
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        /* 
        double firstStoryHeight = .75 * height;
        double roofHeight = height - firstStoryHeight;
        
        double firstStoryUpperLeftY = y + roofHeight;
        
        // Make the first story
        
        Rectangle2D.Double firstStory = 
            new Rectangle2D.Double(x, firstStoryUpperLeftY ,
				   width, firstStoryHeight);
	
        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftRoof = 
            new Line2D.Double (x, y + roofHeight,
                               x + width/2.0, y);
	
        Line2D.Double rightRoof =
            new Line2D.Double (x + width/2.0, y,
                               x + width, y + roofHeight);
	
        // put the whole house together
        */
        GeneralPath wholerect = this.get();
        wholerect.append(rect, false);
	
        
    }
}
