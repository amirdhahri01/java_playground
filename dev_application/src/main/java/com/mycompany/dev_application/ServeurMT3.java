package com.mycompany.dev_application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ServeurMT3 extends Thread{
    @Override
    public void run(){
        try{
            ServerSocket serverSocket = new ServerSocket(1234);
            while(true){
                Socket s = serverSocket.accept();
                new Conversation(s).start();
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
class Conversation extends Thread{
    private final Socket socket;
    public Conversation(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run(){
        try{
            InputStream is = socket.getInputStream();
            InputStreamReader isr  = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream() , true);
            printWriter.write("Welcome .....");
            String request;
            while((request = br.readLine()) != null){
                String response = "Request Length = " + request.length();
                printWriter.println(response);
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
