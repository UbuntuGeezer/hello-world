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
		System.out.println("rect immediately after constructor invoked...");
		rect.showDims();
		GeoRectangle rect2 = new GeoRectangle(4,5);
		System.out.println("rect2 immediately after rect2 constructor invoked...");
		rect2.showDims();
		System.out.println("rect immediately after rect2 constructor invoked...");
		rect.showDims();
		rect.setDims(3,4);
		System.out.println(" rect after rect.setDims reference...");
		rect.showDims();
		System.out.println(" rect 2 after rect.setDims invoked...");
		rect2.showDims();
	}	// end main method
	
}	// end MyWMK class

