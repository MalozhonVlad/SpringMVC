package com.vebinar.dao;

import com.vebinar.entity.User;
import com.vebinar.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao{

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void save(User user) {
        String sql = "INSERT INTO user (name, emeil, age) VALUES (?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getEmeil(),user.getAge());

    }

    public User getById(int id) {

        String sql= "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql,new UserMapper(),id);
    }

    public void delete(int id) {
        String sql = "DELETE from user WHERE id=?";
        jdbcTemplate.update(sql,id);
    }

    public void update(User user) {
        String sql = "UPDATE user SET name=?, emeil=?, age=? WHERE id=?";
        jdbcTemplate.update(sql, user.getName(),user.getEmeil(),user.getAge(), user.getId());
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql,new UserMapper());
    }
}
