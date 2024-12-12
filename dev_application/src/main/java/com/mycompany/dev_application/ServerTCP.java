package com.mycompany.dev_application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerTCP {
    
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("J'attends une connexion");
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            System.out.println("J'attends un nombre");
            int nb = is.read();
            int res = nb * 2;
            os.write(res);
            s.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
