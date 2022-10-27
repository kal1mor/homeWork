package com.example.lib;

public class ThreadWork3 {
    public static void main(String[] args) {
        ThreadClass6 threadClass6 = new ThreadClass6();
        threadClass6.start();

        long start = System.currentTimeMillis();
        System.out.println("Called in thread: " + Thread.currentThread().getName() + " " + start);
    }
}

class ThreadClass6 extends Thread {
    private int count;

    @Override
    public void run() {
        try {
            sleep( 20000 );
        }catch (Exception e){}
        long start = System.currentTimeMillis();
        Thread thread = Thread.currentThread();
        System.out.println("I run this code in: " + thread.getName() + " " + start);
    }
}