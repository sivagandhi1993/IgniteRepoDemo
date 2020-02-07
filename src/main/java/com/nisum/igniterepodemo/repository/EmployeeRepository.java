package com.nisum.igniterepodemo.repository;

import com.nisum.igniterepodemo.model.Employee;
import com.nisum.igniterepodemo.model.EmployeeDetails;
import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.Query;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "igniteCache")
public interface EmployeeRepository extends IgniteRepository<Employee, Integer> {

    Employee getEmployeeDTOById(Integer id);

    /*@Query("SELECT *" +
            "FROM EmployeeDetails\n" +
            "INNER JOIN Employee ON EmployeeDetails.id=Employee.id;")
    EmployeeDetails getEmployeeDetialsBasedOnId(Integer id);
*/
}
