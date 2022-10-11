package oop1;

public class Main {

	public static void main(String[] args) {
		
		//set value
		Product product1 = new Product();
		product1.setName("Kahve Makinesi 1");
		product1.setUnitPrice(6500);
		product1.setDiscount(7);
		product1.setImageUrl("bilinmiyor.jpg");
		product1.setUnitsInStock(3);
		
		//get
		//System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.setName("Kahve Makinesi 2");
		product2.setUnitPrice(4500);
		product2.setDiscount(5);
		product2.setImageUrl("bilinmiyor2.jpg");
		product2.setUnitsInStock(4);
		
		
		Product product3 = new Product();
		product3.setName("Kahve Makinesi 1");
		product3.setUnitPrice(7500);
		product3.setDiscount(10);
		product3.setImageUrl("bilinmiyor3.jpg");
		product3.setUnitsInStock(5);
		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for(Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(11111);
		individualCustomer.setCustomerNumber("1");
		individualCustomer.setPhone("5888888888");
		individualCustomer.setFirstName("Abdulla");
		individualCustomer.setLastName("Yigit");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(11112);
		corporateCustomer.setCustomerNumber("2");
		corporateCustomer.setCompanyName("Best Coffee");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setPhone("5120000");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
