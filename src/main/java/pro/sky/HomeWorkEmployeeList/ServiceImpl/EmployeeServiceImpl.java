package pro.sky.HomeWorkEmployeeList.ServiceImpl;

import org.springframework.stereotype.Service;
import pro.sky.HomeWorkEmployeeList.Exception.EmployeeAlreadyAddedException;
import pro.sky.HomeWorkEmployeeList.Exception.EmployeeNotFoundException;
import pro.sky.HomeWorkEmployeeList.Exception.EmployeeStorageIsFullException;
import pro.sky.HomeWorkEmployeeList.Interface.EmployeeInterface;
import pro.sky.HomeWorkEmployeeList.Model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeInterface {

    List<Employee> employeesList = new ArrayList<>();


    @Override
    public String employeeAdd(String firstName, String lastName) {
        Employee PersonAnother = new Employee(firstName, lastName);
        if(employeesList.size() > 10) {
            throw new EmployeeStorageIsFullException("Превышен лимит количества сотрудников");
        }
        for(int i = 0; i < employeesList.size(); i++){
            if(employeesList.get(i).equals(PersonAnother)){
                throw new EmployeeAlreadyAddedException("в коллекции уже есть такой сотрудник");
            }
        }
        employeesList.add(PersonAnother);
        return "Сотрудник " + employeesList.toString() + " добавлен";
    }

    @Override
    public String employeeRemove(String firstName, String lastName) {
        Employee PersonAnother = new Employee(firstName, lastName);
        if(employeesList.contains(PersonAnother)){
            employeesList.remove(PersonAnother);
        }
        return "Пользователь удален";
    }

    @Override
    public String employeeFind(String firstName, String lastName) {
        Employee PersonAnother = new Employee(firstName, lastName);
        int items = 0;
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).equals(PersonAnother)) {
                items = i;
            } else {
                throw new EmployeeNotFoundException("Пользователь не найден");
            }
        }
        return employeesList.get(items).toString();
    }




}
