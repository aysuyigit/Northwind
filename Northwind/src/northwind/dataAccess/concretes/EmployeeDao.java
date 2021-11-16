package northwind.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import northwind.dataAccess.abstracts.EmployeeRepository;
import northwind.entities.concretes.Employee;
import northwind.entities.concretes.Product;

public class EmployeeDao implements EmployeeRepository {
    List<Employee> employee;
	
	public EmployeeDao() {
		employee = new ArrayList<Employee>();
		
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
