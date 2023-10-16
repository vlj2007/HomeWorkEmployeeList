package pro.sky.HomeWorkEmployeeList.ServiceImpl;

import org.springframework.stereotype.Service;
import pro.sky.HomeWorkEmployeeList.Exception.EmployeeAlreadyAddedException;
import pro.sky.HomeWorkEmployeeList.Exception.EmployeeNotFoundException;
import pro.sky.HomeWorkEmployeeList.Exception.EmployeeStorageIsFullException;
import pro.sky.HomeWorkEmployeeList.Interface.EmployeeInterface;
import pro.sky.HomeWorkEmployeeList.Model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeInterface {

    public final int NUMBER_OF_EMPLOYEES = 10;

    private final List<Employee> employeesList;

    public EmployeeServiceImpl() {
        this.employeesList = new ArrayList<>();
    }

    @Override
    public String add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);

        if(employeesList.size() > NUMBER_OF_EMPLOYEES) {
            throw new EmployeeStorageIsFullException("Превышен лимит количества сотрудников");
        }

        if(employeesList.contains(employee)) {
            throw new EmployeeNotFoundException("уже есть такой сотрудник");
        }
        employeesList.add(employee);
        return employeesList.toString();
    }

    @Override
    public String remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if(employeesList.contains(employee)){
            employeesList.remove(employee);
        }
        return "Пользователь удален";
    }

    @Override
    public String find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        int items = 0;
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).equals(employee)) {
                items = i;
            } else {
                throw new EmployeeNotFoundException("Пользователь не найден");
            }
        }
        return employeesList.get(items).toString();
    }


    @Override
    public Collection<Employee> findAll(){
        return Collections.unmodifiableList(employeesList);
    }







}
