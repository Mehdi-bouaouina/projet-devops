package mehdi_bouaouina.overtime.Repository;

import mehdi_bouaouina.overtime.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
}
