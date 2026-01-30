package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.service.CustomerService;

public class CustomerServiceImplArraylist implements CustomerService {
    private static final List<Customers> customerList = new ArrayList<>();

    public List<Customers> getAllCustomers() throws SQLException{
        return customerList;
    }
    public int addCustomer(Customers customers) throws SQLException{
        customerList.add(customers);
        return customerList.size();
    }
    public List<Customers> getAllCustomersSortedByName() throws SQLException{
        Collections.sort(customerList);
        return customerList;
    }
    public void emptyArrayList(){
        customerList.clear();
    }

}