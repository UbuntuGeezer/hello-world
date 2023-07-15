// CountTest - application to test imCounting class.
//		wmk.	5/7/20.	initial code
//

// dependencies.

import java.awt.*;

class CountTest{
	
	
	public static void main(String[] args){

//	var declarations.

	imCounting aCount1;
	imCounting aCount2;
	imCounting aCount3;
	String testID1;		// instance ID
	String testID2;
	String testID3;

//	code.
	
	aCount1 = new imCounting();
	testID1 = aCount1.genID();
		System.out.println("aCount1 instance ID: "+testID1);
	aCount2 = new imCounting();
	testID2 = aCount2.genID();
		System.out.println("aCount2 instance ID: "+testID2);
	aCount3 = new imCounting();
	testID3 = aCount3.genID();
		System.out.println("aCount3 instance ID: "+testID3);
	
	System.out.println("CountTest complete.");
		
	}	// end main
	
}	// end CountTest class
