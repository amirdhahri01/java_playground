package com.mycompany.serveurmt3;

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
            ServerSocket ss = new ServerSocket(2020);
            while(true){
                Socket s = ss.accept();
                new Conversation(s).start();
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        new ServeurMT3().start();
    }
}

class Conversation extends Thread{
    private final Socket socket;
    public  Conversation(Socket s){
        socket = s;
    }
    @Override
    public void run(){
        try{
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bufferedReader = new BufferedReader(isr);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("Welcome .....");
            String request;
            while((request = bufferedReader.readLine()) != null){
                String response = "Request length = " + request.length();
                printWriter.println(response);
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
