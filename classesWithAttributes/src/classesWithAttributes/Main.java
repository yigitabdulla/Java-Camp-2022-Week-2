package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product2 = new Product(2,"Laptopp","Acer",2500,5);
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5500);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
	}

}
