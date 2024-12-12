package Server;

import emplo.Employee;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class EmployeeImpl extends UnicastRemoteObject implements IEmployee{
    private final List<Employee> employees;
    public EmployeeImpl() throws RemoteException{
        super();
        employees = new ArrayList<>();
        employees.add(new Employee(0, "Amir Dhahri", "94981522"));   
        employees.add(new Employee(1, "Najet Dhahri", "123456789"));
        employees.add(new Employee(2, "far crt", "98756212"));

    }
    @Override
    public String getInformation(int id) throws RemoteException {
       return employees.get(id).toString();
    }

    @Override
    public List<Employee> getEmployees() throws RemoteException {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) throws RemoteException {
          return employees.get(id);
    }
    
}
