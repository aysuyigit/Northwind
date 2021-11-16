package northwind.business.concretes;

import java.util.List;

import northwind.dataAccess.abstracts.EmployeeRepository;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Employee;
import northwind.entities.concretes.Product;

public class EmployeeManager implements EmployeeRepository {
	private EmployeeRepository employeeRepository;

	public EmployeeManager(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Employee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
