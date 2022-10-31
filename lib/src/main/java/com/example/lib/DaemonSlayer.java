package com.example.lib;

public class DaemonSlayer {
    public static void main(String[] args) {
        ThreadCLass threadCLass = new ThreadCLass();
        threadCLass.setDaemon( true );
        threadCLass.start();
    }
}

class ThreadCLass extends Thread{
    @Override
    public void run() {
        System.out.print( "I'm daemon slayer " + Thread.currentThread().isDaemon() );
    }
}