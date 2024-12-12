
package com.mycompany.dev_application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {
    
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost" , 1234);
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Donner un nombre");
            int nb = scanner.nextInt();
            os.write(nb);
            int rep = is.read();
            System.out.println("résponse="+rep);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
}
