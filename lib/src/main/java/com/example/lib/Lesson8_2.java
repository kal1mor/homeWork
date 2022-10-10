package com.example.lib;

import java.io.FileNotFoundException;

public class Lesson8_2 {
    public static void main(String[] args) {


//        try {
//            throwCheckedException();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

    }
    static void throwUnCheckedException() throws NullPointerException{
        throw  new NullPointerException("runTime");
    }

    static void throwCheckedException() throws FileNotFoundException {
        throw  new FileNotFoundException("compileTime");
    }
}
