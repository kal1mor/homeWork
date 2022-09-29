package com.example.lib;

public class Leeson5_1 {

    public static void main(String[] args) {

        Friend friend = new Friend("Sasha", 30, "5.03.1202");
        Friend friend2 = new Friend("Sasha", 30);
       // friend.age = 30;
       // friend.name = "Sasha";
        friend2.born();
        friend.born();

    }

}

class Friend{
    private String name;
    private int age;
    private String birthDate;


    public Friend(String name2, int age2, String birthDate2){
        this.name = name2;
        this.age = age2;
        this.birthDate = birthDate2;
    }

    public Friend(String name2, int age2){
        this.name = name2;
        this.age = age2;
    }

    void born(){
        String congratulations = "";
        if (birthDate == null || birthDate.isEmpty()) {
           congratulations = "no birthday";
        }else{
            congratulations= name + " has birthday on: " + birthDate + " he is" + age + " years old";
        }
        System.out.println(congratulations);
    }

}