package com.mycompany.dev_application;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args){
        try{
         DatagramSocket s = new DatagramSocket(5678);
         byte[] data = new byte[100];
         DatagramPacket paquet = new DatagramPacket(data, data.length);
         s.receive(paquet);
         String st = new String(paquet.getData() , 0 , paquet.getLength());
         System.out.print("J'ai récu ["+ st + "]");
         System.out.println("depuis la machine" + paquet.getAddress().getCanonicalHostName() + paquet.getPort());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
