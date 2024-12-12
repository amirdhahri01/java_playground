package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class Server {
    
    
    public static void main(String[] args){
        try{
            LocateRegistry.createRegistry(1125);
            RMITraitementImpl rmi = new RMITraitementImpl();
            Naming.rebind("rmi://localhost:1125/RMI", rmi);
            System.out.println(rmi.toString());
        }catch(RemoteException | MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }
}
