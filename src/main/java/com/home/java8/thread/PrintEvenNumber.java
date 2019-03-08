package com.home.java8.thread;

import java.util.concurrent.Semaphore;

class PrintEvenNumber implements Runnable {

Semaphore sempahoreEven;
Semaphore sempahoreOdd;

public PrintEvenNumber(Semaphore sempahoreEven, Semaphore sempahoreOdd) {
    super();
    this.sempahoreEven = sempahoreEven;
    this.sempahoreOdd = sempahoreOdd;
}

@Override
public void run() {
    for (int i = 2;; i = i + 2) {
        try {
            //This will decrement the permit used by the even semaphore to 0. 
            sempahoreEven.acquire();
            System.out.println(i);
            //This will increment the permit used by odd semaphore by 1.
            sempahoreOdd.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

}