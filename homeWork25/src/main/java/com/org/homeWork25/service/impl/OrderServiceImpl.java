package com.org.homeWork25.service.impl;

import com.org.homeWork25.entity.Order;
import com.org.homeWork25.repository.OrderRepository;
import com.org.homeWork25.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<Order> getAll() {
        return (List<Order>) orderRepository.findAll();
    }
}
