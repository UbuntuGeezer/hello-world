/*
 * MyWMK.java
 * 
 * Copyright 2020 Bill <Bill@LAPTOP-64IS8TA8>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


// invoke dependencies.

import java.awt.*;
// local subdirectory contains GeoRectangle class definition


class MyWMK {
	
	public void MyWMK (){
	 GeoRectangle rect1;	// define 4 rectangles
	 GeoRectangle rect2;
	 GeoRectangle rect3;
	 GeoRectangle rect4;
}	// end MyWMK constructor
	
	
	public static void main (String[] args) {
		GeoRectangle rect = new GeoRectangle();
		System.out.println("immediately after constructor invoked...");
		rect.showDims();
		rect.setDims(1,2);
		System.out.println(" after .setDims reference...");
		rect.showDims();
//		rect1.showDims();
	}	// end main method
	
}	// end MyWMK class

