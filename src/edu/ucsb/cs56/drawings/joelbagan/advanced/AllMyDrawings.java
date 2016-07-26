package edu.ucsb.cs56.drawings.joelbagan.advanced;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

import java.awt.*;

/**
 * A class with static methods for drawing various pictures
 *
 * @author Joel Bagan
 * @version for UCSB CS56, W16
 */

public class AllMyDrawings {
    /**
     * Draw a picture with a few GameBoys
     */

    public static void drawPicture1(Graphics2D g2) {

        GameBoy gb1 = new GameBoy(10, 50, 50, 75);
        g2.setColor(Color.BLUE);
        g2.draw(gb1);

        Shape gb2 = ShapeTransforms.scaledCopyOfLL(gb1, 0.5, 0.5);
        gb2 = ShapeTransforms.translatedCopyOf(gb2, 150, 0);
        g2.setColor(Color.BLACK);
        g2.draw(gb2);

        gb2 = ShapeTransforms.scaledCopyOfLL(gb2, 4, 4);
        gb2 = ShapeTransforms.translatedCopyOf(gb2, 150, 50);

        Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

        Stroke orig = g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(gb2);

        GameBoyWithDisplay gd1 = new GameBoyWithDisplay(100, 130, 100, 200);
        GameBoyWithDisplay gd2 = new GameBoyWithDisplay(210, 200, 100, 200);

        g2.setColor(Color.cyan);
        g2.draw(gd1);
        g2.setColor(new Color(0xFF25BF));
        g2.draw(gd2);

        g2.setStroke(orig);
        g2.setColor(Color.BLACK);
        g2.drawString("An artful arrangement of GameBoys by Joel Bagan", 20, 20);
    }

    /**
     * Draw a picture of some GameBoys and GameBoys with displays
     */
    public static void drawPicture2(Graphics2D g2) {

        GameBoy top = new GameBoy(320, 10, 100, 100);
        GameBoy right = new GameBoy(600, 240, 40, 80);
        GameBoy bottom = new GameBoy(320, 300, 100, 180);
        GameBoy left = new GameBoy(10, 240, 40, 80);

        g2.setColor(Color.RED);
        g2.draw(top);
        g2.setColor(Color.GREEN);
        g2.draw(right);
        g2.setColor(Color.BLUE);
        g2.draw(bottom);
        g2.setColor(Color.MAGENTA);
        g2.draw(left);

        GameBoyWithDisplay gbd1 = new GameBoyWithDisplay(100, 250, 50, 75);
        g2.setColor(Color.green);
        g2.draw(gbd1);

        Shape gbd2 = ShapeTransforms.scaledCopyOfLL(gbd1, 0.5, 0.5);
        gbd2 = ShapeTransforms.translatedCopyOf(gbd2, 150, 0);
        gbd2 = ShapeTransforms.rotatedCopyOf(gbd2, Math.PI);
        g2.setColor(Color.BLACK);
        g2.draw(gbd2);

        // Here's a house that's 4x as big (2x the original)
        // and moved over 150 more pixels to right.
        gbd2 = ShapeTransforms.scaledCopyOfLL(gbd2, 4, 4);
        gbd2 = ShapeTransforms.translatedCopyOf(gbd2, 150, 0);

        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

        Stroke orig = g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(gbd2);

        // Draw two houses with Windows

        GameBoyWithDisplay gbd4 = new GameBoyWithDisplay(50, 350, 40, 75);
        GameBoyWithDisplay gbd5 = new GameBoyWithDisplay(200, 350, 200, 100);

        g2.draw(gbd4);
        g2.setColor(new Color(0x8F00FF));

        // Rotate the second house 45 degrees around its center.
        Shape hw3 = ShapeTransforms.rotatedCopyOf(gbd5, Math.PI / 4.0);
        hw3 = ShapeTransforms.translatedCopyOf(hw3, -50, -200);

        g2.draw(hw3);

        g2.setStroke(orig);
        g2.setColor(Color.BLACK);
        g2.drawString("A collection of GameBoys in the style of Monet by Joel Bagan", 20, 20);
    }

    /**
     * Draw a different picture with a few houses and coffee cups
     */
    public static void drawPicture3(Graphics2D g2) {
        // label the drawing
        g2.drawString("And here we observe some GameBoys in their natural habitat by Joel Bagan", 20, 20);

        GameBoyWithDisplay large = new GameBoyWithDisplay(200, 50, 225, 150);
        GameBoy small = new GameBoy(120, 150, 40, 30);

        g2.setColor(Color.RED);
        g2.draw(large);
        g2.setColor(Color.blue);
        g2.draw(small);
        g2.setColor(new Color(0x0B650C));
        for(int i = 0; i < 9; i++){
            GameBoy green = new GameBoy(90*i,300,90,150);
            g2.draw(green);
        }
    }
}