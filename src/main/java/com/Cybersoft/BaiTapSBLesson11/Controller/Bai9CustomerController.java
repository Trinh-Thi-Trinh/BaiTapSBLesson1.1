package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Entity.Bai9Customer;
import com.Cybersoft.BaiTapSBLesson11.Service.Bai9CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bai9/customers")
public class Bai9CustomerController {

    private final Bai9CustomerService customerService;

    public Bai9CustomerController(Bai9CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Bai9Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bai9Customer> getCustomerById(
            @PathVariable int id) {

        return customerService.getCustomerById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Bai9Customer> createCustomer(
            @RequestBody Bai9Customer customer) {

        Bai9Customer savedCustomer = customerService.createCustomer(customer);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomer);
    }
}