package com.home.java8.thread;

import java.util.concurrent.Semaphore;

//https://stackoverflow.com/questions/16689449/printing-even-and-odd-using-two-threads-in-java
public class SemaphoreExample {

public static void main(String[] args) {

    //We dont want the even number printed first so the initial permit for this semaphore is 0.
    Semaphore evenSemaphore = new Semaphore(0);
    //We want to print the odd number first so the initial permit for this semaphore is 1.
    Semaphore oddSemaphore = new Semaphore(1);

    PrintOddNumber printOddNumber = new PrintOddNumber(evenSemaphore, oddSemaphore);
    PrintEvenNumber printEvenNumber = new PrintEvenNumber(evenSemaphore, oddSemaphore);

    new Thread(printOddNumber, "Print Odd").start();
    new Thread(printEvenNumber, "Print Odd").start();
}

}
