package edu.ucsb.cs56.drawings.peng00.advanced;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

public class DonutWithStick extends Donut implements Shape {

	public DonutWithStick(double x, double y, double radius) {
		super(x, y, radius);
		Line2D.Double stick1 = new Line2D.Double(x-radius*1.5, y, x-radius, y);
		Line2D.Double stick2 = new Line2D.Double(x-radius*0.25, y, x+radius*0.25, y);
		Line2D.Double stick3 = new Line2D.Double(x+radius*1.5, y, x+radius, y);
		GeneralPath dws = this.get();
		dws.append(stick1, false);
		dws.append(stick2, false);
		dws.append(stick3, false);
		
	}

}
