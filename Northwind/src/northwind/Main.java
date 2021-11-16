package northwind;

import northwind.business.abstracts.EmployeeService;
import northwind.business.abstracts.ProductService;
import northwind.business.concretes.EmployeeManager;
import northwind.business.concretes.ProductManager;
import northwind.dataAccess.concretes.EmployeeDao;
import northwind.dataAccess.concretes.ProductDao;
import northwind.entities.concretes.Employee;
import northwind.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		ProductService productService = new ProductManager(new ProductDao());
		productService.add(new Product(1,1,"Elma",10));
		productService.add(new Product(2,1,"aa",20));
		productService.add(new Product(3,1,"bb",-5));
		productService.add(new Product(4,3,"cc",1));
		productService.add(new Product(5,1,"Elma",50));
		
		
		for (Product product : productService.getAll()) {
			System.out.println(product.getProduductName());
		}
		
		EmployeeService employeeService = (EmployeeService) new EmployeeManager(new EmployeeDao());
		employeeService.add(new Employee(1,"Test","Employee","İstanbul"));
		
		

	}

}
