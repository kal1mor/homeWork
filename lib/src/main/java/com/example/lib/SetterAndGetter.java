package com.example.lib;

public class SetterAndGetter {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setAge(10);
        shop.sellAlcohol();
    }

}

class Shop {
   private int age = 0;

    public void setAge(int age) {
        if (age >=18){
        this.age = age;
        } else {
          System.out.println("you are a child " + getAge());
        }

    }

    public int getAge() {
        return age;
    }

    void sellAlcohol() {
        if (age != 0){
            System.out.println("vodka sold to: " + getAge());
        }
    }
}