package edu.ucsb.cs56.drawings.sunimal.advanced;

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

public class AllMyDrawings {
	/**
	 * Draw a picture with a few houses
	 */

	public static void drawPicture1(Graphics2D g2) {

		Rocket r1 = new Rocket(100, 250, 50, 150);
		g2.setColor(Color.CYAN);
		g2.draw(r1);

		// Make a black rocket that's half the size,
		// and moved over 150 pixels in x direction

		Shape r2 = ShapeTransforms.scaledCopyOfLL(r1, 0.5, 0.5);
		r2 = ShapeTransforms.translatedCopyOf(r2, 150, 0);
		g2.setColor(Color.BLACK);
		g2.draw(r2);

		// Here's a rocket that's 4x as big (2x the original)
		// and moved over 150 more pixels to right.
		r2 = ShapeTransforms.scaledCopyOfLL(r2, 4, 4);
		r2 = ShapeTransforms.translatedCopyOf(r2, 150, 0);

		// We'll draw this with a thicker stroke
		Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

		// for hex colors, see (e.g.)
		// http://en.wikipedia.org/wiki/List_of_colors
		// #002FA7 is "International Klein Blue" according to Wikipedia
		// In HTML we use #, but in Java (and C/C++) its 0x

		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(r2);

		// Draw two rockets with booster

		RocketWithBooster rb1 = new RocketWithBooster(50, 350, 40, 240);
		RocketWithBooster rb2 = new RocketWithBooster(200, 350, 200, 400);

		g2.draw(rb1);
		g2.setColor(new Color(0x8F00FF));
		g2.draw(rb2);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

		g2.setStroke(orig);
		g2.setColor(Color.BLACK);
		g2.drawString("A few Rockets by Sunimal", 20, 20);
	}

	/**
	 * Draw a picture with a few houses and coffee cups
	 */
	public static void drawPicture2(Graphics2D g2) {

		// Draw some coffee cups.
		
		RocketWithBooster rb1= new RocketWithBooster(250,300,50,150);
		g2.setColor(Color.RED);
		g2.draw(rb1);
		
		//Shape rb2 = ShapeTransforms.rotatedCopyOf(rb1, Math.PI / 4.0);
		//g2.draw(rb2);
		
		Shape rb3 = ShapeTransforms.verticallyFlippedCopyOf(rb1);
		g2.draw(rb3);
		
		Shape rb4 = ShapeTransforms.rotatedCopyOf(rb1,Math.PI / 2.0);
		g2.draw(rb4);
		/*	
		CoffeeCup large = new CoffeeCup(100, 50, 225, 150);
		CoffeeCup smallCC = new CoffeeCup(20, 50, 40, 30);
		CoffeeCup tallSkinny = new CoffeeCup(20, 150, 20, 40);
		CoffeeCup shortFat = new CoffeeCup(20, 250, 40, 20);

		g2.setColor(Color.RED);
		g2.draw(large);
		g2.setColor(Color.GREEN);
		g2.draw(smallCC);
		g2.setColor(Color.BLUE);
		g2.draw(tallSkinny);
		g2.setColor(Color.MAGENTA);
		g2.draw(shortFat);
		*/
		/*
		House h1 = new House(100, 250, 50, 75);
		g2.setColor(Color.CYAN);
		g2.draw(h1);

		// Make a black house that's half the size,
		// and moved over 150 pixels in x direction
		Shape h2 = ShapeTransforms.scaledCopyOfLL(h1, 0.5, 0.5);
		h2 = ShapeTransforms.translatedCopyOf(h2, 150, 0);
		g2.setColor(Color.BLACK);
		g2.draw(h2);

		// Here's a house that's 4x as big (2x the original)
		// and moved over 150 more pixels to right.
		h2 = ShapeTransforms.scaledCopyOfLL(h2, 4, 4);
		h2 = ShapeTransforms.translatedCopyOf(h2, 150, 0);

		// We'll draw this with a thicker stroke
		Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

		// for hex colors, see (e.g.)
		// http://en.wikipedia.org/wiki/List_of_colors
		// #002FA7 is "International Klein Blue" according to Wikipedia
		// In HTML we use #, but in Java (and C/C++) its 0x

		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(h2);

		// Draw two houses with Windows

		HouseWithWindows hw1 = new HouseWithWindows(50, 350, 40, 75);
		HouseWithWindows hw2 = new HouseWithWindows(200, 350, 200, 100);

		g2.draw(hw1);
		g2.setColor(new Color(0x8F00FF));

		// Rotate the second house 45 degrees around its center.
		Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI / 4.0);

		g2.draw(hw3);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

		g2.setStroke(orig);
		g2.setColor(Color.BLACK);
		g2.drawString("A bunch of Coffee Cups and a few houses by Phill Conrad", 20, 20);
		*/
		g2.drawString("A bunch of rockets by Sunimal", 20, 20);
		
	}

	/**
	 * (Draw a different picture with a few houses and coffee cups)
	 * Draw a different picture with a few Rocket and Rocket with booster
	 */

	public static void drawPicture3(Graphics2D g2) {

		// label the drawing
/*
		g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20, 20);

		// Draw some coffee cups.

		CoffeeCup large = new CoffeeCup(100, 50, 225, 150);
		CoffeeCup smallCC = new CoffeeCup(20, 50, 40, 30);

		g2.setColor(Color.RED);
		g2.draw(large);
		g2.setColor(Color.GREEN);
		g2.draw(smallCC);
		*/
		// my drawing
		g2.drawString("A bunch of rockets by Sunimal", 20, 20);
		Rocket big = new Rocket(200, 300, 50,200 );

		
		g2.setColor(Color.RED);
		g2.draw(big);

		
		RocketWithBooster rock= new RocketWithBooster(300,300,50,200);
		g2.setColor(Color.BLUE);
		g2.draw(rock);
		
		Shape rock1 = ShapeTransforms.rotatedCopyOf(rock, Math.PI / 4.0);
		g2.draw(rock1);

		RocketWithBooster rock2= new RocketWithBooster(50,50,50,200);
		g2.setColor(Color.MAGENTA);
		//g2.draw(rock2);
		
		Shape rock3 = ShapeTransforms.rotatedCopyOf(rock2, Math.PI / 4.0);
		g2.draw(rock3);
		
	}

}
