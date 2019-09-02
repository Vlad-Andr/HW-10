package com.company.httpstatustask;

public class ReliseHTTPApp {
    public void reliseApp() {
        Server r = new Server();
        Thread t = new Thread(r);
        t.start();
    }
}