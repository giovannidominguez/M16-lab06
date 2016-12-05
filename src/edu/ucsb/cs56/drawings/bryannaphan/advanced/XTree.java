package edu.ucsb.cs56.drawings.bryannaphan.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;

/**
   A House
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class XTree extends Tree implements Shape
{
    public XTree(double x, double y, double width, double height)
    {
		// construct the basic tree shell
		super(x, y, width, height);
		
		// get the GeneralPath that we are going to append stuff to
		GeneralPath gp = this.get();
		
		double radius = width * 0.2; 
		
		Ellipse2D.Double ornament1 =
		    new Ellipse2D.Double(x - radius/2.0, y + height * 0.3, radius, radius);

		Ellipse2D.Double ornament2 =
		    new Ellipse2D.Double(x + width/3.0/5.0, y + height * 0.55, radius, radius);

		Ellipse2D.Double ornament3 =
		    new Ellipse2D.Double(x - width/2.0/1.5, y + height * 0.7, radius, radius);	
		


		// add the ornaments to the tree
        GeneralPath wholeTree = this.get();
        wholeTree.append(ornament1, false);
        wholeTree.append(ornament2, false);
        wholeTree.append(ornament3, false); 
    }    
}
