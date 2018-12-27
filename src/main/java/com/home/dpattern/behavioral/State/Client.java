package com.home.dpattern.behavioral.State;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        
        order.paymentSuccessful();
        order.dispatched();
        
        order.cancel();
    }
}
