package org.java.collectionEx;

import java.util.Iterator;
import java.util.Vector;

class Point {
	
	int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}

	
public class PointMain {
	
	public static void main(String[] args) {
		
		Vector<Point> xyz=new Vector();
		xyz.add(new Point(11,1));
		xyz.add(new Point(22,2));
		xyz.add(new Point(33,3));
		xyz.add(new Point(44,4));
		xyz.add(new Point(55,5));
		
		for(Point a:xyz)
		{
			System.out.println(a.toString());
			
		}
		
		
		Iterator<Point> pu=xyz.iterator();
		while(pu.hasNext())
		{
			System.out.println(pu.next().toString());
			
		}
		
		
		
		
	}
	
	
	
	}
	
