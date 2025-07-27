package com.JPAIntro.JPATutorial.JpaTuts.repositories;

import com.JPAIntro.JPATutorial.JpaTuts.entities.ProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    List<ProductEntity> findByOrderByPrice();
    List<ProductEntity> findBy(Sort sortby);

  //  List<ProductEntity> findByCreatedAtAfter(LocalDateTime after);

    List<ProductEntity> findByQuantityAndPrice(int quantity, BigDecimal price);
   // Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);

    @Query("select e from ProductEntity e where e.title=?1 and e.price=?2" ) //JPQL define, for safe against SQL Injection
    Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);
}
