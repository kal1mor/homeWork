package com.example.lib;

public class child extends Parent {

    protected int  age = 12;

    @Override
    void speak() {
        System.out.println("I speak loudly");
        super.speak();
    }

    public static void main(String[] args) {
        Parent Child = new child();
        Parent parent = new Parent();
        Child.eye_color = "green";
        System.out.println("Eye color of the child: " + Child.eye_color);
        System.out.println("Eye color of the parent: " + parent.eye_color);
        Child.speak();
       // parent.speak();

    }

    void phoneNumber(int number){

    }

    void phoneNumber(int number, String mobileOperator){

    }

}

class Parent{

    protected String eye_color = "blue";

    void speak(){
        System.out.println("I speak quielty");
    }

}

class Uncle{
    public static void main(String[] args) {
        Parent parent = new Parent();
        child Child = new child();
        System.out.println(parent.eye_color);
        System.out.println(Child.age);
    }
}