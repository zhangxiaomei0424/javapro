package com.taiyuan.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test14 {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2048);
            Socket socket = server.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] b = new byte[1024];
            int a =  inputStream.read(b);
            String str = new String(b,0,a);
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
