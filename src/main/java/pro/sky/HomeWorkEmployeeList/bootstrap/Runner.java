package pro.sky.HomeWorkEmployeeList.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pro.sky.HomeWorkEmployeeList.Model.Employee;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = List.of(
                new Employee("Влад", "Волков"),
                new Employee("Артем", "Верблюдов"),
                new Employee("Людмила", "Иванова"),
                new Employee("Игорь", "Криштоп"),
                new Employee("Павел", "Носков"),
                new Employee("Иван", "Могиш")
        );


    }
}
