package northwind.business.abstracts;
import java.util.List;
import java.util.Locale.Category;

public interface CategoryService {
	void add(Category category);
	List<Category> getAll();
	

}
