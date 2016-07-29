package edu.ucsb.cs56.drawings.ijh.advanced;

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
 * @author Issac Holguin
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Planners
     */
    
    public static void drawPicture1(Graphics2D g2) {

    Planner p1 = new Planner(50,50,125,75);
    g2.setColor(Color.BLUE);	g2.draw(p1);

    Planner p2 = new Planner(200,250,400,125);
	g2.setColor(Color.GREEN);    g2.draw(p2);
    	
	
	
	Shape s1 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	s1 = ShapeTransforms.translatedCopyOf(p1,0,150);
	g2.setColor(Color.BLACK); g2.draw(s1);

	
	s1 = ShapeTransforms.scaledCopyOfLL(p2,.4,.4);
	s1 = ShapeTransforms.translatedCopyOf(s1,0,-150);
	g2.draw(s1);
	
	g2.drawString("A few Planners. - Issac", 20,20);
    }
    
    
    /** Draw a picture with a Planners.
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some Planners
	
	Planner large = new Planner(100,50,225,250);
	Planner smallish = new Planner(420,50,40,80);
	Planner thinPlanner = new Planner(20,150,10,50);
	Planner perfect = new Planner(20,250,60,80);
	
	g2.setColor(Color.MAGENTA);     g2.draw(large);
	g2.setColor(Color.BLACK);       g2.draw(smallish);
	g2.setColor(Color.ORANGE);      g2.draw(thinPlanner);
	g2.setColor(Color.RED); 		g2.draw(perfect);
	
	Rectangle h1 = new Rectangle(100,250,50,75);
	g2.setColor(Color.CYAN);	 	g2.draw(h1);
	

	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); 		g2.draw(h2);
	
	
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	Planner hw1 = new Planner(50,350,40,75);
	Planner hw2 = new Planner(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 

	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/-4.0);
	hw3 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	g2.draw(hw3);
	
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("More Planners and Rectangles! - Issac H.", 20,20);
    }
  
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A Nice Arrangement of Planners - Issac H.", 20,20);
	
	
	Planner p1 = new Planner(70,50,60,40);
	Planner p2 = new Planner(20,50,40,30);
	Planner p3 = new Planner(140,50,90,50);
	Planner p4 = new Planner(250,50,120,70);
	Planner p5 = new Planner(390,50,150,80);
	Planner p6 = new Planner(390,150,150,80);
	Planner p7 = new Planner(250,150,120,70);
	Planner p8 = new Planner(140,150,90,50);
	Planner p9 = new Planner(20,150,40,30);
	Planner p10 = new Planner(70,150,60,40);

	g2.setColor(Color.RED);     g2.draw(p1);
	g2.setColor(Color.GREEN);   g2.draw(p2);
	g2.setColor(Color.BLUE);    g2.draw(p3);
	g2.setColor(Color.RED);     g2.draw(p4);
	g2.setColor(Color.GREEN);   g2.draw(p5);
	g2.setColor(Color.BLUE);    g2.draw(p6);
	g2.setColor(Color.RED);     g2.draw(p7);
	g2.setColor(Color.GREEN);   g2.draw(p8);
	g2.setColor(Color.BLUE);    g2.draw(p9);
	g2.setColor(Color.RED);     g2.draw(p10);
	
    }       
}
