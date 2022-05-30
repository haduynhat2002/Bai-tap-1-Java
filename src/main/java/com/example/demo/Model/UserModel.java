package com.example.demo.Model;

import com.example.demo.entity.Account;
import com.example.demo.entity.User;

import java.util.List;

public interface UserModel {
    boolean save(Account account);
    boolean update(int id, Account accountUpdate);
    boolean delete(int id);
    List<Account> findAll();
    Account findById(int id);
}
