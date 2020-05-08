/*
 * MyWMMP.java - 6th instantiation example.
 * 	5/8/20.
 * 
 * This example shows how a "basic" program with conventional main
 * and subroutine structure translates into java.
 * 
 */


// invoke dependencies.

import java.awt.*;
// local subdirectory contains GeoRectangle class definition


class MyWMP {
// note. The class definition that contains main cannot contain
// any non-static methods called by main. The way to program an App
// that has "subroutines" is to declare <reference class> container
// variables in the main class, but intantiate them in a method
// contained a method invoked by the constructor method.
// Then from "main" instantiate the <"main"> class, then invoke
// "subroutines" by reference to the <"main"> class methods.
//
//	class <"main" class	>
//		<reference class> var declarations
//	class <embedded class>
//		<constructor> code instantiates reference class vars
//		code to manipulate <reference class> vars
//		any other methods to emulate 'subroutines' in "main code"
//	<"main"> code
//		 instantiate <"main" class>var(s)
//		 'subroutine' calls are done by invoking method.<"main" class>var methods

//	 private GeoRectangle rect1;	// define 4 rectangles
//	 private GeoRectangle rect2 = new GeoRectangle();
	 private static GeoRectangle rect1;	// define 4 rectangles
	 private static GeoRectangle rect2 = new GeoRectangle();
	 private GeoRectangle rect3;
	private GeoRectangle rect4;

	// primary class constructor.
	
	public void MyWMP (){
		initProcess();			// initialize entire process
	}	// end MyWMP constructor

//	public void main (String[] args) {		// main must be static or will not execute
	public static void main (String[] args) {
			
		MyWMP call = new MyWMP();		// execute constructor
		call.Sub1();					// execute "subroutine" Sub1
		call.Sub2();					// execute "subroutine" Sub2
/*
 * 		GeoRectangle rect = new GeoRectangle();
 *		System.out.println("rect immediately after constructor invoked...");
 *	rect.showDims();
//		rect2.setDims(4,5);		// won't compile, rect2 not known
//		this.rect2.setDims(4,5);	// won't compile, can't use this. in static context
		// MyWMN adds the following line...
//		rect2 = rect;			// create new instance
//		initVars(rect2);			// initialize var rect2

		System.out.println("rect2 immediately after rect2 values set...");
		rect2.showDims();
		System.out.println("rect immediately after rect2 values set...");
		rect.showDims();
*/	//end extracted to Sub1

/*	begin extracted to Sub2
		rect.setDims(3,4);
		System.out.println(" rect after rect.setDims reference...");
		rect.showDims();
		System.out.println(" rect 2 after rect.setDims invoked...");
		rect2.showDims();
*/	// end extracted to Sub2

	}	// end main method

	private void initProcess(){
	}	// end initProcess
	
	private void Sub1(){

		GeoRectangle rect = new GeoRectangle();
		GeoRectangle rect2 = new GeoRectangle(4,5);

		System.out.println("in Sub1...");
		System.out.println("rect immediately after rect2 values set...");
		rect.showDims();

		System.out.println("rect2 immediately after rect2 values set...");
		rect2.showDims();

}	// end Sub1

private void Sub2(){
	// use this class vars rect1 and rect2 as rectangles	
		rect1 = new GeoRectangle();

		rect1.setDims(3,4);
		System.out.println(" rect after rect.setDims reference...");
		rect1.showDims();
		rect2.setDims(4,5);	// note: this destroys the rect1 values..
		System.out.println(" rect 2 after rect.setDims invoked...");
		rect2.showDims();
		System.out.println(" rect after rect2.setDims reference...");
		rect1.showDims();
		if( rect1 == rect2 ) {
			System.out.println( "rect1 == rect2" );
		}
		else{
			System.out.println( "rect1 != rect2" );
		}	// end else
			// end if

}	// end Sub2
// Note: non-static method cannot be invoked by static method.
// this. reference only legal in non-static method.	
// even so, this.rect2 is not found...
public void initVars( GeoRectangle aRect, int i, int j ){
	aRect.setDims(i,j);
	System.out.println("in initVars, passed rectangle dimensions...");
	aRect.showDims();
}	// end initVars
		

	
}	// end MyWMP class

