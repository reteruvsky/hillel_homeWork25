package com.org.homeWork25.repository;

import com.org.homeWork25.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Component
public interface OrderRepository extends CrudRepository<Order, Long> {

}
