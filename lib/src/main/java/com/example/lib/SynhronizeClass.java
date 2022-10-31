package com.example.lib;

public class SynhronizeClass {
    public static void main(String[] args) {
        CountThread1 countThread = new CountThread1();
        Thread thread = new Thread(countThread);
        thread.start();
        Thread thread1 = new Thread(countThread);
        thread1.start();
    }
}

class CountThread1 implements Runnable{

    private  int count;

    synchronized void changeValue(){
        for (int i =0; i<10; i++) {
            count++;
            System.out.print( count + " " );
        }
    }

    @Override
    public void run() {
            changeValue();
    }
}