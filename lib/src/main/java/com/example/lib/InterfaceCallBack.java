package com.example.lib;

public class InterfaceCallBack {

    public static void main(String[] args) {

        Button button = new Button(new LoginClickListener());
        button.buttonClicked();
    }
}

class LoginClickListener implements IAuthoriz{

    @Override
    public void sendLoginRequest() {
        System.out.println("Login requset was successfuly sent...");
    }

}

class Button {

    IAuthoriz iAuthoriz;

    public Button(IAuthoriz iAuthoriz) {
        this.iAuthoriz = iAuthoriz;
    }

    void buttonClicked(){
        iAuthoriz.sendLoginRequest();
    }

}

interface IAuthoriz {

    void sendLoginRequest();

}