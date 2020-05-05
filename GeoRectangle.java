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
	
	public void GeoRectangle() {
		length = 1;
		width = 2;
	}	// end no params constructor
	
	public void GeoRectangle(int i, int j){
		length = i;
		width = j;
	}	// end length width constructor

	public void showDims(){		
		System.out.println("Length = : "+length);
		System.out.println("Width = : "+width);
	}	// end showDims method

	public void setDims(int i, int j){
		length = i;
		width = j;
	}	// end setDims method

	public static void main (String[] args) {
		
	}	// empty main method; just implements class
	
}	// end GeoRectangle class

