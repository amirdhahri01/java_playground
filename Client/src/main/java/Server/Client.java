package Server;

import emplo.Employee;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;


public class Client {

    public static void main(String[] args) {
        try{
            IEmployee stub = (IEmployee)Naming.lookup("rmi://localhost:2020/EM");
            System.out.println(stub.getEmployee(1).toString());
            System.out.println(stub.getInformation(1));
            List<Employee> employees = stub.getEmployees();
            for(Employee em : employees){
                System.out.println(em.toString());
            }
        }catch(MalformedURLException | NotBoundException | RemoteException e){
            System.err.println(e.getMessage());
        }
    }
}
