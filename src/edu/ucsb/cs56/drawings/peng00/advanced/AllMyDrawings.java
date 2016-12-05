package edu.ucsb.cs56.drawings.peng00.advanced;

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
 * JHP
 * @version for UCSB CS56, W16
 */

public class AllMyDrawings {
	/**
	 * Draw a picture with a few houses
	 */

	public static void drawPicture1(Graphics2D g2) {

		Donut d1 = new Donut(210,320,40);
		g2.setColor(Color.GREEN);
		g2.draw(d1);

		Shape d2 = ShapeTransforms.scaledCopyOfLL(d1, 0.5, 0.5);
		d2 = ShapeTransforms.translatedCopyOf(d1, 150, 0);
		g2.setColor(Color.RED);
		g2.draw(d2);

		
		d2 = ShapeTransforms.scaledCopyOfLL(d2, 3, 3);
		d2 = ShapeTransforms.translatedCopyOf(d2, 230, 0);

		
		Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(d2);

		// Draw two donuts with stick
		
		DonutWithStick dws1 = new DonutWithStick(100,100,50);
		DonutWithStick dws2 = new DonutWithStick(400,400, 150);

		g2.draw(dws1);
		g2.setColor(new Color(0x8F00FF));
		g2.draw(dws2);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

		g2.setStroke(orig);
		g2.setColor(Color.BLACK);
		g2.drawString("A few Donuts by JHP", 20, 20);
	}

	/**
	 * Draw a picture with a few Donuts
	 */
	public static void drawPicture2(Graphics2D g2) {

		// Draw some coffee cups.
		
		DonutWithStick dws1= new DonutWithStick(550,600,200);
		g2.setColor(Color.RED);
		g2.draw(dws1);
		Shape dws3 = ShapeTransforms.rotatedCopyOf(dws1,Math.PI / 3.0);
		g2.draw(dws3);
	
		Shape dws4 = ShapeTransforms.verticallyFlippedCopyOf(dws1);
		g2.draw(dws4);
		
		

		g2.drawString("A bunch of Donuts by JHP", 20, 20);
		
	}

	/**
	 * (Draw a different picture with a few houses and coffee cups)
	 * Draw a different picture with a few Donuts of all kinds
	 */

	public static void drawPicture3(Graphics2D g2) {

		// label the drawing

		g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20, 20);

		// Draw some coffee cups.

		CoffeeCup large = new CoffeeCup(100, 50, 225, 150);
		CoffeeCup smallCC = new CoffeeCup(20, 50, 40, 30);

		g2.setColor(Color.RED);
		g2.draw(large);
		g2.setColor(Color.GREEN);
		g2.draw(smallCC);
		
		// my drawing
		g2.drawString("A bunch of donuts by JHP", 20, 20);
		Donut d1 = new Donut(100,300,80);

		
		g2.setColor(Color.BLUE);
		g2.draw(d1);

		
		DonutWithStick dws1= new DonutWithStick(300,300,150);
		g2.setColor(Color.GREEN);
		g2.draw(dws1);
		
		Shape dws2 = ShapeTransforms.rotatedCopyOf(dws1, Math.PI / 2.0);
		g2.draw(dws2);

		DonutWithStick dws3= new DonutWithStick(600,500,120);
		g2.setColor(Color.RED);
		
		Shape dws4 = ShapeTransforms.rotatedCopyOf(dws1, Math.PI / 4.0);
		g2.draw(dws4);
		
	}

}
