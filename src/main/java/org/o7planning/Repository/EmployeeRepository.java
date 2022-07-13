package  org.o7planning.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import  org.o7planning.Model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	
	
	
	
}