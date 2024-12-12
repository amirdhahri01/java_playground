
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMITraitement extends Remote{
    
    public void getInformation(String nom , String prenom , int age) throws RemoteException;
    public void getJob(String poste, String date) throws RemoteException;
    
    
}
