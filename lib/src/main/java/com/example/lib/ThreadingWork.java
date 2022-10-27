package com.example.lib;
// Первый способ создания потока
public class ThreadingWork {
    public static void main(String[] args) {

        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.start();

        ThreadClass2 threadClass2 = new ThreadClass2();

        Thread thread1 = new Thread(threadClass2);// Передача потока ThreadClass2 новому потоку thread1.
        thread1.start();




    }
}

class ThreadClass1 extends Thread {
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class ThreadClass2 implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}



