package com.company.taskabouthttp;

public class Main {
    public static void main(String[] args) {
        Server r = new Server();
        Thread t = new Thread(r);
        t.start();

    }
}
