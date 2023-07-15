/*
 * MyWMN.java - 4th instantiation example.
 * 
 * 
 * 
 */


// invoke dependencies.

import java.awt.*;
// local subdirectory contains GeoRectangle class definition


class MyWMN {
	
	public void MyWMN (){
	 GeoRectangle rect1;	// define 4 rectangles
	 GeoRectangle rect2 = new GeoRectangle();
	 GeoRectangle rect3;
	 GeoRectangle rect4;
}	// end MyWMN constructor

// Note: non-static method cannot be invoked by static method.
// this. reference only legal in non-static method.	
// even so, this.rect2 is not found...
public static void initVars( GeoRectangle aRect ){
	aRect.setDims(4,5);
}	// end initVars
		

//	public void main (String[] args) {		// main must be static or will not execute
	public static void main (String[] args) {		
		GeoRectangle rect = new GeoRectangle();
		System.out.println("rect immediately after constructor invoked...");
		rect.showDims();
//		rect2.setDims(4,5);		// won't compile, rect2 not known
//		this.rect2.setDims(4,5);	// won't compile, can't use this. in static context
		GeoRectangle rect2 = new GeoRectangle();
		// MyWMN adds the following line...
		rect2 = rect;			// create new instance
		initVars(rect2);			// initialize var rect2

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
	
}	// end MyWMN class

