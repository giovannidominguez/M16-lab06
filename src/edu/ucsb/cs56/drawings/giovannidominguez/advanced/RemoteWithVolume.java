package edu.ucsb.cs56.drawings.giovannidominguez.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
   A Remote
      
   @author Phill Conrad
   @author Giovanni Dominguez
   @version for CS56, M16, UCSB
   
*/
public class RemoteWithVolume extends Remote implements Shape
{
    /**
     * Constructor for objects of class Remote
     */
    public RemoteWithVolume(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	double w2 = width/3;
	double left_start = (w2)/2;
	double volume_height = y+.75*height;
	

	
	
	Line2D.Double up_left = new Line2D.Double(x+left_start, volume_height , x+7*(w2)/10, y+.5*height);
	Line2D.Double up_right = new Line2D.Double(x+7*(w2)/10, y+.5*height , x+w2, volume_height);
	Line2D.Double across = new Line2D.Double(x+left_start, volume_height, x+w2, volume_height);
	
	Line2D.Double up_left2 = new Line2D.Double(x+(w2)*2, y+.5*height, x+(w2)*2+(w2)/6, volume_height);
	Line2D.Double up_right2 = new Line2D.Double(x+(w2)*2+(w2)/6, volume_height , x+(w2)*3-(w2)/2, y+.5*height);
	Line2D.Double across2 = new Line2D.Double(x+(w2)*2, y+.5*height, x+left_start+(w2)*2, y+.5*height);
	

	
        GeneralPath wholeHouse = this.get();
		wholeHouse.append(up_left, false);
        wholeHouse.append(up_right, false);
		wholeHouse.append(across, false);
		wholeHouse.append(up_left2, false);
        wholeHouse.append(up_right2, false);
		wholeHouse.append(across2, false);
		
	
    }    
}
