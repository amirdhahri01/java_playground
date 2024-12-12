package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {
    
    public static void main(String[] args){
       try{
            RMITraitement stub = (RMITraitement)Naming.lookup("rmi://localhost:1125/RMI");
            stub.getInformation("Amir", "Dhahri", 21);
            stub.getJob("Software Engineer", "10-10-2024");
       }catch(RemoteException | NotBoundException | MalformedURLException e){
           System.err.println(e.getMessage());
       }
    }
}
