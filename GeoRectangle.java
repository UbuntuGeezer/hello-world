/*
 * GeoRectangle.java - rectangle class definition
 * 
 * This class demonstrates how instantiation works when referenced by
 * another class.
 * 
 * 
 * 
 */

// invoke necessary dependencies.


public class GeoRectangle {
	
	int length;		// length field
	int width;		// width field
	
	public static void GeoRectangle() {
		length = 1;
		width = 2;
	}	// end no params constructor
	
	public static void GeoRectangle(int i, int j){
		length = i;
		width = j;
	}	// end length width constructor
	
	public static setDims(int i, int j){
		length = i;
		width = j;
	}	// end setDims method

	public static void main (String[] args) {
		
	}	// empty main method; just implements class
	
}	// end GeoRectangle class

