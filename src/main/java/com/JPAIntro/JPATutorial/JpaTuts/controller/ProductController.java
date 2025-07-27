package com.JPAIntro.JPATutorial.JpaTuts.controller;

import com.JPAIntro.JPATutorial.JpaTuts.entities.ProductEntity;
import com.JPAIntro.JPATutorial.JpaTuts.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    private final int PAGE_SIZE=5;

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /*@GetMapping
    List<ProductEntity> getAllProduct(){
        return productRepository.findByOrderByPrice();
    }*/


   /* @GetMapping
    List<ProductEntity> getAllProduct(@RequestParam(defaultValue = "id") String sortBy){
       // return productRepository.findBy(Sort.by(Sort.Direction.DESC,sortBy,"Price"));
        return productRepository.findBy(Sort.by(
                Sort.Order.desc(sortBy),
                Sort.Order.asc("title")
        ));
        //if two item found on same quantity or price etc.then it will sort them based on title
    }*/



    //http://localhost:8080/products?sortBy=quantity&pageNumber=0
    @GetMapping
    List<ProductEntity> getAllProduct(
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "0")Integer pageNumber) {

        Pageable pageable= PageRequest.of(
                pageNumber,
                PAGE_SIZE,
                Sort.by(sortBy)
        );
        return productRepository.findAll(pageable).getContent();
    }
}