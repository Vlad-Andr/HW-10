package com.company.taskaboutfireman;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MessageAboutFire msg = new MessageAboutFire("FIRE!!!");
        Fireman fireman1 = new Fireman(msg);
        Thread t1 = new Thread(fireman1,"FirstFireman");
        t1.start();
        Fireman fireman2 = new Fireman(msg);
        Thread t2 = new Thread(fireman2,"SecondFireman");
        t2.start();
        Fireman fireamn3 = new Fireman(msg);
        Thread t3 = new Thread(fireamn3,"ThirdFireman");
        t3.start();
        Signal signalAboutFire = new Signal(msg);
        Thread ts = new Thread(signalAboutFire,"signal");
        ts.start();
        System.out.println("\nFire started\n");
    }
}
