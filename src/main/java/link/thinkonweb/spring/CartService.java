package link.thinkonweb.spring;

import java.util.List;

import link.thinkonweb.spring.Product;
import link.thinkonweb.spring.ShoppingCart;

public interface CartService {
	
	ShoppingCart getShoppingCart();
	
	List<Product> getProducts();
	
	List<Product> getRecommendations();
	
	Product getProduct(long productId);
	
	List<String> getShippingOptions();
	
	void submitOrderForPayment();
}
