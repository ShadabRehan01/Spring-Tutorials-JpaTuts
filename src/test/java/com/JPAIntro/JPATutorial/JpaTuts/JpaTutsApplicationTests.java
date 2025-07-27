package com.JPAIntro.JPATutorial.JpaTuts;

import com.JPAIntro.JPATutorial.JpaTuts.entities.ProductEntity;
import com.JPAIntro.JPATutorial.JpaTuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaTutsApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository(){
		ProductEntity productEntity=ProductEntity.builder()
				.sku("nestle234")
				.title("Nestle Chocolate")
				.price(BigDecimal.valueOf(25.45))
				.quantity(7)
				.build();
		ProductEntity savedProductEntity=productRepository.save(productEntity);
		System.out.println(savedProductEntity);
	}
	@Test
	void getRepository(){
		/*List<ProductEntity> entities=productRepository.findAll();
		System.out.println(entities);*/

		/*List<ProductEntity> entities=productRepository.findByTitle("Pepsi");
		System.out.println(entities);*/

		/*List<ProductEntity> entities=productRepository.findByCreatedAtAfter(
				LocalDateTime.of(2025, 1,1,0,0));
		System.out.println(entities);*/

		List<ProductEntity> fqp=productRepository.findByQuantityAndPrice(7,BigDecimal.valueOf(25.45));
		System.out.println(fqp);

	}
	@Test
	void getSingleFromRepository(){
		Optional<ProductEntity> ftp=productRepository
				.findByTitleAndPrice("Pepsi", BigDecimal.valueOf(14.4));
		ftp.ifPresent(System.out::println);
	}
}
