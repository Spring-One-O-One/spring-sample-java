package com.pluralsight.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Value("${dbPassword}")
    private String dbPassword;

    @Override
    public List<Customer> findAll() {
        System.out.println("dbUsername: " + dbUsername);
        System.out.println("dbPassword: " + dbPassword);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Will");
        customer.setLastName("Mallett");

        customers.add(customer);

        return customers;
    }

}
