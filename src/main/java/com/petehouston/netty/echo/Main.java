package com.petehouston.netty.echo;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Echo server started at: ");
        new EchoServer(9999).run();
    }
}
