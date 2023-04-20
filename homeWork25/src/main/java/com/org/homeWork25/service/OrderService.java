package com.org.homeWork25.service;

import com.org.homeWork25.entity.Order;

import java.util.List;

public interface OrderService {
    Order getById(Long id);

    List<Order> getAll();
}
