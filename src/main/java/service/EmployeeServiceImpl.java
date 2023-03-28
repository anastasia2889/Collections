package service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.collections.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employee = new ArrayList<>(List.of(
            new Employee("Ivan",
                    "Ivanov "),
            new Employee("Sergey ",
                    "Sergeev "),
            new Employee("Lubov ",
                    "Nazarova "),
            new Employee("Konstantin",
                    "Sidorov "),
            new Employee(" Sergey",
                    "Petrov  "),
            new Employee(" Vasiliy",
                    "Kostin  "),
            new Employee(" Evgeniy",
                    " Emeluanov "),
            new Employee(" Galina",
                    "Sorokina "),
            new Employee(" Svetlana",
                    "Eleseeva "),
            new Employee(" Raisa",
                    "Tarasova ")
    ));

 @Override

     public void addEmployee(String firstName, String lastName) {
        employee.add(employee);

    }
}
