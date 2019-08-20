package com.company.taskaboutfireman;
public class Signal implements Runnable {
    private MessageAboutFire msg;
    public Signal(MessageAboutFire msg) {
        this.msg = msg;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " has arrived \n");
        try {
            Thread.sleep(3000);
            synchronized (msg) {
                msg.setMsg(name + "is processed, the fireman goes to the fire\n");
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
