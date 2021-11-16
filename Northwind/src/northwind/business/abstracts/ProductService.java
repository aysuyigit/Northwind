package northwind.business.abstracts;

import java.util.List;

import northwind.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
    List<Product> getAll();
    

}
