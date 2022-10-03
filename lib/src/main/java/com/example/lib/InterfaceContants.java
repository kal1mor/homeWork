package com.example.lib;

public class InterfaceContants implements IAuthorization {

    @Override
    public void login(boolean isUserLoggedIn) {
        if (isUserLoggedIn){
            System.out.println("user is logged in");
        }

        if (!isUserLoggedIn) {
            System.out.println("user is not logged in");
        }
    }

    public static void main(String[] args) {
        InterfaceContants intefaceContants = new InterfaceContants();
        intefaceContants.login(userIsNotLoggedIn);
    }
}


interface IAuthorization{

    boolean userIsNotLoggedIn = false; // constant (can't be changed)
    boolean userIsLogedIn = true; // constant (can't be changed)

    void login(boolean isUserLoggedIn);
}