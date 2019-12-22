package com.test.UnitTests;

public class IndexProcessor implements Runnable {

    private volatile boolean running = true;

    public void terminate() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            try {
            	System.out.println("Sleeping...");
                Thread.sleep((long) 15000);
                System.out.println("Processing...");
            } catch (InterruptedException e) {
            	System.out.println("Exception...");
                running = false;
            }
        }

    }
}