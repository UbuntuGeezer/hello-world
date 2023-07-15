//	imCounting.java - counting class.
//		wmk.	5/7/20.	initial code
//
//	This class is a test case for a class that implements a static
// 	counter to count the number of constructor calls.

class imCounting{

	static int count=0;		// instance counter
	int count1;				// dynamic counter
	
//	constructor	
	imCounting(){
		count++;
		System.out.println("imCounting constructor called: "+count+" times.");
	}	// end constructor
		
//genID - generate instance ID.
	public String genID(){
		return "Instance"+count;
	}	// end genID
	
//	empty main, as this is stricly a class implementation.
	public static void main(String[] args){

	}	// end main
}	// end imCounting
