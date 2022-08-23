package com.freeit.lesson22.post;

public class PostOffice {

    public static final Pen pen = new Pen();
    public final Cashier cashier = new Cashier();

    static class Cashier {
        public void letCLientDoWhatHeWants(PosClient client, String clientName) {
            Thread thread = new Thread(client);
            thread.setName(clientName);
            thread.start();
        }
    }
}
