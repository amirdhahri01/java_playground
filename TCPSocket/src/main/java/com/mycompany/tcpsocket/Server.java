/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tcpsocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Amir Dhahri
 */
public class Server {
    public static void main(String[] args){
           try{
            ServerSocket serverSocket = new ServerSocket(2020);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            byte[] buffer = new byte[1024];
            inputStream.read(buffer , 0 , buffer.length);
            String str = new String(buffer , 0 , buffer.length);
            String msg = "Bienvenue " + str;
            outputStream.write(msg.getBytes());
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
