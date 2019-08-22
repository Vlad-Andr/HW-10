package com.company.firedepartament;

public class Fireman implements Runnable{
    private MessageAboutFire msg;
    public Fireman(MessageAboutFire m){
        this.msg = m;
    }
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try{
                System.out.println(name + " waiting for a signal ");
                msg.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name + " there was a call to fire ");
            System.out.println(name + " : " + msg.getMsg());
        }
    }
}