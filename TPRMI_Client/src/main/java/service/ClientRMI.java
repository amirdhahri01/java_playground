package service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import metier.Compte;


public class ClientRMI {
    
    public static void main(String[] args){
        try{ 
            IBanqueRemote stub = (IBanqueRemote)Naming.lookup("rmi://localhost:1125/RMI");
            System.out.println(stub.conversion(70));         
            System.out.println(stub.getServerDate());
            System.out.println("Consultation d'un compte à distance");
            Compte cp = stub.consulterCompte(1);
            System.out.println("code = "+cp.getCode());
            System.out.println("Solde = "+cp.getSolde());
            System.out.println("Date Création= "+cp.getDateCreation());
            System.out.println("Consultation de la liste des comptes");
            List<Compte> cptes=stub.listeComptes();
            for (Compte c:cptes) {
                System.out.println("--------------------------");
                System.out.println("code = "+c.getCode());
                System.out.println("Solde = "+c.getSolde());
                System.out.println("Date Création= "+c.getDateCreation());
            }
        }catch( MalformedURLException | NotBoundException | RemoteException e){
            System.err.println(e.getMessage());
        }
    }
    
}
