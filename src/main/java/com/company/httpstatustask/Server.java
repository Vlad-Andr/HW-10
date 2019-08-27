package com.company.httpstatustask;

import com.company.httpstatustask.HTTP;

public class Server implements Runnable {
    public static final int MAX_NUMBER_REQUEST = 4;

    @Override
    public void run() {
        for (int i = 0; i < MAX_NUMBER_REQUEST; i++) {
            System.out.println("HTTP metod is : " + HTTP.values()[i]);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(HTTP.values()[i] + " has arrived\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}