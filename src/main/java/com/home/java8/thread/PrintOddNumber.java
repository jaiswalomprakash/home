package com.home.java8.thread;

import java.util.concurrent.Semaphore;

//https://stackoverflow.com/questions/16689449/printing-even-and-odd-using-two-threads-in-java
class PrintOddNumber implements Runnable {

Semaphore sempahoreEven;
Semaphore sempahoreOdd;

public PrintOddNumber(Semaphore sempahoreEven, Semaphore sempahoreOdd) {
    this.sempahoreEven = sempahoreEven;
    this.sempahoreOdd = sempahoreOdd;
}

@Override
public void run() {
    for (int i = 1;; i = i + 2) {
        try {
            //This will decrement the permit used by the odd semaphore to 0. 
            sempahoreOdd.acquire();

            Thread.sleep(1000);
            System.out.println(i);
            //This will increment the permit used by even semaphore by 1.
            sempahoreEven.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

}