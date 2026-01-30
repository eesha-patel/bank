package com.edutech.progressive.dao;


import java.util.List;

import com.edutech.progressive.entity.Accounts;

public interface AccountDAO {
    public List<Accounts> getAllAccounts();
    public List<Accounts> getAllAccountsByCustomer(int customer_id);
    public Accounts getAccountById(int accountId);
    public int addAccount(Accounts accounts);    
    public void updateAccount(Accounts accounts);
    public void deleteAccount(int accountId);
    
}