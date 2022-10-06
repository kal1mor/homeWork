package com.example.lib;

public class Anonimus {

    static IRepository iRepository = new IRepository() {
        @Override
        public void login(String userName, String password) {
            System.out.println("hello");
        }
    };

//    static  Anonym anonym = new Anonym(){ // anonym class
//        @Override
//        void hackNetwork() { // parent behavior
//            super.hackNetwork();
//        }
//    };

    public static void main(String[] args) {
        Anonym anonym = new Anonym() { // anonym class
        @Override
        void hackNetwork() { // parent behavior
            super.hackNetwork();
        }
    };
    anonym.hackNetwork();
    }
}


class Anonym {
    void hackNetwork() {
        System.out.println("I hacked the world");
    }
}