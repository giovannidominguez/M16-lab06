package edu.ucsb.cs56.drawings.joelbagan.advanced;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

/**
 * A class for a GameBoy that has a floor, mountain, and a cloud on its display
 * Implements Shape so it can be transformed easily
 * Uses the GeneralPath from superclass to append the shapes made in subclass
 *
 * @author Joel
 * @version CS56 M16 UCSB
 */
public class GameBoyWithDisplay extends GameBoy implements Shape {
    public GameBoyWithDisplay(double x, double y, double width, double height) {
        super(x, y, width, height);
        GeneralPath gp = this.get();
        makeFloor(x, y, width, height, gp);
        makeCloud(x, y, width, height, gp);
        makeMountain(x, y, width, height, gp);
        this.set(gp);
    }

    /**Method to make the mountain on the GameBoy display area
     * @param x x coordinate for the GameBoy
     * @param y y coordinate for the GameBoy
     * @param width width of the GameBoy
     * @param height height of the GameBoy
     * @param gp GeneralPath that the mountain is appended to
     */
    private void makeMountain(double x, double y, double width, double height, GeneralPath gp) {
        GeneralPath mountain = new GeneralPath();
        mountain.moveTo(x + width / 2, y + height / 2.5);
        mountain.lineTo(x + 5 * width / 8, y + height / 2.9);
        mountain.lineTo(x + 3 * width / 4, y + height / 2.5);

        gp.append(mountain, false);
    }

    /**
     * Method to make the cloud on the GameBoy display area
     * @param x x coordinate for the GameBoy
     * @param y y coordinate for the GameBoy
     * @param width width of the GameBoy
     * @param height height of the GameBoy
     * @param gp GeneralPath that the mountain is appended to
     */
    private void makeCloud(double x, double y, double width, double height, GeneralPath gp) {
        Shape cloud = new Ellipse2D.Double(x + width / 3.5, y + height / 6, width / 3, height / 9);
        gp.append(cloud, false);
    }

    /**
     * Method to make the floor on the GameBoy display area
     * @param x x coordinate for the GameBoy
     * @param y y coordinate for the GameBoy
     * @param width width of the GameBoy
     * @param height height of the GameBoy
     * @param gp GeneralPath that the mountain is appended to
     */
    private void makeFloor(double x, double y, double width, double height, GeneralPath gp) {
        GeneralPath floor = new GeneralPath();
        floor.moveTo(x + width / 4, y + height / 2.5);
        floor.lineTo(x + 3 * width / 4, y + height / 2.5);
        gp.append(floor, false);
    }
}
