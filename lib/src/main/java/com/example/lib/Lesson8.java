package com.example.lib;

public class Lesson8 {
    public static void main(String[] args) {
        try {
            getWrongValue(null);
        }catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e){
            System.out.println("something is wrong");
        } finally {
            System.out.println("do if success or exception throw");
        }

    }
    static void getWrongValue(Integer value){
        System.out.println(value.toString());
    }
}