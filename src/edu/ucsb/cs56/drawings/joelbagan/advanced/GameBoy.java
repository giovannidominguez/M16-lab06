package edu.ucsb.cs56.drawings.joelbagan.advanced;

import edu.ucsb.cs56.drawings.joelbagan.simple.Circle;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 * A vector drawing of a GameBoy that implements
 * the Shape interface, and so can be drawn, as well as
 * rotated, scaled, etc.
 *
 * @author Joel Bagan
 * @version for CS56, W16, UCSB
 */
public class GameBoy extends GeneralPathWrapper implements Shape {
    /**
     * Constructor that creates a hardcoded GameBoy, then translates and scales
     * according to parameters
     *
     * @param x      x coord of lower left corner of gameboy
     * @param y      y coord of lower left corner of gameboy
     * @param height of gameboy (Ratio of height to width = 148:90)
     */
    public GameBoy(double x, double y, double width, double height) {

        //Using constants to make a hard coded GameBoy to scale later
        final double ORIG_ULX = 100;
        final double ORIG_ULY = 100;
        final double ORIG_HEIGHT = 150;
        final double ORIG_WIDTH = 90;
        GeneralPath image = new GeneralPath();
        makeOutline(image);
        makeScreen(image);
        makeButtons(image);
        makeDPad(image);
        Shape s = ShapeTransforms.translatedCopyOf(image, -ORIG_ULX + x, -ORIG_ULY + y);
        s = ShapeTransforms.scaledCopyOf(s, width / ORIG_WIDTH, height / ORIG_HEIGHT);
        this.set(new GeneralPath(s));
    }

    /**
     * Method to create the outline of the Gameboy
     *
     * @param image the GeneralPath that the outline is appended to
     */
    private void makeOutline(GeneralPath image) {
        Shape outline = new Rectangle2D.Double(100, 100, 90, 150);
        image.append(outline, false);
    }

    /**
     * Method to create the screen of the Gameboy
     *
     * @param image the GeneralPath that the screen is appended to
     */
    private void makeScreen(GeneralPath image) {
        Shape screen = new Rectangle2D.Double(122.5, 122.5, 45, 45);
        image.append(screen, false);
    }

    /**
     * Method to create the buttons on the GameBoy
     * Utilizes the Circle class defined in .../joelbagan/simple
     *
     * @param image the GeneralPath that the buttons are appended to
     */
    private void makeButtons(GeneralPath image) {
        Shape aButton = new Circle(160, 210, 5);
        Shape bButton = new Circle(170, 200, 5);

        Shape startButton = new RoundRectangle2D.Double(130, 240, 9, 3, 3, 3);
        Shape selectButton = ShapeTransforms.translatedCopyOf(startButton, 20, 0);
        image.append(startButton, false);
        image.append(selectButton, false);
        image.append(aButton, false);
        image.append(bButton, false);
    }

    /**
     * Method to create the DPad on the GameBoy
     * Creates one quarter of the DPad and then copies, rotates, and translates
     * to create the other 3 sides
     *
     * @param image the GeneralPath that the DPad is appended to
     */
    private void makeDPad(GeneralPath image) {
        GeneralPath DPadLeft = new GeneralPath();
        DPadLeft.moveTo(122.5, 200);
        DPadLeft.lineTo(122.5 + 6, 200);
        DPadLeft.moveTo(122.5, 200);
        DPadLeft.lineTo(122.5, 200 + 6);
        DPadLeft.lineTo(122.5 + 6, 200 + 6);

        Shape DpadTop = ShapeTransforms.rotatedCopyOf(DPadLeft, Math.PI / 2);
        DpadTop = ShapeTransforms.translatedCopyOf(DpadTop, 6, -6);

        Shape DpadRight = ShapeTransforms.rotatedCopyOf(DpadTop, Math.PI / 2);
        DpadRight = ShapeTransforms.translatedCopyOf(DpadRight, 6, 6);

        Shape DPadBottom = ShapeTransforms.rotatedCopyOf(DpadRight, Math.PI / 2);
        DPadBottom = ShapeTransforms.translatedCopyOf(DPadBottom, -6, 6);

        image.append(DPadLeft, false);
        image.append(DpadTop, false);
        image.append(DpadRight, false);
        image.append(DPadBottom, false);
    }
}
