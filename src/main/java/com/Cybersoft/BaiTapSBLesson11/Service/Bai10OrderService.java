package com.Cybersoft.BaiTapSBLesson11.Service;

import com.Cybersoft.BaiTapSBLesson11.Entity.Bai10Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Bai10OrderService {

    private final List<Bai10Order> orders = new ArrayList<>();

    public Bai10Order createOrder(Bai10Order order) {
        orders.add(order);
        return order;
    }

    public List<Bai10Order> getAllOrders() {
        return orders;
    }
}