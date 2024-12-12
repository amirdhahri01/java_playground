package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import metier.Compte;

public class BanqueServiceImpl extends UnicastRemoteObject implements IBanqueRemote{

    public BanqueServiceImpl() throws RemoteException{
        super();
    }
    @Override
    public double conversion(double mt) throws RemoteException {
        return mt*3;
    }

    @Override
    public Date getServerDate() throws RemoteException {
        return new Date();
    }

    @Override
    public Compte consulterCompte(int code) throws RemoteException {
        Compte cp = new Compte(code , Math.random() * 9000 , new Date());
        return cp;
    }

    @Override
    public List<Compte> listeComptes() throws RemoteException {
        List<Compte> cptes = new ArrayList<>();
        cptes.add(new Compte(1 , Math.random() * 9000 , new Date()));      
        cptes.add(new Compte(2 , Math.random() * 9000 , new Date()));
        cptes.add(new Compte(3 , Math.random() * 9000 , new Date()));
        return cptes;
    }
}
