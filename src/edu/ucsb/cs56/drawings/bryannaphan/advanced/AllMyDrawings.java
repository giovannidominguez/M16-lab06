package edu.ucsb.cs56.drawings.bryannaphan.advanced;

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
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /**
    @param g2 Parameter takes in a Graphics 2D object 
    Draws a picture with trees of different sizes, thickness and transformations
    */
    public static void drawPicture1(Graphics2D g2) {
		// label the drawing
		g2.drawString("A bunch of Trees by Bryanna Phan", 20,20);

		Tree greentree = new Tree(250,150,110,70);
		g2.setColor(Color.GREEN);
		g2.draw(greentree);

		// Add a thicker stroke
		Tree tree1 = new Tree(100,100,150,200);
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x00A86B)); // Jade Green 
		g2.draw(tree1); 

		Stroke thicker = new BasicStroke (7.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		Stroke original = g2.getStroke();
		g2.setStroke(thicker);
		Tree tree2 = new Tree(400,150,40,100);
		g2.setColor(new Color(0xAAF0D1)); // Magic Mint
		g2.draw(tree2); 

		Shape vert_flipped = ShapeTransforms.verticallyFlippedCopyOf(tree2);
		g2.draw(vert_flipped);

		Shape horiz_flipped = ShapeTransforms.horizontallyFlippedCopyOf(tree2);
		g2.draw(horiz_flipped);

		Shape horiz_vert_flipped = ShapeTransforms.verticallyFlippedCopyOf(horiz_flipped);
		g2.draw(horiz_vert_flipped);

		Shape h2 = ShapeTransforms.scaledCopyOfLL(tree1,0.5,0.5);
		h2 = ShapeTransforms.translatedCopyOf(h2,200,50);
		g2.setStroke(thick);
		g2.setColor(new Color(0x66DDAA)); // Aquamarine 
		g2.draw(h2);
    }
    
    /**
    @param g2 Parameter takes in a Graphics 2D object 
    Draws a picture with Christmas trees of different sizes, thickness and transformations
    */
    public static void drawPicture2(Graphics2D g2) {
		// label the drawing
		g2.drawString("A bunch of Christmas Trees by Bryanna Phan", 20,20);

		XTree xtree1 = new XTree(350,100,80,120);
		g2.setColor(new Color(0xFA6E79)); // Light Red Ochre
		Shape rotated = ShapeTransforms.rotatedCopyOf(xtree1, Math.PI/4.0);
		g2.draw(rotated);

		XTree xtree2 = new XTree(500,50,100,150);
		g2.setColor(Color.RED); 
		g2.draw(xtree2);

		// Add a thicker stroke
		XTree tree = new XTree(100,100,150,200);
		g2.setColor(new Color(0xFDBCB4)); // Melon 
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.draw(tree); 
    }

        /**
    @param g2 Parameter takes in a Graphics 2D object 
    Draw a picture with both Christmas trees and normal trees of different sizes, thickness and transformations
    */
    public static void drawPicture3(Graphics2D g2) {

		Tree tree1 = new Tree(40,130,50,80);
		g2.setColor(new Color(0x4F86F7)); // Blueberry 
		g2.draw(tree1);


		XTree tree2 = new XTree(250,170,50,80);
		g2.setColor(new Color(0x4F86F7)); // Blueberry 
		g2.draw(tree2);

		// Make a black tree that's half the size, 
		// and moved over 150 pixels in x direction
		Shape h2 = ShapeTransforms.scaledCopyOfLL(tree2,0.5,0.5);
		h2 = ShapeTransforms.translatedCopyOf(h2,100,0);
		g2.setColor(new Color(0x126180)); // Blue Saphire
		g2.draw(h2);
		
		// Here's a tree that's 4x as big (2x the original)
		// and moved over 150 more pixels to right.
		h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
		h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
		
		// Add a thicker stroke
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x5F9EA0)); // Cadet Blue
		g2.draw(h2); 
		

		XTree x1 = new XTree(150,240,70,80);
		g2.setColor(new Color(0x8F00FF)); 		
		// Rotate the second house 45 degrees around its center.
		Shape x2 = ShapeTransforms.rotatedCopyOf(x1, Math.PI/4.0);
		g2.draw(x2);

		// sign drawing! 
		g2.setStroke(orig);
		g2.setColor(new Color(0x4F86F7)); // Beau Blue
		g2.drawString("A bunch of Trees and Christmas Trees by Bryanna Phan", 20,20);
    }       
}
