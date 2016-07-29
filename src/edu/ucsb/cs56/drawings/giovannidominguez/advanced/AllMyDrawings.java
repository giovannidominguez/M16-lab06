package edu.ucsb.cs56.drawings.giovannidominguez.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @author Giovanni Dominguez
 * @version for UCSB CS56, M16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few remotes
     */
    
    public static void drawPicture1(Graphics2D g2) {
	Remote r1 = new Remote(100,250, 50, 70);
	g2.setColor(Color.CYAN);g2.draw(r1);

	// Make a black remote that's half the size, 
	// and moved over 150 pixels in x direction

	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	g2.setColor(Color.BLACK); g2.draw(r2);
	
	// Here's a remote that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	r2 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(r2); 
	
	// Draw two remote with up/down buttons


	//example above
	RemoteWithVolume rv1 = new RemoteWithVolume(50, 350, 100, 85);
	RemoteWithVolume rv2 = new RemoteWithVolume(200,350,200,100);
	g2.draw(rv1);
	g2.setColor(new Color(0x8F00FF)); 
	 g2.draw(rv2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few remotes by Giovanni Dominguez", 20,20);
    }
    
    
    /** Draw a picture with a remotes with volume
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some remotes with volumes
	
	RemoteWithVolume large = new RemoteWithVolume(100,50,225,150);
	RemoteWithVolume smallCC = new RemoteWithVolume(20,50,40,30);
	RemoteWithVolume tallSkinny = new RemoteWithVolume(20,150,20,40);
	RemoteWithVolume shortFat = new RemoteWithVolume(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Remote r1 = new Remote(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(r1);
	

	// Make a black Remote that's half the size, 
	// and moved over 150 pixels in x direction
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	g2.setColor(Color.BLACK); g2.draw(r2);
	
	// Here's a Remote that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	r2 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(r2); 
	
	// Draw two Remotes with volume controls
	
	RemoteWithVolume hw1 = new RemoteWithVolume(50,350,40,75);
	RemoteWithVolume hw2 = new RemoteWithVolume(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second Remote 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of remotes and a few Remotes with volume controls bY Giovanni Dominguez", 20,20);
    }
    
    /** Draw a different picture with a few Remotes and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Remotes with Volume controls by Giovanni Dominguez", 20,20);
	
	
	// Draw some coffee cups.
	
	RemoteWithVolume large = new RemoteWithVolume(100,50,225,150);
	RemoteWithVolume smallCC = new RemoteWithVolume(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
