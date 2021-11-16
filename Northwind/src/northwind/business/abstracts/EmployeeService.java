package northwind.business.abstracts;

import java.util.List;

import northwind.entities.concretes.Employee;
import northwind.entities.concretes.Product;

public interface EmployeeService {
	void add(Employee employee);
    List<Employee> getAll();

}
