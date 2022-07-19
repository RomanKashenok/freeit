package com.freeit.lesson14.interf;

public class ElectraTvRemote extends TvRemote implements Remote {

    @Override
    protected void chooseInput() {
        System.out.println("Available inputs: \n HDMI \n VGA \n USB \n AV");
    }

    public void electraPrivateSecretMethod() {
        System.out.println("From secret method");
    }

    @Override
    public void turnOn() {
        System.out.println("ElectraTv Turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("ElectraTv Turned off");
    }













    public static void main(String[] args) {
        Remote remote = new ElectraTvRemote();
        Remote [] remotes = new TvRemote[10];
        remotes[0] = remote;

        for (int i = 0; i < remotes.length; i++) {
            if(remotes[i] != null) {
                remotes[i].turnOn();
                remotes[i].turnOff();
            }
        }
    }
}
