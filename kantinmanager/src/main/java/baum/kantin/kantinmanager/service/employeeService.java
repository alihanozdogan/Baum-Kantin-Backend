package baum.kantin.kantinmanager.service;

import baum.kantin.kantinmanager.exceptions.EmployeeNotFoundException;
import baum.kantin.kantinmanager.model.Employee;
import baum.kantin.kantinmanager.repo.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class employeeService {
    public final employeeRepo employeeRepo;

    @Autowired
    public employeeService(employeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("User by id " + id + " was not found"));
    }
}
