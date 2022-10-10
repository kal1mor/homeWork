package com.example.lib;

public class Shop {
    public static void main(String[] args) {
        Market market = new Market();
        try {
            market.setAge(2);
        } catch (CantSellToChildException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(market.getAge());
        }
    }
}

class Market {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws CantSellToChildException {
        if (age < 18) {
            throw new CantSellToChildException("you cant drunk, you are child bitch");

        } else {
            this.age = age;
            System.out.println("alcohol sold");
        }
    }
}

class CantSellToChildException extends Exception{

    private String message;

    CantSellToChildException(String message){
        this.message = message;
        setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}