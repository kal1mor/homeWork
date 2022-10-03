package com.example.lib;

public class InterfaceAndAbstraction {

    public static void main(String[] args) {

    }
}

abstract class Bird {

    abstract void walk();

}

class Crown extends Bird implements IFly{

    @Override
    void walk() {

    }

    @Override
    public void lfy() {

    }
}

class Eagle extends Bird implements IFly{

    @Override
    void walk() {

    }

    @Override
    public void lfy() {

    }

}

class Penguin extends Bird{

    @Override
    void walk() {

    }
}

interface IFly {

    void lfy();
}