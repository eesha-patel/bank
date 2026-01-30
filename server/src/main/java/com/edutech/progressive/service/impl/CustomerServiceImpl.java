package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.CustomerDAO;
import com.edutech.progressive.dao.CustomerDAOImpl;
import com.edutech.progressive.entity.Customers;

public class CustomerServiceImpl {
    private CustomerDAO customerDAO;
    public CustomerServiceImpl(CustomerDAOImpl customerDAO){
        customerDAO = new CustomerDAOImpl();
    }
    public List<Customers> getAllCustomers() throws SQLException{
        List<Customers> customerlist = new ArrayList<>();
        return customerlist;
    }
    public int addCustomer(Customers customers) throws SQLException{
        return -1;
    }
    public List<Customers> getAllCustomerSortedByName() throws SQLException{
        List<Customers> list = new ArrayList<>();
        return list;
    }
    public void updateCustomer(Customers customers) throws SQLException{

    }
    public void deleteCustomer(int customerId) throws SQLException{

    }
    public Customers getCustomerById(int customerId) throws SQLException{
        return null;
    }

}