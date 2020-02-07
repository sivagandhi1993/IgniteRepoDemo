package com.nisum.igniterepodemo.controller;

import com.nisum.igniterepodemo.config.IgniteConfig;
import com.nisum.igniterepodemo.model.Employee;
import com.nisum.igniterepodemo.model.EmployeeDetails;
import com.nisum.igniterepodemo.repository.EmployeeRepository;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.ignite.IgniteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class IgniteController {
    @Autowired
    private EmployeeRepository employeeRepository;

   /* private void igniteSpringDataInit() throws IgniteException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // Explicitly registering Spring configuration.
        ctx.register(IgniteConfig.class);
        ctx.refresh();
        employeeRepository = ctx.getBean(EmployeeRepository.class);
    }
*/
    @GetMapping("/getFromIgnite")
    public List<Employee> getAllEmployee() {
        List<Employee> allEmployees = new ArrayList<>();
        employeeRepository.findAll().forEach(allEmployees::add);
        return allEmployees;
    }
    @PostMapping("/saveEmployee")
    public void saveAnEmployee(@RequestBody Employee employeeRequest) {
        //igniteSpringDataInit();
        employeeRepository.save(1, employeeRequest);
    }

  /*  @PostMapping("/saveEmployee")
    public void saveAnEmployeeDetail(@RequestBody Employee employeeRequest) {
        employeeRepository.save(1, employeeRequest);
    }*/
}
