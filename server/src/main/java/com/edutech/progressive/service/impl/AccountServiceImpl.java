package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.AccountDAO;
import com.edutech.progressive.dao.AccountDAOImpl;
import com.edutech.progressive.entity.Accounts;

public class AccountServiceImpl  {
    private AccountDAO accountDAO;
    public AccountServiceImpl(AccountDAOImpl accountDAO){
        accountDAO = new AccountDAOImpl();
    }
    public List<Accounts> getAllAccounts() throws SQLException{
        List<Accounts> list = new ArrayList<>();
        return list;
    }
    public int addAccount(Accounts accounts){
        return -1;
    }
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException{
        List<Accounts> list = new ArrayList<>();
        return list;
    }
    public List<Accounts> getAccountsByUser(int userId) throws SQLException{
        return null;
    }
    public Accounts getAccountsById(int accountId) throws SQLException{
        return null;
    }
    public void deleteAccount(int accountId) throws SQLException{
        
    }

}