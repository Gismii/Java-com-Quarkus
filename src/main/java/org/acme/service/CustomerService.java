package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import org.acme.entity.Customer;
import org.acme.repository.CustomerRepository;

@ApplicationScoped
public class CustomerService {
    @Inject
    CustomerRepository customerRepository;

    public List<Customer> findAllCustomers(){
       return customerRepository.findAll().list();
    }

    public void addCustomer(Customer customer){

        customerRepository.persist(customer);
    }



}
