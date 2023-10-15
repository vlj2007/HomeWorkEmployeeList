package pro.sky.HomeWorkEmployeeList.ServiceImpl;

import org.springframework.stereotype.Service;
import pro.sky.HomeWorkEmployeeList.Interface.EmployeeInterface;
import pro.sky.HomeWorkEmployeeList.Model.Employee;

import java.util.ArrayList;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeInterface {







    @Override
    public String employeeAdd() {
        return "<center><b> Добро пожаловать в калькулятор </b></center>";
    }

    @Override
    public String employeeRemove() {
        return "<center><b> Добро пожаловать в калькулятор </b></center>";
    }


    @Override
    public String employeeFind() {
        return "<center><b> Добро пожаловать в калькулятор </b></center>";
    }

}
