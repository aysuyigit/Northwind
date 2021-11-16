package northwind.dataAccess.abstracts;

import java.util.List;

import northwind.entities.concretes.Product;

public interface DaoRepository<T> {
	void add(T entity);
	void delete(T entity);
	void update(T entity);
	Product getById(int id);
	List<T> getAll();

}
