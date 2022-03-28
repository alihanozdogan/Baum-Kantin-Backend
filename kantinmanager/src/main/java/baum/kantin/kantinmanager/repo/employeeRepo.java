package baum.kantin.kantinmanager.repo;

import baum.kantin.kantinmanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface employeeRepo extends JpaRepository<Employee,Long> {
        void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);

}
