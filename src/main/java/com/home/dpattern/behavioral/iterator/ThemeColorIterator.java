package com.home.dpattern.behavioral.iterator;

public class ThemeColorIterator implements Iterator<ThemeColor> {
     int position;
     public ThemeColorIterator() {
		// TODO Auto-generated constructor stub
    	 System.out.println("ThemeColorIterator.ThemeColorIterator()"+position);
	}
	@Override
	public boolean hasNext() {
		return position< ThemeColor.values().length;
	}

	@Override
	public ThemeColor next() {
		// TODO Auto-generated method stub
		return ThemeColor.values()[position++];
	}

}
