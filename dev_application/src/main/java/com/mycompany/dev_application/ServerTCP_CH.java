package com.mycompany.dev_application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerTCP_CH {
     public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("J'attends une connexion");
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            System.out.println("J'attends une chaine");
            byte[] buffer = new byte[1024];
            is.read(buffer);
            String message = new String(buffer , 0 , buffer.length);
            String response = "Bienvenue " + message;
            byte[] data_to_send = response.getBytes();
            os.write(data_to_send , 0 , data_to_send.length);
            s.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
