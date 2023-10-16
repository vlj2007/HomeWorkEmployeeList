package pro.sky.HomeWorkEmployeeList.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HomeWorkEmployeeList.Interface.EmployeeInterface;
import pro.sky.HomeWorkEmployeeList.Model.Employee;
import pro.sky.HomeWorkEmployeeList.ServiceImpl.EmployeeServiceImpl;

@RestController
public class EmployeeController {

    private final EmployeeInterface employeeInterface;

    public EmployeeController(EmployeeInterface employeeInterface){
        this.employeeInterface = employeeInterface;

    }

    @GetMapping(path = "/employee/add")
    public String employeeAddName(@RequestParam(required = true) String firstName,
                              @RequestParam(required = true) String lastName) {
        return employeeInterface.employeeAdd(firstName, lastName);
    }

    @GetMapping(path = "/employee/remove")
    public String employeeRemoveName(@RequestParam(required = true) String firstName,
                                 @RequestParam(required = true) String lastName) {
        return employeeInterface.employeeRemove(firstName, lastName);
    }

    @GetMapping(path = "/employee/find")
    public String employeeFindName(@RequestParam(required = true) String firstName,
                               @RequestParam(required = true) String lastName) {
        return employeeInterface.employeeFind(firstName, lastName);
    }






}
