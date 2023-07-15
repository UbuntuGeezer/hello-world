/*
 * MyWML.java - 2nd instantiation example.
 * 
 * 
 * 
 */


// invoke dependencies.

import java.awt.*;
// local subdirectory contains GeoRectangle class definition


class MyWML {
	
	public void MyWML (){
	 GeoRectangle rect1;	// define 4 rectangles
	 GeoRectangle rect2 = new GeoRectangle();
	 GeoRectangle rect3;
	 GeoRectangle rect4;
}	// end MyWMK constructor

// Note: non-static method cannot be invoked by static method.
// this. reference only legal in non-static method.	
// even so, this.rect2 is not found...
public void initVars();{
	this.rect2.setDims(4,5);
}	// end initVars
		
//	public static void main (String[] args) {
	public void main (String[] args) {
		
		GeoRectangle rect = new GeoRectangle();
		System.out.println("rect immediately after constructor invoked...");
		rect.showDims();
//		rect2.setDims(4,5);		// won't compile, rect2 not known
//		this.rect2.setDims(4,5);	// won't compile, can't use this. in static context
//		rect2 = new GeoRectangle(4,5);
		initVars();			// initialize var rect2

		System.out.println("rect2 immediately after rect2 values set...");
		rect2.showDims();
		System.out.println("rect immediately after rect2 values set...");
		rect.showDims();
		rect.setDims(3,4);
		System.out.println(" rect after rect.setDims reference...");
		rect.showDims();
		System.out.println(" rect 2 after rect.setDims invoked...");
		rect2.showDims();
	}	// end main method
	
}	// end MyWMK class

