package com.UST.Employee.Repository;


import com.UST.Employee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Emprepo extends JpaRepository<Employee,String> {
    Employee findByempId(String empid);

    void deleteByempId(String empId);
}
