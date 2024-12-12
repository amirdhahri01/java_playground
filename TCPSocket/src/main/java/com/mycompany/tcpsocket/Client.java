
package com.mycompany.tcpsocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
     public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 2020);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your name : " );
            String name = scanner.nextLine();
            outputStream.write(name.getBytes());
            byte buffer[] = new byte[1024]; 
            inputStream.read(buffer , 0 , buffer.length);
            String str = new String(buffer , 0 , buffer.length);
            System.out.println(str);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
