package edu.ucsb.cs56.drawings.bryannaphan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class Tree extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Tree(double x, double y, double width, double height)
    {
        // make the triangle for the tree. Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftBranch = 
            new Line2D.Double (x, y, x - width/2.0, y + height);
  
        Line2D.Double rightBranch =
            new Line2D.Double (x, y, x + width/2.0, y + height);
  
        // lines have to be connected
        // we have to start from right branch then go to the left! 
        Line2D.Double bottomLine =
          new Line2D.Double (x + width/2.0, y + height, x + width/2.0 - width, y + height);
  
        Rectangle2D.Double stump = 
          new Rectangle2D.Double(x - width/2.0/2.0, y + height,
          width/2.0, height * 0.2);
        
        // put the whole tree together
        GeneralPath wholeTree = this.get();
        wholeTree.append(leftBranch, false);
        wholeTree.append(rightBranch, false);   
        wholeTree.append(bottomLine, true);
        wholeTree.append(stump, false);

    }
}
