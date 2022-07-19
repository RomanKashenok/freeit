package com.freeit.lesson14.interf;

public abstract class TvRemote implements Remote {

    protected abstract void chooseInput();

    void channelPlus() {
        System.out.println("channel +");
    }

    void channelMinus() {
        System.out.println("channel -");
    }

}
