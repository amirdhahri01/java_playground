package com.mycompany.udpsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

class Client{
    public static void main(String[] args){
        try{
            String str = "Amir Dhahri";
            DatagramSocket  datagramSocket = new DatagramSocket();
            byte [] data = str.getBytes();
            InetSocketAddress address = new InetSocketAddress("localhost" , 2020);
            DatagramPacket datagramPacket = new DatagramPacket(data, data.length, address);
            datagramSocket.send(datagramPacket);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}