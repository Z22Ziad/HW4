package com.company;

public class PlaygroundOwnerMenu {
    public void askToVerify (Playground p) {
        p.setValid(true);
    }
    public boolean playgroundVerified (Playground p) {
        return p.isValid();
    }
    public void display() {

    }

}
