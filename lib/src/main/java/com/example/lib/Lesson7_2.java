package com.example.lib;

public class Lesson7_2 {

    private String privateVar = "Hello";
    String publicVar = "HELLO";
    static String staticVar = "GGWP";

    public static void main(String[] args) {
    Lesson7_2 lesson7_2 = new Lesson7_2();
    lesson7_2.callInnerClass();
    lesson7_2.callNestedClass();
    }

    void callInnerClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerAge);
        innerClass.callOuterClassVariable();

    }

    void callNestedClass() {
        NestedClass nestedClass = new NestedClass();
        System.out.println(nestedClass.nestedAge + "nested class");
        }


    class InnerClass {

        int innerAge = 18;

        void callOuterClassVariable() {
            System.out.println(privateVar);
            System.out.println(publicVar);
        }
    }

    static class NestedClass{

        int nestedAge = 18;

        void callOutweClassVariable(){
//            System.out.println(privateVar);
//            System.out.println(publicVar);
            System.out.println(staticVar);

        }
    }
}
