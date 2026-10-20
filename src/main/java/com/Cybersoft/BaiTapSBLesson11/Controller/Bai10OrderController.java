package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Entity.Bai10Order;
import com.Cybersoft.BaiTapSBLesson11.Service.Bai10OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class Bai10OrderController {

    private final Bai10OrderService orderService;

    public Bai10OrderController(Bai10OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Bai10Order> createOrder(
            @RequestBody Bai10Order order) {

        Bai10Order savedOrder = orderService.createOrder(order);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedOrder);
    }

    @GetMapping
    public List<Bai10Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}