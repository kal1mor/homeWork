package com.example.lib;

public class ThreadWork2 {
    public static void main(String[] args) {
        ThreadClass5 threadClass5 = new ThreadClass5();
       // threadClass5.start();

        Thread thread = new Thread(threadClass5);
        thread.start();
        try{
            thread.join();
        }catch (Exception e){
        }
        Thread thread1 = new Thread(threadClass5);
        thread1.start();
    }
}

class ThreadClass5 extends Thread{
    private int count;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            count++;
            System.out.print(count + " ");
        }
    }
}