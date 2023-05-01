package com.UST.Employee.Service;

import com.UST.Employee.Entity.Employee;
import com.UST.Employee.Repository.Emprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmpService {

    @Autowired
    public Emprepo repo;

    public Employee addNewEmp(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAllEmpss() {
        return repo.findAll();
    }

    public Employee getEmpsByempId(String empId) {
        return repo.findByempId(empId);
    }

    @Transactional
    public String deleteEmpsByempId(String empId) {
        repo.deleteByempId(empId);
        return "Employee Deleted...";
    }
}
