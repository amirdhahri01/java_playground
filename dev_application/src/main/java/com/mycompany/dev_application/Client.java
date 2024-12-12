package com.mycompany.dev_application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Client {
    public static void main(String[] args){
          try{
            String str = "Amir Dhahri";
            DatagramSocket s = new DatagramSocket();
            byte[]data = str.getBytes();
            InetSocketAddress sa = new InetSocketAddress("localhost" , 5678);
            DatagramPacket datagramPacket = new DatagramPacket(data, data.length ,sa);
            s.send(datagramPacket);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
