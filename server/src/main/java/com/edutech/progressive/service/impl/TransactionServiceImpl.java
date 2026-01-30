package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.entity.Transactions;

public class TransactionServiceImpl {
    public List<Transactions> getAllTransactions() throws SQLException{
        List<Transactions> list = new ArrayList<>();
        return list;
    }
    public Transactions getTransactionById(int transactionId) throws SQLException{
        return null;
    }
    public int addTransaction(Transactions transactions) throws SQLException{
        return -1;
    }
    public void updateTransaction(Transactions transactions) throws SQLException{

    }
    public void deleteTransactions(int transactionId) throws SQLException{

    }
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException{
        return null;
    }
    
}