package com.home.dpattern.behavioral.Command;
//https://dzone.com/articles/design-patterns-command

//https://www.baeldung.com/java-command-pattern
public class Client {
	
	/*A request is wrapped under an object as command and passed to invoker object. 
	Invoker object looks for the appropriate object which can handle this command 
	and passes the command to the corresponding object which executes the command.*/


	
	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		Command swithOn = new SwitchOnCommand(light);
		remoteControl.setCommand(swithOn);
		remoteControl.pressButton(); 
		// java 8
		
		
		System.out.println("button on"+ light);
		
		Command swithOff = new SwitchOff(light);
		remoteControl.setCommand(swithOff);
		remoteControl.pressButton();
		System.out.println("button off "+ light);
		
		
		
		
		
		
	}

}
