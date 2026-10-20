package com.Cybersoft.BaiTapSBLesson11.Service;

import com.Cybersoft.BaiTapSBLesson11.Entity.Bai9Customer;
import com.Cybersoft.BaiTapSBLesson11.Repository.Bai9CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Bai9CustomerService {

    private final Bai9CustomerRepository customerRepository;

    public Bai9CustomerService(Bai9CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Bai9Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Bai9Customer> getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    public Bai9Customer createCustomer(Bai9Customer customer) {
        return customerRepository.save(customer);
    }
}