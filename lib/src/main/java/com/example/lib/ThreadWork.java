package com.example.lib;

public class ThreadWork {
    public static void main(String[] args) {
        // переопределение потока через анонимный класс, используется если нам надо локально изменить переопределенный метод run
        ThreadClass3 threadClass3 = new ThreadClass3(){
            @Override
            public void run() {
                System.out.println("Run in Thread in anonym class");
            }
        };
        threadClass3.start();

        // Создание локального потока, который мы будем использовать только в том классе, в котором он прописан (создан)
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("I'm running in thread");
            }
        };
        thread.start();


        // Создание потока через Runnable, вызвать метод start не можем без передачи новому потоку
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running in Runnable");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

    }
}

class ThreadClass3 extends Thread {
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class ThreadClass4 implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}