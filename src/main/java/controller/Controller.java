package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.collections.Employee;
import service.EmployeeService;

@RestController
public class Controller {
    private final EmployeeService employeeService;

    public Controller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/employee/add")
    public String addEmployee(@RequestParam("firstName") String firstName,@RequestParam("LastName") String lastName) {
        final String employee;
        Employee e = new Employee(
                firstName,
        lastName
        );
         employeeService.addEmployee(String firstName, String lastName);
        return "firstName";
}
}
