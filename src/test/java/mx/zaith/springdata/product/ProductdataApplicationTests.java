package mx.zaith.springdata.product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mx.zaith.springdata.product.entities.Product;
import mx.zaith.springdata.product.repo.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductdataApplicationTests {

	@Autowired
	private ProductRepository productRepo;
	
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreate()
	{
		Product producto = new Product(); 
		producto.setId(1);
		producto.setName("cel");
		producto.setDesc("new");
		producto.setPrice(85.00d);
		
		productRepo.save(producto);
	}
	
	@Test
	public void testRead() {
		
		Optional<Product> finding = productRepo.findById(1);
		Product producto = finding.get();
		assertNotNull(finding);
		assertEquals("cel", producto.getName());
		assertEquals("new", producto.getDesc());
		assertEquals(85, producto.getPrice(), 1);
	}
	
	@Test
	public void testUpdate() {
		
		Optional<Product> finding = productRepo.findById(1);
		Product resuelto = finding.get();
		if(finding != null)
		{
			Product producto = resuelto;
			producto.setId(1);
			producto.setPrice(85.0);
			productRepo.save(producto);
		}

		
	}
}
