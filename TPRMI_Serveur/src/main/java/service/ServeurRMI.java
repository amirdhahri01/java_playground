package service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class ServeurRMI {
    
    public static void main(String[] args){
       try{
            LocateRegistry.createRegistry(1125);
            BanqueServiceImpl BK = new BanqueServiceImpl();
            System.out.println(BK.toString());
            Naming.rebind("rmi://localhost:1125/RMI", BK);
       }catch(RemoteException | MalformedURLException e){
           System.err.println(e.getMessage());
       }
    }
}
