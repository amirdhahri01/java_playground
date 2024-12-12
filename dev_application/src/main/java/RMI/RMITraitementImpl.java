
package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMITraitementImpl extends UnicastRemoteObject implements RMITraitement{

    protected RMITraitementImpl() throws RemoteException{
        super();
    }
    
    @Override
    public void getInformation(String nom, String prenom, int age) throws RemoteException {
        System.out.println("---Information");
        System.out.println("Nom : " + nom + " | Prenom " + prenom + " | age" + age);
    }

    @Override
    public void getJob(String poste, String date) throws RemoteException {
        System.out.println("---Travail Information");
        System.out.println("Poste Occupé : " + poste + " | Date de recrutement " + date);
    }
    
}
