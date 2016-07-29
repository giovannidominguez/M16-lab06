package edu.ucsb.cs56.drawings.giovannidominguez.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a rectangular remote that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Giovanni Dominguez
   @version for CS56, M16, UCSB
   
*/

public class Remote extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of remote
       @param y y coord of lower left corner of remote
       @param width width of the remote
       @param height of remote
    */

 public Remote(double x, double y, double width, double height)
    {

	
Rectangle2D.Double base =  new Rectangle2D.Double(x, y, width, height);

double w = .10*width;
double cTop = y + 0.5 * height;
double cHT =  0.25 * height;
Rectangle2D.Double reader = new Rectangle2D.Double(x+4.0*w, y, 2.0*w, .25*height);
Ellipse2D.Double circle_button = new Ellipse2D.Double(x+4.0*w, cTop, 2.0*w, cHT);
 

	GeneralPath wholeRemote = this.get();
        wholeRemote.append(base, false);
        
	wholeRemote.append(circle_button, false);

        wholeRemote.append(reader, false);      


    }
}
