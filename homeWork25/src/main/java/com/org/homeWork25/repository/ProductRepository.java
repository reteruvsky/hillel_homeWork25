package com.org.homeWork25.repository;

import com.org.homeWork25.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
