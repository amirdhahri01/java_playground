package Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(2020);
            EmployeeImpl ei = new EmployeeImpl();
            System.out.println(ei.toString());
            Naming.rebind("rmi://localhost:2020/EM", ei);
        }catch(MalformedURLException | RemoteException e){
            System.err.println(e.getMessage());
        }
    }
}
