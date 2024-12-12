package com.mycompany.networking;

import java.net.InetAddress;

public class Network {

    public static void main(String[] args) {
        try {
            InetAddress inetAddresses = InetAddress.getByName("www.facebook.com");
            System.out.println(inetAddresses.getHostAddress());
            System.out.println(inetAddresses.getHostName());
            System.out.println(inetAddresses.getCanonicalHostName());   
            System.out.println(inetAddresses.isReachable(2000));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }

}
