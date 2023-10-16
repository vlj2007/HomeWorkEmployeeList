package pro.sky.HomeWorkEmployeeList.Interface;

import pro.sky.HomeWorkEmployeeList.Model.Employee;

import java.util.Collection;

public interface EmployeeInterface {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}
