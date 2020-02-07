package com.nisum.igniterepodemo.config;

import com.nisum.igniterepodemo.model.Employee;
import com.nisum.igniterepodemo.repository.EmployeeRepository;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableIgniteRepositories(basePackageClasses = EmployeeRepository.class)
@ComponentScan(basePackages = "com.nisum.igniterepodemo.repository")
public class IgniteConfig {
    @Bean
    public Ignite igniteInstance() {
        IgniteConfiguration config = new IgniteConfiguration();
        CacheConfiguration cache = new CacheConfiguration("igniteCache");
        cache.setIndexedTypes(Integer.class, Employee.class);
        config.setCacheConfiguration(cache);
        return Ignition.start(config);
    }
}
