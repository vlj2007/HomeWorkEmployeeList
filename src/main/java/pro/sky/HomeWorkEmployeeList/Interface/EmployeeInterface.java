package pro.sky.HomeWorkEmployeeList.Interface;

import pro.sky.HomeWorkEmployeeList.Model.Employee;

public interface EmployeeInterface {
    String employeeAdd(String firstName, String lastName);
    String employeeRemove(String firstName, String lastName);
    String employeeFind(String firstName, String lastName);



}
