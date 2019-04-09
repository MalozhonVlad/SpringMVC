package com.vebinar.dao;

import com.vebinar.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User getById(int id);

    void delete(int id);

    void update (User user);

    List<User> findAll();


}
