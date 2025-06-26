package com.davinchicoder.threads;

public class MyThread extends Thread {

    @Override
    public void start() {
        System.out.println("Starting thread");
    }

    @Override
    public void run() {
        System.out.println("Running thread");
    }
}
