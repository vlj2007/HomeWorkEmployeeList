package pro.sky.HomeWorkEmployeeList.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HomeWorkEmployeeList.Interface.EmployeeInterface;
import pro.sky.HomeWorkEmployeeList.ServiceImpl.EmployeeServiceImpl;

@RestController
public class EmployeeController {

    private EmployeeInterface employeeInterface;
    private String firstName;
    private String lastName;

    public EmployeeController(EmployeeServiceImpl employeeServiceImpl){
        this.employeeInterface = employeeServiceImpl;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @GetMapping
    public String employee() {
        return "employee";
    }

    @GetMapping(path = "/employee/add")
    public String employeeAdd(@RequestParam(required = true) String firstName, @RequestParam(required = true) String lastName) {
        return " " + firstName + " " + lastName;
    }

    @GetMapping(path = "/employee/remove")
    public String employeeRemove(@RequestParam(required = true) String firstName, @RequestParam(required = true) String lastName) {
        return " " + firstName + " " + lastName;
    }

    @GetMapping(path = "/employee/find")
    public String employeeFind(@RequestParam(required = true) String firstName, @RequestParam(required = true) String lastName) {
        return " " + firstName + " " + lastName;
    }


}
