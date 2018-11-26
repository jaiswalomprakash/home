package com.home.dpattern.behavioral.iterator;

public enum ThemeColor {	
	RED,
	WHITE,
	BLUE,
	PINK,
	GREEN;
	
	public static ThemeColorIterator getIterator() {
		return new ThemeColorIterator();
	}

}
