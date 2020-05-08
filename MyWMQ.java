/*
 * MyWMMQP.java - 7th instantiation example.
 * 	5/8/20.
 * 
 * This example shows how a "basic" program with conventional main
 * and subroutine structure translates into java. It also demonstrates
 * instantiating a class that has some static fields, so they get
 * preserved across instances.
 * 
 */


// invoke dependencies.

import java.awt.*;
// local subdirectory contains GeoRectangle class definition


class MyWMQ {
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
// Note: even declaring rect1 and rect2 static does not preserve their
// individual length and width fields. The fields would have to be 
// insured to be NOT static in the GeoRectangle class to preserve their values
// across "new" instantiations or set Dims() method calls.
	 private GeoRect rect1;	// define 4 rectangles
	 private GeoRect rect2 = new GeoRect();
	 private GeoRect rect3;
	private GeoRect rect4;

	// primary class constructor.
	
	public void MyWMP (){
		initProcess();			// initialize entire process
	}	// end MyWMP constructor

//	public void main (String[] args) {		// main must be static or will not execute
	public static void main (String[] args) {
			
		MyWMQ call = new MyWMQ();		// execute constructor
		call.Sub1();					// execute "subroutine" Sub1
		call.Sub2();					// execute "subroutine" Sub2

	}	// end main method

	private void initProcess(){
	}	// end initProcess
	
	private void Sub1(){

		GeoRect rect = new GeoRect();
		GeoRect rect_m = new GeoRect();

		System.out.println("in Sub1...");
		System.out.println("rect immediately after constructor values set... [1,2]");
		rect.showDims();

		System.out.println("rect_m immediately after constructor values set... [1,2]");
		rect_m.showDims();

		rect.setDims(4,5);
		System.out.println("rect immediately after setDims(4,5);... [4,5]");
		rect.showDims();

		System.out.println("rect_m immediately after rect.setDims(4.5)... [1,2]");
		rect_m.showDims();
		
}	// end Sub1

private void Sub2(){
	// use this class vars rect1 and rect2 as rectangles	
		rect1 = new GeoRect();
		System.out.println("");
		System.out.println("in Sub2...");

		rect1.setDims(3,4);
		System.out.println(" rect1 after rect1.setDims reference...");
		rect1.showDims();
		// note: with GeoRectangle not declaring the width and length
		// fields as "static", the next line will cause rect1 to change
		// to width 4 length 5
		rect2.setDims(4,5);	// note: this destroys the rect1 values..
		System.out.println(" rect 2 after rect2.setDims invoked...");
		rect2.showDims();
		System.out.println(" rect1 after rect2.setDims reference...");
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
public void initVars( GeoRect aRect, int i, int j ){
	aRect.setDims(i,j);
	System.out.println("in initVars, passed rectangle dimensions...");
	aRect.showDims();
}	// end initVars
		

	
}	// end MyWMP class

