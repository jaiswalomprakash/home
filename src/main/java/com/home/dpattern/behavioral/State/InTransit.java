package com.home.dpattern.behavioral.State;

//Concrete state
public class InTransit implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier service for cancellation");
        System.out.println("Contacting payment gateway for transaction roll back");
        return 20;
    }

}
