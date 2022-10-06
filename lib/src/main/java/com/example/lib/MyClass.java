package com.example.lib;

public class MyClass {

   // static IRepository iRepository;

    public static void main(String[] args) {

        NetworkErrors networkErrors = NetworkErrors.CLIENT_ERROR;
        switch (networkErrors){
            case CLIENT_ERROR:
                System.out.println("shop is open");
                break;

            case SERVER_ERROR:
                System.out.println("shop is closed");
                break;
        }



    //    iRepository = new RepositoryImpl();
    //    iRepository.login("user name", "12345");
    }
}


enum NetworkErrors{
    CLIENT_ERROR,
    SERVER_ERROR
}