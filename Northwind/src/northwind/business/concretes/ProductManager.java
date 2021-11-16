package northwind.business.concretes;

import java.util.List;
import java.util.Locale.Category;

import northwind.business.abstracts.ProductService;
import northwind.dataAccess.abstracts.ProductRepository;
import northwind.entities.concretes.Product;

public class ProductManager implements ProductService {
	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public void add(Product product) {

		if (checkFirstName(product)) {
			System.out.println("Ekleme yapılmadı");
		} else if (checkCategory(product)) {
			System.out.println("Ekleme yapılmadı.Sayı aşıldı.");

		} else if (checkUnitPrice(product)) {
			System.out.println("Ekleme yapılmadı.");

		} else {
			this.productRepository.add(product);
			System.out.println("Ekleme yapıldı." + product.getProduductName());
		}
	}

	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepository.getAll();
	}

	private boolean checkFirstName(Product productName) {
		for (Product iteProduct : productRepository.getAll()) {
			if (iteProduct.getProduductName().equals(productName.getProduductName())) {
				return true;
			}
		}
		return false;
	}
	

	private boolean checkCategory(Product product) {
		int count = 0;
		for (Product iteProduct : productRepository.getAll()) {
			if (iteProduct.getCategoryId() == product.getCategoryId()) {
				count++;
			}
		}
		if (count < 5) {
			return false;
		}
		return true;
	}

	private boolean checkUnitPrice(Product product) {

		if (product.getUnitPrice() < 0) {
	     	return true;
		}
		if (product.getCategoryId() == 3) {
			if (product.getUnitPrice() < 10) {
				return true;
			}
		}
		return false;
	}

}
