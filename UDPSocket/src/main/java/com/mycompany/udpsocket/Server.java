package com.mycompany.udpsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class Server{
    public static void main(String[] args){
        try{
            DatagramSocket datagramSocket = new DatagramSocket(2020);
            byte[] buffer = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(datagramPacket);
            String str = new String(datagramPacket.getData() , 0 , datagramPacket.getLength());
            System.out.println(str + " Recieved!!!!");
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}