package com.nisum.igniterepodemo;

import com.nisum.igniterepodemo.config.IgniteConfig;
import com.nisum.igniterepodemo.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IgniteRepoDemoApplication {

    private static EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        //igniteSpringDataInit();
        SpringApplication.run(IgniteRepoDemoApplication.class, args);
    }

   /* private static void igniteSpringDataInit() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // Explicitly registering Spring configuration.
        ctx.register(IgniteConfig.class);
        ctx.refresh();
        employeeRepository = ctx.getBean(EmployeeRepository.class);
    }*/

}
