package com.company;

public class PlaygroundOwner extends User {
    private Playground playground;
    private eWallet EWallet;

    public PlaygroundOwner() {}

    public void signUp(String Name, eWallet EW, Playground p) {
        name = Name;
        playground=p;
        EWallet=EW;
    }
    public void registerAPlayground(int price, String location) {
        Playground playground1 = new Playground(price,location);
        this.playground=playground1;
    }
}
