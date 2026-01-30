package com.edutech.progressive.dao;

import java.sql.SQLException;
import java.util.List;

import com.edutech.progressive.entity.Transactions;

public interface TransactionDAO {
    public List<Transactions> getAllTransactions();
    public Transactions getTransactionById(int transactionId);
    public int addTransaction(Transactions transaction);
    public void updateTransaction(Transactions transaction);
    public void deleteTransaction(int transactionId) ;
    
}
