package com.testone.testone.Services;

import antlr.collections.List;
import com.testone.testone.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository=customerRepository;
    }
    public List<Customers> getCustomers()
    {
        return CustomerRepository.findAll();
    }
}
