package WorkShopApplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInvoiceLine {

	@Test
	void test() {
		int cant = 2;
		double price=12.5;
		double correctLinePrice = cant * price;
		InvoiceLine ivl1=new InvoiceLine();
		Product product = new Product(1, "manzana", 12.3,60);
		Ivl1.s;	
		
		assertEquals(correctLinePrice, Ivl1.calculateImport(Prod.))
	}

}
