/*
 * GeoRect.java - rectangle class definition with static fields
 * 		5/8/20.
 * 
 * This class demonstrates how instantiation works when referenced by
 * another class.
 * 
 * 
 * 
 */

// invoke necessary dependencies.


public class GeoRect {
	
	int length;		// length field
	int width;		// width field
	
	GeoRect() {
		length = 1;
		width = 2;
	}	// end no params constructor
	
	GeoRect(int i, int j){
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
	
}	// end GeoRect class

