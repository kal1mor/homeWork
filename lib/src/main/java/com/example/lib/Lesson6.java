package com.example.lib;


public class Lesson6 implements IAuth{

    static boolean isUserLoggedIn = false;

    public static void main(String[] args) {

        Lesson6 lesson6 = new Lesson6();
        if(!isUserLoggedIn) lesson6.login();

    }

    @Override
    public void login() {
        isUserLoggedIn = true;
        System.out.println("user logged in");
    }

    @Override
    public void log() {

    }

    @Override
    public void logout() {
        isUserLoggedIn = false;
        System.out.println("user logged out");
    }
}

interface IAuth {

    void log();

    void logout();

    void login();

}
