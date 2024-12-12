package Server;

import emplo.Employee;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IEmployee extends Remote {
    public String getInformation(int id) throws RemoteException;
    public List<Employee> getEmployees() throws RemoteException;
    public Employee getEmployee(int id) throws RemoteException;
}
