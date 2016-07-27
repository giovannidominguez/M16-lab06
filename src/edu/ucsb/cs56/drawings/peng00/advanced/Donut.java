package edu.ucsb.cs56.drawings.peng00.advanced;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.peng00.simple.Circle;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class Donut extends GeneralPathWrapper implements Shape {
	


	public Donut(double x, double y, double radius) {

		
		Circle inner = new Circle(x,y, radius*0.25);
		Circle outer = new Circle(x,y, radius);
		
		GeneralPath donut = this.get();
		donut.append(inner, false);
		donut.append(outer, false);
		
	}


}
