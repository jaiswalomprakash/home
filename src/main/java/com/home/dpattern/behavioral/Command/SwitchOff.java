package com.home.dpattern.behavioral.Command;

public class SwitchOff implements Command {
	Light light ;
	
	public SwitchOff(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		this.light.switchOff();

	}

}
