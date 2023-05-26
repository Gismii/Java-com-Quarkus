package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;
import org.acme.entity.Customer;
import org.acme.service.CustomerService;

@Path("/api/customer")
public class CustomerController {

    @Inject
    CustomerService customerService; //podemos utilizar os emtodos criados na camada service;

    @GET
    public List<Customer> retriveCustomers(){

        List<Customer> customers = new ArrayList<>();

        try {
            customers = customerService.findAllCustomers();

        } catch ( Exception e){

            e.printStackTrace();
        }

        return customers;
    }

    @POST
    @Transactional
    public void addCustomer(Customer customer){

        customerService.addCustomer(customer);
    }



}
