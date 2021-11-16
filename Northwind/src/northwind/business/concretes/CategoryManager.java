package northwind.business.concretes;

import java.util.List;
import java.util.Locale.Category;

import northwind.dataAccess.abstracts.CategoryRepository;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class CategoryManager implements CategoryRepository {
	private CategoryRepository categoryRepository;


	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Category entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Category entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
