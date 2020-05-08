/*
 * GeoRectangle.java - rectangle class definition
 * 
 * This class demonstrates how instantiation works when referenced by
 * another class. It also demonstrates what the static attribute
 * does when imposed on a class field. For the GeoRectangle class
 * all rectangle instances will have the same length and width
 * whenever anything is done. If the constructor is invoked, the
 * dimensions will be reset either to the new dimensions (two parameters)
 * or the default dimensions [1,2] (no parameters). 
 * 
 * 
 */

// invoke necessary dependencies.


public class GeoRectangle {

// Note. Declaring class fields static can make it appear that a new
//	instance has not been created. You can discern this by comparing
//	any two instances; although the dimensions are the same, they
//	will test != in comparisons, because of being different instances.	
	static int length;		// length field
	static int width;		// width field
	
	GeoRectangle() {
		length = 1;
		width = 2;
	}	// end no params constructor
	
	GeoRectangle(int i, int j){
		this.length = i;
		this.width = j;
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

