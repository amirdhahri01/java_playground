package com.mycompany.dev_application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class ClientTCP_CH {
     public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost" , 1234);
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Donner une chaine : ");
            String str = scanner.nextLine();
            byte[] data = str.getBytes();
            os.write(data, 0, data.length);
            byte[] buffer = new byte[1024];
            is.read(buffer , 0 , buffer.length);
            String message = new String(buffer , 0, buffer.length);
            System.out.println("\nrésponse="+message);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
