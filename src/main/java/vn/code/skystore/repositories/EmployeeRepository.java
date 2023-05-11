package vn.code.skystore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.code.skystore.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
