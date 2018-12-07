package com.home.dpattern.behavioral.Command;


// receiver
public class Light {
	boolean onOff = false;
	public void swithOn() {
		this.onOff =true;
	}
	
	public void switchOff() {
		this.onOff = false;
	}

	@Override
	public String toString() {
		return "Light [onOff=" + onOff + "]";
	}
	
	

}
