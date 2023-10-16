package pro.sky.HomeWorkEmployeeList.Interface;

import pro.sky.HomeWorkEmployeeList.Model.Employee;

import java.util.Collection;

public interface EmployeeInterface {
    String add(String firstName, String lastName);
    String remove(String firstName, String lastName);
    String find(String firstName, String lastName);
    Collection<Employee> findAll();



}
