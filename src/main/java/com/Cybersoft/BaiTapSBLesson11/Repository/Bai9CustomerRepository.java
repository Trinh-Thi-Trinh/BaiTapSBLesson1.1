package com.Cybersoft.BaiTapSBLesson11.Repository;

import com.Cybersoft.BaiTapSBLesson11.Entity.Bai9Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class Bai9CustomerRepository {

    private final List<Bai9Customer> customers = new ArrayList<>();

    public Bai9CustomerRepository() {
        customers.add(new Bai9Customer(1, "Nguyen Van An", "0901234567"));
        customers.add(new Bai9Customer(2, "Tran Thi Binh", "0902345678"));
        customers.add(new Bai9Customer(3, "Le Van Cuong", "0903456789"));
    }

    public List<Bai9Customer> findAll() {
        return customers;
    }

    public Optional<Bai9Customer> findById(int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst();
    }

    public Bai9Customer save(Bai9Customer customer) {
        customers.add(customer);
        return customer;
    }
}