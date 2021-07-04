import java.util.List;
import java.util.stream.Stream;

enum Color { 	RED, GREEN, BLUE; }
enum Size { SMALL, MEDIUM, LARGE, XLARGE; }

class Product {
	public String name;
	public Color color;
	public Size size;
	
	public Product(String name, Color color, Size size) {
		this.name = name;
		this.color = color;
		this.size = size;
	} 
}

class ProductFilter {
	public Stream<Product> filterByColor(List<Product> products, Color color) {
		return products.stream().filter(p -> p.color == color);
	}
	
	public Stream<Product> filterBySize(List<Product> products, Size size) {
		return products.stream().filter(p -> p.size == size);
	}
	
	public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) { 
		return products.stream().filter(p -> p.size == size && p.color == color);
	}
}


public class DesignPatternByExample {
	
	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.RED, Size.SMALL); 
		Product orange = new Product("Orange", Color.RED, Size.SMALL);
		Product house = new Product("House", Color.BLUE, Size.XLARGE);
		
		ProductFilter pf = new ProductFilter();
		List<Product> productList = List.of(apple, orange, house);
		pf.filterByColor(productList, Color.RED).forEach(p -> System.out.println("Product : " + p.name + " is " + p.color));
		pf.filterBySize(productList, Size.XLARGE).forEach(p -> System.out.println("Product : " + p.name + " is " + p.color));
		
	}

	
}
