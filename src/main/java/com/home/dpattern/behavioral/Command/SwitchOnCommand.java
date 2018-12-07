package com.home.dpattern.behavioral.Command;

public class SwitchOnCommand implements Command {
    Light light;
	public SwitchOnCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	@Override
	public void execute() {
		light.swithOn();
	}

}
